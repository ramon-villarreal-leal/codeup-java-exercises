public class MethodsExercises {
    public static void main(String[] args) {
        //Adding numbers
        System.out.println("The result of adding numbers is : " + addNumbers(5,6));
        //minus numbers
        System.out.println("The result of minusing numbers is: " + minusNumbers(60, 32));
        //multiply numbers
        System.out.println("The result of multipling numbers is: " + multiplyNumbers(7,9));
        //divide
        System.out.println("The result of dividing number is: " + divideNumbers(20, 4));
        //modulus of numbers
        System.out.println("modulus of number is : " + modulusNumbers(33, 5));
    }


    //Add numbers
    public static int addNumbers(int a, int b) {
            int addition = a + b;
            return addition;
        }
    // minus numbers
    public static int minusNumbers(int a, int b) {
        int minus = a - b;
        return minus;
    }

    // multiply numbers
    public static int multiplyNumbers(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    //divide numbers
    public static long divideNumbers(int a, int b) {
        long divide = a / b;
        return divide;
    }

    //modulus of numbers
    public static int modulusNumbers(int a, int b) {
        int mod = a % b;
        return mod;
    }

//    public static int getInteger(int min, int max) {
//
//    }


}
