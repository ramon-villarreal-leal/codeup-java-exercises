package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }




    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * getLength() + 2 * getWidth();
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getLength() {
        return length;
    }

    //    protected double length;
//    protected double width;
//
//    //constructor
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//         return this.length * this.width;
//    }
//
//    public double getPerimeter(){
//        return 2*length + 2*width;
//    }
//
//    //empty constructor for square to be happy
//    public Rectangle() {
//
//    }
}
