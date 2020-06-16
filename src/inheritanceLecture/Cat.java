package inheritanceLecture;

public class Cat extends Animal {

    private int noOfLivesLeft;

    public Cat(String species, int age, int noOfLivesLeft) {
        super(species, age);
        this.noOfLivesLeft = noOfLivesLeft;
    }

    public int getNoOfLivesLeft() {
        return noOfLivesLeft;
    }

    public void setNoOfLivesLeft(int noOfLivesLeft) {
        this.noOfLivesLeft = noOfLivesLeft;
    }

}
