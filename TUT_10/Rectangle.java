package TUT_10;

public class Rectangle implements Figure {

    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }

    @Override
    public double getPerimeter() {
        double perimiter = sideA*2 + sideB*2;
        return perimiter;
    }

    @Override
    public double getArea() {
        double area = sideA*sideB;
        return area;
    }

    @Override
    public String getType() {
        String Type = "Rectangle";
        return Type;
    }
}
