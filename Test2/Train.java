package Test2;

public class Train extends Vehicle implements Driving{

    public Train(double tankCapacity, double loadingSpace) {
        super(tankCapacity, loadingSpace);
    }

    @Override
    public void drive() {
        System.out.println("Driving...");
    }

    @Override
    public void stopDriving() {
        System.out.println("Stopping...");
    }

    @Override
    public void drive(int x, int y) throws CoordinatesException{
        if(x<0||y<0){
            throw new CoordinatesException("Wrong coordinates, try to input ones above 0");
        }else {
            System.out.println("Driving to x:" + x + " y:" + y + "...");
        }
    }
}
