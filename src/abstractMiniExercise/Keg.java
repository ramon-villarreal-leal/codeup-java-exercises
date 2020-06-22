package abstractMiniExercise;

public class Keg extends Appliance {
    @Override
    public void makeSound() {
        System.out.println("I sloshhhhh drip drip drip");
    }

    @Override
    public void doWork() {
        System.out.println("I dispense beer");
    }
}
