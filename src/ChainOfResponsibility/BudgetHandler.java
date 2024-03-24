package ChainOfResponsibility;

public interface BudgetHandler {
    void setNextHandler(BudgetHandler handler);
    boolean handle(int amount);
}
