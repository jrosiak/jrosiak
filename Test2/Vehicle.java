package Test2;

public abstract class Vehicle implements Engine, AddingItems {

    private double tankCapacity;
    private double loadingSpace;
    private boolean isEngineOn;

    public Vehicle(double tankCapacity, double loadingSpace) {
        this.tankCapacity = tankCapacity;
        this.loadingSpace = loadingSpace;
        isEngineOn=false;
    }

    @Override
    public void start() throws EngineException {
        if(this.isEngineOn==true){
            throw new EngineException("Error! The Engine is already running!");
        }else {
            this.isEngineOn = true;
        }
    }

    @Override
    public void stop() throws EngineException {
        if(this.isEngineOn==false){
            throw new EngineException("Error! The Engine is already off!");
        }else {
            this.isEngineOn = false;
        }
    }

    @Override
    public void addItem(double capacity) throws CapacityException {
        this.loadingSpace-=capacity;
        if(this.loadingSpace<0){
            this.loadingSpace+=capacity;
            throw new CapacityException("Adding item failed, capacity exceeded.");
        }else{
            System.out.println("Item of capacity "+capacity+ " added successfully");
        }
    }

}
