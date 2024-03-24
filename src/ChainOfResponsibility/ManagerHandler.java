package ChainOfResponsibility;

public class ManagerHandler implements BudgetHandler{
    public BudgetHandler nextHandler;
    @Override
    public void setNextHandler(BudgetHandler handler) {
        nextHandler=handler;
    }

    @Override
    public boolean handle(int amount) {
        if(amount<=2000){
            System.out.println("经理批准");;
            return true;
        }else{
            System.out.println("金额超过2000，请CFO审核");
            return nextHandler.handle(amount);
        }
    }
}
