package TUT_12;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount implements AccountOperations{

    private double balance = 0;
    private Client accountOwner;

    public BankAccount(Client accountOwner){
        this.accountOwner=accountOwner;
    }

    ArrayList<Transaction> transactions = new ArrayList<>();

    @Override
    public void checkBalance() {
        System.out.println("Your balance: "+ balance);
    }

    @Override
    public void transfer(BankAccount b) throws AccountOperationException{
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("[You began a transfer prodecure] Please provide the amount you wish to transfer");
        System.out.println(" ");
        double amount = scanner.nextDouble();

        if(amount>balance){
            throw new AccountOperationException("* You have insufficient funds to complete this transaction *");
        }else {
                transactions.add(new Transaction(amount, accountOwner, b.getAccountOwner()));
                b.addBalance(amount);
                removeBalance(amount);
                System.out.println(" ");
                System.out.println("Transfer completed, transaction has been registered");
                System.out.println(" ");
        }
    }

    @Override
    public void payment() throws AccountOperationException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("[You began a payment prodecure] Please enter the price of a product");
        System.out.println(" ");
        double amount = scanner.nextDouble();

        if(amount>balance){
            throw new AccountOperationException("* You have insufficient funds to complete this transaction *");
        }else {
            transactions.add(new Transaction(amount, accountOwner));
            removeBalance(amount);
            System.out.println(" ");
            System.out.println("Payment completed, transaction has been registered");
            System.out.println(" ");
        }
    }

    @Override
    public void addBalance(double d) {
            balance += d;
    }

    @Override
    public void removeBalance(double d) {
        balance-=d;
    }

    @Override
    public void displayTransactions() {
        for(Transaction t : transactions){
            System.out.println(t);
        }
    }

    @Override
    public Client getAccountOwner() {
        return accountOwner;
    }
}
