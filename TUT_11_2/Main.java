package TUT_11_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //TASK 2 AND 3

        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        HashSet<Item> hashSet = new HashSet<>();
        ArrayList<Item> items = new ArrayList<>();

        Item i1 = new Item("Thingy.1", 1);
        Item i2 = new Item("Thingy.2", 2);
        Item i3 = new Item("Thingy.3", 3);
        Item i4 = new Item("Thingy.4", 4);
        Item i5 = new Item("Thingy.5", 5);

        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);

        i1.show();
        i2.show();
        i3.show();
        i4.show();
        i5.show();

        for(Item i : items){
            hashMap.put(i.getId(), i.getName());
        }

        for (Map.Entry<Integer,String> entry : hashMap.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        Item i6 = new Item("Thingy.6", 6);
        Item i7 = new Item("Thingy.7", 7);
        Item i8 = new Item("Thingy.8", 8);
        Item i9 = new Item("Thingy.9", 9);
        Item i10 = new Item("Thingy.10", 10);
        Item i11 = new Item("Thingy.11", 11);
        Item i12 = new Item("Thingy.12", 12);
        Item i13 = new Item("Thingy.13", 13);
        Item i14 = new Item("Thingy.14", 14);
        Item i15 = new Item("Thingy.15", 15);

        items.add(i6);
        items.add(i7);
        items.add(i8);
        items.add(i9);
        items.add(i10);
        items.add(i11);
        items.add(i12);
        items.add(i13);
        items.add(i14);
        items.add(i15);
        try{
            List<Item> items2 = items.subList(0,5);
            for(Item i : items2){
                hashSet.add(i);
            }

        }catch (IndexOutOfBoundsException e){
            System.out.println("Exception thrown : " + e);
        }catch (IllegalArgumentException e){
            System.out.println("Exception thrown : " + e);
        }


    }

}

