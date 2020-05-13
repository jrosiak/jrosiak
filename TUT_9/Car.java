package TUT_9;

public class Car extends Vehicle {

    protected int numberOfSteats;

    public Car(int numberOfSteats){
        this.numberOfSteats=numberOfSteats;
    }

    public int getNumberOfSteats() {
        return numberOfSteats;
    }

    @Override
    public void start(){
        System.out.println("start.1");
    }

    @Override
    public void stop(){
        System.out.println("stop.1");
    }

}
