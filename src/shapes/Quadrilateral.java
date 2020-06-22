package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;


    public Quadrilateral() {

    }

    //constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }




    //method for getting length and width

    public double getLength(double length){
       return length;
    }

    public double getWidth(double width){
       return width;
    }

    //ABSTRACT METHODS

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract double getWidth();
    public abstract double getLength();



}
