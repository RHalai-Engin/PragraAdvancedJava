package TuesdayJan09.Shape;

public class Triangle implements Shape{

    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 3 * side;
    }
}
