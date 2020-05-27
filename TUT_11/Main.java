package TUT_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList();

        Car c1 = new Car("Ford Mustang", 1971);
        Car c2 = new Car("Dodge Challenger", 1969);
        Car c3 = new Car("Honda Civic", 2012);
        Car c4 = new Car("Chevrolet Camaro", 2007);
        Car c5 = new Car("Ferrari Italia", 2010);
        Car c6 = new Car("Toyota Supra", 2008);
        Car c7 = new Car("Subaru Impreza", 2000);
        Car c8 = new Car("Ford GT", 2018);
        Car c9 = new Car("Tesla Model S", 2019);
        Car c10 = new Car("Cybertruck", 2020);

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);
        cars.add(c10);

        Collections.sort(cars);

        for(Car c : cars){
            System.out.println(c);
        }

    }
}

