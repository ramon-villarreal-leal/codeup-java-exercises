package abstractMiniExercise;

import jdk.swing.interop.SwingInterOpUtils;

public class Blender extends Appliance {
    @Override
    public void makeSound() {
        System.out.println("Make a BRRRRR sound BLENDED");
    }

    @Override
    public void doWork() {
        System.out.println("I blend things!!");
    }
}
