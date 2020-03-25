package TUT_4;

public class Main {
    public static void main(String[] args) {

        User u1=new User("abcdefg");
        User u2=new User("abcdefg", "asdasd", "qwerty", "123456");
        User u3=new User("qwertyuiop");

        u1.isRegistered();

        u1.upgradeAccount();
        u1.isRegistered();

        Product p1 = new Product("Yoghurt", 3.5, 200678);
        Product p2 = new Product("Milk", 5, 230678);
        Product p3 = new Product("Ham", 9.5, 270678, 127);
        p1.changeAmount(5);
        p2.changePrice(4.6);

    }
}
