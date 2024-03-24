package ChainOfResponsibility;

public class GroupLeaderHandler implements BudgetHandler{
    public BudgetHandler nextHandler;
    @Override
    public void setNextHandler(BudgetHandler handler) {
        nextHandler=handler;
    }

    @Override
    public boolean handle(int amount) {
        if(amount<=500){
            System.out.println("小组领导批准");
            return true;
        }else {
            System.out.println("金额超过500，请经理批准");
            return nextHandler.handle(amount);
        }
    }
}
