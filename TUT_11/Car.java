package TUT_11;

import java.util.ArrayList;

public class Car implements Comparable <Car> {

    private String name;
    private int productionYear;

    public Car (String name, int productionYear){
        this.name=name;
        this.productionYear=productionYear;
    }

    @Override
    public int compareTo(Car c) {
        return this.productionYear - c.productionYear;
    }

    @Override
    public String toString(){
        return name;
    }
}
