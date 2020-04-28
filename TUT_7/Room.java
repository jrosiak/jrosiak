package TUT_7;

import java.util.ArrayList;

public class Room{

    private int area;
    ArrayList<Furniture> furniture = new ArrayList<>();


    public void add(Furniture f){
        furniture.add(f);
    }

    public Room (){}

    public Room(int area){
        this.area=area;
    }

    public int getOverallPrice(){
        int tmp = 0;
        for(int i=0; i<furniture.size(); i++){
            tmp += furniture.get(i).getPrice(false);
        }
        return tmp;
    }

}


