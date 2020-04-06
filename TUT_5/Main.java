package TUT_5;

import java.lang.reflect.Array;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Creating users
        User u1=new User("User1@pejot.pl");
        User u2=new User("User2", "Surname2", "qwerty@pejot.pl", "1234");
        User u3=new User("123@pejot.pl");
        u1.isRegistered();
        u1.upgradeAccount();
        u1.isRegistered();

        //Adding products
        Product p1 = new Product("Yogurt", 3.5, 200678);
        Product p2 = new Product("Milk", 5, 230678);
        Product p3 = new Product("Ham", 9, 270678, 127);
        p1.changeAmount(5);
        p2.changePrice(4.6);

        //Creating categories with the amount of the products in the shop
        ArrayList<Product> allProducts = new ArrayList<>(); // 3 products in the shop
        Category c = new Category("General Category", allProducts);
        Category c1 = new Category("SecondCategory");
        Category c2 = new Category();

        //Adding 3 products to the shop
        c.addProduct(p1);
        c.addProduct(p2);
        c.addProduct(p3);
        c1.addProduct(p1);
        c2.addProduct(p3);
        System.out.println();
        System.out.println("There are "+c.getNumberOfProducts()+" products in this shop");

        //Creating 3 different baskets
        Basket b=new Basket();
        Basket b1=new Basket(u1);
        Basket b2=new Basket(u2, allProducts);
        System.out.println("Successfully created baskets!");

        //Adding and iterating
            b2.addProduct(p3);
            for (Product product : allProducts) {
                if (product.getProductCode() != p3.getProductCode()) {
                    //adding...
                } else {
                    c.removeProduct(p3);
                    System.out.println(p3.getName()+" added to the basket!");
                    break;
                }
            }

        b2.addProduct(p2);
        for (Product product : allProducts) {
            if (product.getProductCode() != p2.getProductCode()) {
                //adding...
            } else {
                c.removeProduct(p2);
                System.out.println(p2.getName()+ " added to the basket!");
                break;
            }
        }


        b2.buy();

    }
}
