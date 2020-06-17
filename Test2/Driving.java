package Test2;

public interface Driving {

    void drive();
    void stopDriving();

    void drive(int x, int y) throws CoordinatesException;
}
