package Test2;

public class Plane extends Vehicle implements Flying {

    private double maxSpeed;
    private boolean isFlying;

    public Plane(double tankCapacity, double loadingSpace, double maxSpeed) {
        super(tankCapacity, loadingSpace);
        this.maxSpeed=maxSpeed;
        isFlying=false;
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
        isFlying = true;
    }

    @Override
    public void fly(int x, int y) throws CoordinatesException{
        if(x<0||y<0){
            throw new CoordinatesException("Wrong coordinates, try to input ones above 0");
        }else {
            System.out.println("Driving to x:" + x + " y:" + y + "...");
            isFlying = true;
        }
    }
}
