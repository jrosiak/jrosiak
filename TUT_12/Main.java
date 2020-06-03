package TUT_12;

public class Main {
    public static void main(String[] args) {

        //Creating objects
        Administrator a = new Administrator("Jan", "Kowalski");
        Employee e1 = new Employee("John", "Smith");
        Employee e2 = new Employee("Mathew", "George");
        Client c1 = new Client("Adam","Newman");
        Client c2 = new Client("Lucas","Lin");
        Client c3 = new Client("Will","Morgan");
        Client c4 = new Client("Alex","Carter");

        //Adding/Employing employees, if one of them is not employed it will throw an NullPointerException below because the program will try to assign a balace to non-existing accounts.
        a.addEmployee(e1);
        a.addEmployee(e2);

        //Trying to add clients based on whether the employee has the proper permission to do so
        try{
            e1.addClient(c1);
            e1.addClient(c2);
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        //Trying to add clients based on whether the employee has the proper permission to do so
        try{
            e2.addClient(c3);
            e2.addClient(c4);
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        //Trying to open an account based on whether the employee has the proper permission to do so
        try{
            e1.openAccount(c1);
            e1.openAccount(c2);
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        //Trying to open an account based on whether the employee has the proper permission to do so
        try{
            e2.openAccount(c3);
            e2.openAccount(c4);
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        //Adding money to clients bank accounts
        //If some of them do not have opened accounts, AccountOperationException displays proper instructions in "catch" fields above and NullPointerException ends program here
        c1.getB().addBalance(257);
        c2.getB().addBalance(376);
        c3.getB().addBalance(192);
        c4.getB().addBalance(461);


        //1st transaction
        try {
            c1.getB().transfer(c2.getB());
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        c1.getB().displayTransactions();
        c2.getB().displayTransactions();
        c3.getB().displayTransactions();
        c4.getB().displayTransactions();

        //2nd transaction
        try {
            c2.getB().payment();
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        c1.getB().displayTransactions();
        c2.getB().displayTransactions();
        c3.getB().displayTransactions();
        c4.getB().displayTransactions();

        //3rd transaction
        try {
            c3.getB().transfer(c2.getB());
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        c1.getB().displayTransactions();
        c2.getB().displayTransactions();
        c3.getB().displayTransactions();
        c4.getB().displayTransactions();

        //4th transaction
        try {
            c4.getB().payment();
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        c1.getB().displayTransactions();
        c2.getB().displayTransactions();
        c3.getB().displayTransactions();
        c4.getB().displayTransactions();

        //5th transaction
        try {
            c1.getB().transfer(c3.getB());
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        c1.getB().displayTransactions();
        c2.getB().displayTransactions();
        c3.getB().displayTransactions();
        c4.getB().displayTransactions();

        //6th transaction
        try {
            c2.getB().payment();
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        c1.getB().displayTransactions();
        c2.getB().displayTransactions();
        c3.getB().displayTransactions();
        c4.getB().displayTransactions();

        //7th transaction
        try {
            c3.getB().transfer(c2.getB());
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        c1.getB().displayTransactions();
        c2.getB().displayTransactions();
        c3.getB().displayTransactions();
        c4.getB().displayTransactions();

        //8th transaction
        try {
            c1.getB().payment();
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        c1.getB().displayTransactions();
        c2.getB().displayTransactions();
        c3.getB().displayTransactions();
        c4.getB().displayTransactions();

        //9th transaction
        try {
            c2.getB().transfer(c3.getB());
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        c1.getB().displayTransactions();
        c2.getB().displayTransactions();
        c3.getB().displayTransactions();
        c4.getB().displayTransactions();

        //10th transaction
        try {
            c3.getB().payment();
        }catch (AccountOperationException e){
            System.out.println(e.getMessage());
        }

        c1.getB().displayTransactions();
        c2.getB().displayTransactions();
        c3.getB().displayTransactions();
        c4.getB().displayTransactions();

    }
}
