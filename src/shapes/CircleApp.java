package shapes;

import util.Input;



public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Please enter a number for radius");

        double radius = input.getDouble();

        Circle newCircle = new Circle(radius);
//        Circle newCircle = new Circle(5);

        System.out.println("Area of circle is: " + newCircle.getArea());
        System.out.println("Circumference of Circle is: " + newCircle.getCircumference());
    }
}
