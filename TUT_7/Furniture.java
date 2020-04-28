package TUT_7;

public class Furniture extends Room{

    private final double vat=0.23;
    private String name;
    private double price;


    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getPrice(boolean withVat) {
        if (withVat) {
            return price - (price * vat);
        }
        return price;
    }

    @Override
    public String toString(){
        return name;
    }

}
