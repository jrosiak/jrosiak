package TUT_5;

import java.util.ArrayList;

public class Basket {
    private User user;
    private ArrayList<Product>products;
    private ArrayList<Product>itemsInBasket = new ArrayList<>();

    public Basket (){ }
    public Basket (User user){
        this.user=user;
    }
    public Basket (User user, ArrayList<Product>products){
        this.user=user;
        this.products=products;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addProduct(Product product) {
        if(itemsInBasket.size()>=products.size()){
            throw new IllegalArgumentException("Cannot add more products");
        }
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void buy(){

    }
}
