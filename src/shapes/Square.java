package shapes;

public class Square extends Rectangle {

//    Create a class named Square, also inside of shapes, that extends Rectangle. Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.

    public Square(int side){
        super(side, side); // using constructor in Rectangle that takes in 2 arguments
    }

    @Override

    public int getArea(){
        System.out.println("Called from Square getArea()");

        return length * 2;
    }

    //length or width for square does not matter @Override is not needed but
    //helpful for visualization

    public int getPerimeter(){
        System.out.println("Called from Square getPerimeter()");
        return 4 * length;
    }


}
