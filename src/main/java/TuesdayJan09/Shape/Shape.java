package TuesdayJan09.Shape;

//@FunctionalInterface
public interface Shape {
    double area();
    default double perimeter(){
        return 0.0;
    }
}
