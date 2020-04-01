package TUT_5;
import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products;

    public Category() {
        this.products=new ArrayList<>();
    }
    public Category(String name) {
        this.name=name;
        this.products=new ArrayList<>();
    }
    public Category(String name, ArrayList<Product> products) {
        this.name=name;
        this.products=products;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public int getNumberOfProducts(){ return products.size(); }
    public ArrayList<Product> getProducts() { return products; }
}


