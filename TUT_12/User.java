package TUT_12;

public abstract class User {

    String name;
    String surname;

    public void assignAccount(BankAccount b){ }

    public void addClient(Client c) throws AccountOperationException { }

    public void openAccount(Client c) throws AccountOperationException { }

}
