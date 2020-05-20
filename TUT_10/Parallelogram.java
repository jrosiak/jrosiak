package TUT_10;

public class Parallelogram implements Figure{

    double baseSide;
    double side;
    double height;

    public Parallelogram(double baseSide, double side, double height){
        this.baseSide=baseSide;
        this.side=side;
        this.height=height;
    }

    @Override
    public double getPerimeter() {
        double perimiter = baseSide*2 + side*2;
        return perimiter;
    }

    @Override
    public double getArea() {
        double pArea = baseSide*height;
        return pArea;
    }

    @Override
    public String getType() {
        String Type = "Circle";
        return Type;
    }
}
