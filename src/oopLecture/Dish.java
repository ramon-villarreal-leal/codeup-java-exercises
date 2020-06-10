package oopLecture;

public class Dish {



    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

//    public int getCostInCents() {
//        return costInCents;
//    }
//
//    public void setCostInCents(int costInCents) {
//        this.costInCents = costInCents;
//    }

    public void printSummary(){
        System.out.printf("Cost: %d%nName: %s%nRecommended: %b%n  ", costInCents, nameOfDish, wouldRecommend);
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean getWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

}
