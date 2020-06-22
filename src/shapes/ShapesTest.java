package shapes;

import java.security.MessageDigest;

public class ShapesTest {

    public static void main(String[] args) {

        // USE SETTERS TO SET THE LENGTH AND WIDTH LOOK AT THIS LATER ON!!!!


            Measurable myShape = new Rectangle(5,10);


        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        //new instance of my shape!

        //do not have to specify myShape again data type defined already!

        myShape = new Square(4);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

//        myShape.getLength();
//        myShape.getWidth();

    }
}
