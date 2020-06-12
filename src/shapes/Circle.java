package shapes;

public class Circle {

    private double radius;

    //constructor same thing as class name
    public Circle(double radiusNewCircle) {
        this.radius = radiusNewCircle;
    }

    public double getArea() {
        return Math.PI * (radius*radius); //Math.pow(radius,2) justins way BEST WAY
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }




}
