package TUT_3;

public class Airplane {
    private String brand;
    private int noSeats;

    public Airplane (String brand, int noSeats){
        this.brand=brand;
        this.noSeats=noSeats;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoSeats() {
        return noSeats;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }
}
