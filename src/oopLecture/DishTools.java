package oopLecture;

public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish d) {
        System.out.println(d.getNameOfDish().toUpperCase());
    }

    public static void analyzeDishCost(Dish d) {
        String message = (d.getCostInCents() < AVERAGE_COST_OF_DISH_IN_CENTS) ?
                "Less expensive than average" : "More expensive than average";
        System.out.println(message);
    }

    public static Dish flipRecommendation(Dish d) {
        d.setWouldRecommend(!d.getWouldRecommend());
        return d;
    }
}
