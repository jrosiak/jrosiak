package Task1;

public class Telephone {

    String brand;
    double resolution;
    int number;
    String message;

    public Telephone(String brand, double resolution, int number, String message){

        this.brand = brand;
        this.resolution = resolution;
        this.number = number;
        this.message = message;

    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number=number;
    }

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message=message;
    }

    public void displayMessage(){
        System.out.println("Sent a message "+message+" to "+number);
    }

}
