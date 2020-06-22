package abstractLecture.animals;

import abstractLecture.animals.Animal;
import jdk.swing.interop.SwingInterOpUtils;

public class Dog extends Animal implements CanWalk, CanSwim, Adoptable {

    @Override
    public void eat() {
        System.out.println("Eat dog food...");
    }

    @Override
    public void sleep() {
        System.out.println("sleeps in bed...");
    }

    @Override
    public void moveForward(){
        System.out.println("moves forward");
    }
    @Override
    public void moveBackward(){
        System.out.println("I move backwards");
    }
    @Override
    public void canCrawl(){
        System.out.println("Crawling on floor");
    }

    @Override
    public void swimForward() {
        System.out.println("Swim forward");
    }

    @Override
    public void swimBackward() {
        System.out.println("Swim backwards");
    }

    @Override
    public void adopt() {

    }
}
