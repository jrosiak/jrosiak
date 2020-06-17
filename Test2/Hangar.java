package Test2;

import java.util.ArrayList;
import java.util.List;

public class Hangar {

    private int capacity;
    private List<Vehicle> vehicles = new ArrayList<>(capacity);

    public Hangar(int capacity) {
        this.capacity = capacity;
    }

    public void setCapacity(int x) {
        capacity = x;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getVehiclesSize(){
        return vehicles.size();
    }

    public void addVehicle(Vehicle v) throws HangarException{
        if(getVehiclesSize()<getCapacity()) {
            vehicles.add(v);
        }else{
            throw new HangarException("There is no more space left in this hangar");
        }
    }

}
