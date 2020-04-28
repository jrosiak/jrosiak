package TUT_7;

import java.util.ArrayList;

public class House {
    ArrayList<Room> rooms = new ArrayList<>();
    String address;
    static House house = new House("");

    private House(String address){
        this.address=address;
    }

    public void addRoom(Room r){
        rooms.add(r);
    }

    public void addRooms(ArrayList<Room> r){
        for(int i=0;i<r.size();i++){
            rooms.add(r.get(i));
        }
    }

    public static House createHouse(String address1) {
        house.address=address1;
        return house;
    }

    public int addRoomCount(){
        int roomAmount=0;
        for(int i=0; i<rooms.size(); i++){
            roomAmount+=1;
        }
       return roomAmount;
    }

}




