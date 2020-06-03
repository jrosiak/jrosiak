package TUT_12;

public class Transaction{

    private double amount;
    private String id;
    private static int TRANSACTION_COUNTER=0;
    private Client receiver;
    private Client sender;

    public Transaction(double amount, Client sender){
        this.sender=sender;
        this.amount=amount;
        id="T." + (TRANSACTION_COUNTER++ +1);
    }

    public Transaction(double amount, Client sender, Client reciever){
        this.amount=amount;
        this.receiver=reciever;
        this.sender=sender;
        id="T." + (TRANSACTION_COUNTER++ +1);
    }

    @Override
    public String toString(){
        if(receiver==null){
            return "["+ sender+"'s transaction] "+" Paid "+ amount + ", ID ["+id+"]";
        }
        return "["+ sender+"'s transaction] "+" Sent " + amount + " to " + receiver + ", ID ["+id+"]";
    }

}
