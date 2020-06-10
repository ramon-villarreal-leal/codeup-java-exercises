package oopLecture;

public class DishTest {


    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.setCostInCents(2300);
        dish1.setNameOfDish("Laksa Soup");
        dish1.setWouldRecommend(true);
//        dish1.printSummary();

        DishTools.analyzeDishCost(dish1);
        DishTools.shoutDishName(dish1);
        DishTools.flipRecommendation(dish1);


        dish1.printSummary();

    }
}
