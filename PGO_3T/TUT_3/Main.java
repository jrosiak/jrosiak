package TUT_3;

public class Main {
    public static void main(String[] args) {

        Airplane a1 = new Airplane("Boeing", 500);
        Engine e1 = new Engine(2013, 25000);

        e1.isEngineEco();

    }
}
