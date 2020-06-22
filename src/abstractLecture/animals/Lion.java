package abstractLecture.animals;

public class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Eats a lot of things");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps wherever it wants");
    }
}
