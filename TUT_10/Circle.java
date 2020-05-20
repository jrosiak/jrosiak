package TUT_10;

public class Circle implements Figure {

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getPerimeter() {
        double perimiter = 2*3.14*(radius);
        return perimiter;
    }

    @Override
    public double getArea() {
        double area = 3.14*((radius)*(radius));
        return area;
    }

    @Override
    public String getType() {
        String Type = "Circle";
        return Type;
    }
}
