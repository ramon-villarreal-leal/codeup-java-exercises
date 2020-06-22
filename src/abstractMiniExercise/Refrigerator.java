package abstractMiniExercise;

public class Refrigerator extends Appliance {

    @Override
    public void makeSound() {
        System.out.println("~ominous buzzing~");
    }

    @Override
    public void doWork() {
        System.out.println("~I keep it chill~");

    }
}
