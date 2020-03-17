package Task2and3;

import java.util.Scanner;

public class Car {
    Scanner input = new Scanner(System.in);

    String brand;
    String color;
    double engine;

    public Car(String brand, String color, double engine){
        this.brand=brand;
        this.color=color;
        this.engine=engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void displayAppearance(){
        System.out.println("The vehicle is a "+color+" "+brand+".");
    }

    public void engineBoost(){
        System.out.println("If you fancy magically upgrading your engine capacity type the desired extention below");
        double extension = input.nextDouble();
        System.out.println("Upgrading your engine capacity.....");
        this.engine = engine + extension;
        System.out.println("Your "+brand+" now has a "+engine+" engine! :O");
    }

    public void isEngineHighSpeed(){
        if(engine>=2){
            System.out.println("Wow! Your "+brand+" has a high speed engine!");
        }else{
            System.out.println("Damn... this car is GARBAAAAAAGEEEE! :(");
        }
    }

}
