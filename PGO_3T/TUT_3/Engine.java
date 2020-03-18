package TUT_3;

public class Engine {
    private int engineYear;
    private int enginePower;

    public Engine (int engineYear, int enginePower){
        this.enginePower=enginePower;
        this.engineYear=engineYear;
    }

    public int getEngineYear() {
        return engineYear;
    }

    public void setEngineYear(int engineYear) {
        this.engineYear = engineYear;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    void isEngineEco (){
        if(enginePower>20000 && engineYear>2000){
            System.out.println("Engine of this airplane is eco!");
        }else{
            System.out.println("Engine of this airplane is not eco...");
        }
    }

}
