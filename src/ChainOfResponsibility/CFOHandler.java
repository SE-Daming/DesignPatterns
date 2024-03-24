package ChainOfResponsibility;

public class CFOHandler implements BudgetHandler{
    public BudgetHandler nextHandler;
    @Override
    public void setNextHandler(BudgetHandler handler) {
        nextHandler=handler;
    }

    @Override
    public boolean handle(int amount) {
        if(amount<=10000){
            System.out.println("CFO 批准");
            return true;
        }
        if(nextHandler!=null){
            return nextHandler.handle(amount);
        }
        System.out.println("金额太大，不予批准");
        return false;
    }
}
