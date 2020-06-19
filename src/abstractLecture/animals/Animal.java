package abstractLecture;

abstract class Animal {
    int age;
    String habitat;
    String species;


    //regulay method
    public void sayHello(){
        System.out.println("You greet the animal.");
    }
    //abstract methods cannot have a body
    //DO NOT DO THIS BELOW
//    public abstract void eat() {
//
//    }

    public abstract void eat();
    public abstract void sleep();



    public Animal(){

    }
}
