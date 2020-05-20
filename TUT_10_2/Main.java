package TUT_10_2;

interface Movable{

    void start();
    void stop();

}

public class Main {
    public static void main(String[] args) {

        Animal mruczek = new Cat("Mruczek");

        mruczek.start();
        System.out.println(mruczek.getType());
        mruczek.stop();


    }
}
