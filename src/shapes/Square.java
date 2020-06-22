package shapes;

public class Square extends Quadrilateral {
    public Square(double length) {
        super(length, length);
    }


    @Override
    public double getArea() {
        return getLength() * getWidth();
    }


    @Override
    public double getPerimeter() {
        return getLength() * 4; // getLength() * 4;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getLength() {
        return length;
    }

    ////    Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//
//    public Square(double side){
//        super(side, side); // using constructor in Rectangle that takes in 2 arguments
//    }
//
//    @Override
//
//    public double getArea(){
//        System.out.println("Called from Square getArea()");
//
//        return Math.pow(length, 2);
//    }
//
//    //length or width for square does not matter @Override is not needed but
//    //helpful for visualization
//    @Override
//    public double getPerimeter(){
//        System.out.println("Called from Square getPerimeter()");
//        return 4 * length;
//    }


}
