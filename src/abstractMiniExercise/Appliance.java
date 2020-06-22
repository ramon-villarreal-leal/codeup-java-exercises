package abstractMiniExercise;

abstract class Appliance {

    private String brand;
    private String color;
    //empty constructor
    public Appliance(){

    }
    // can also be named myBrand or myColor below
    public Appliance(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //abstract method
    public abstract void makeSound();
    //abstract method
    public abstract void doWork();
}
