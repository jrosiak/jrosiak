package TUT_9;

public class Main {
    public static void main(String[] args) {

        Car c = new Car(4);

        //Those two initially displayed start, later when i Overrid it displays start.1 and stop.1, I assume it should be like that
        c.start();
        c.stop();

        c.start();
        c.stop();

    }
}
