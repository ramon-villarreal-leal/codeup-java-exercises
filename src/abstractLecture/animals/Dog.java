package abstractLecture;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Eat dog food...");
    }

    @Override
    public void sleep() {

        System.out.println("sleeps in bed...");

    }
}
