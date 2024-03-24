package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        BudgetHandler groupHandler=new GroupLeaderHandler();
        BudgetHandler managerHandler=new ManagerHandler();
        BudgetHandler cfoHandler=new CFOHandler();
        groupHandler.setNextHandler(managerHandler);
        managerHandler.setNextHandler(cfoHandler);

        groupHandler.handle(300);//request
//        小组领导批准

        groupHandler.handle(1000);
//        金额超过500，请经理批准
//        经理批准

        groupHandler.handle(6000);
//        金额超过500，请经理批准
//        金额超过2000，请CFO审核
//        CFO 批准

        groupHandler.handle(20000);
//        金额超过500，请经理批准
//        金额超过2000，请CFO审核
//        金额太大，不予批准
    }
}
