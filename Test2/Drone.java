package Test2;

public class Drone extends Vehicle implements VehicleMovement {

    private boolean isFlying;

    public Drone(double tankCapacity, double loadingSpace) {
        super(tankCapacity, loadingSpace);
        isFlying=false;
    }

    @Override
    public void drive() {}

    @Override
    public void stopDriving() {
        System.out.println("Stopping...");
    }

    @Override
    public void fly() {};

    @Override
    public void drive(int x, int y) throws CoordinatesException {
        if(x<0||y<0){
            throw new CoordinatesException("Wrong coordinates, try to input ones above 0");
        }else {
            System.out.println("Driving to x:" + x + " y:" + y + "...");
        }
    }

    @Override
    public void fly(int x, int y) throws CoordinatesException {
        if(x<0||y<0){
            throw new CoordinatesException("Wrong coordinates, try to input ones above 0");
        }else {
            System.out.println("Driving to x:" + x + " y:" + y + "...");
            isFlying = true;
        }
    }
}
