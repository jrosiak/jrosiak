package TUT_4;

public class Product {

    private String name;
    private double price;
    private int productCode, amount;

    public Product (String name, double price, int productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.amount = 0;
    }

    public Product (String name, double price, int productCode, int amount) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void changeAmount(int newAmount){
        if(newAmount<0){
            throw new IllegalArgumentException("Price cannot be negative!");
        }else {
            this.amount = newAmount;
        }
    }

    public void changePrice(double newPrice){
        if(newPrice<0){
            throw new IllegalArgumentException("You don't want to give away money, do you?");
        }else {
            this.price = newPrice;
        }
    }

}
