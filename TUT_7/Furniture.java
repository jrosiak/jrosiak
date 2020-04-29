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
        return price - (price * vat);
    }

    public double getPrice(boolean withVat) {
        if (withVat) {
            return price;
        }
        return price - (price * vat);
    }

    @Override
    public String toString(){
        return name;
    }

}
