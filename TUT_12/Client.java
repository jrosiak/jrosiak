package TUT_12;

public class Client extends User {

    private String id;
    private static int CLIENT_COUNTER=0;
    private BankAccount b = new BankAccount(this);
    boolean hasAccount = false;

    public Client(String name, String surname){
        this.name=name;
        this.surname=surname;
        CLIENT_COUNTER++;
        id="C."+CLIENT_COUNTER;
    }

    public BankAccount getB(){
        if(hasAccount){
            return b;
        }else{
            return null;
        }
    }

    public String getName(){
        return name;
    }

    @Override
    public void assignAccount(BankAccount b){
        this.b=b;
    }

    @Override
    public String toString(){
        return name;
    }

}
