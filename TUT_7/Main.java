package TUT_7;

public class Main {
    public static void main(String[] args) {

        House house=House.createHouse("ChujCiWDupeSzmatoCoMiToZadalasIKurwaGownoWytlumaczylasElo");

        Room r1 = new Room(45);
        Room r2 = new Room(65);
        Room r3 = new Room(83);

        house.addRoom(r1);
        house.addRoom(r2);
        house.addRoom(r3);

        Furniture f1 = new Furniture("Drawer", 300);
        Furniture f2 = new Furniture("Table", 230);
        Furniture f3 = new Furniture("Couch", 700);

        f1.getPrice(true);

        r1.add(f1);
        r1.add(f2);
        r1.add(f3);
        System.out.println("Your home has " + house.addRoomCount() + " rooms");
        System.out.println("Your furniture will cost " + r1.getOverallPrice());
    }
}
