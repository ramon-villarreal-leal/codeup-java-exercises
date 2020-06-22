package abstractLecture;

abstract class Employee extends Person {

    int salary;
    String workplace;

    public abstract void doWork();
    public abstract void lunchBreak();
}
