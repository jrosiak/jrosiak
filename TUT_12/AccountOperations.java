package TUT_12;

public interface AccountOperations {

    void checkBalance();
    void transfer(BankAccount b) throws AccountOperationException;
    void payment() throws AccountOperationException;
    void addBalance(double d);
    void removeBalance(double d);
    void displayTransactions();
    Client getAccountOwner();

}
