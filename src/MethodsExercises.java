import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        //Adding numbers
//        System.out.println("The result of adding numbers is : " + addNumbers(5, 6));
//        //minus numbers
//        System.out.println("The result of minusing numbers is: " + minusNumbers(60, 32));
//        //multiply numbers
//        System.out.println("The result of multipling numbers is: " + multiplyNumbers(7,9));
//        //divide
//        System.out.println("The result of dividing number is: " + divideNumbers(20, 4));
//        //modulus of numbers
//        System.out.println("modulus of number is : " + modulusNumbers(33, 5));
//        System.out.println(getInteger(33,50));


        //CORRECT WAY TO CALL EXERCISE 2
//        int myInt = getInteger(1, 50);
//
//        System.out.println(myInt);

//        exercise 3 factorial

//        System.out.println(factorial(1, 10));

        //exercise 4

        rollDice();

        //enter a number
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

    //exercise 2
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d \n", min, max);
        int userInput = sc.nextInt();
        if (userInput > min && userInput <= max) {
            System.out.println("Your number is valid!");
            return userInput;
        } else {
            System.out.println("invalid input enter your number again!");
            return getInteger(min, max);
        }


    }

//exercise 3
//    public static long factorial(int mini, int maxi) {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Enter a number between %d and %d \n", mini, maxi);
//
//        int userFactorInput = sc.nextInt();
//        System.out.println("Continue to see your factorial number? [y/N]");
//        String userAnswer = sc.next();
//        boolean seeFactorial = userAnswer.equalsIgnoreCase("y");
//        long fact = 1;
//
//        if (seeFactorial) {
//            if (userFactorInput >= mini && userFactorInput <= maxi) {
//
//                for (long i = 1; i <= userFactorInput; i++) {
//                    fact = fact * i;
//                    System.out.println(i +"! = " + fact + " x " + i + " x " + i);
//                }
//            } else {
//                System.out.println(factorial(mini, maxi));
//            }
//
//        }
//
//        return fact;
//
//    }

//    public static long factorialWithForLoop(int mini, int maxi) {
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Enter a number between %d and %d \n", mini, maxi);
//
//
//
//
//    }

    //roll dice exercise 4

    public static void rollDice() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to roll the dice? [y/N]");
        String wantToRoll = sc.next();
        String answer;
        if (wantToRoll.equalsIgnoreCase("y")) {


            do {
                System.out.println("Roll");
                int die1;
                int die2;

                //int sides goes where 6 is
                die1 = (int) (Math.random() * 6) + 1;
                die2 = (int) (Math.random() * 6) + 1;
                System.out.println(die1);
                System.out.println(die2);
                //use recursion to reask the question!!!!
                System.out.println("Would you like to roll again? [y/N]");
                String rollTheDice = sc.next();
                //roll dice changes answer in the global scope
                answer = rollTheDice;

            } while (answer.equalsIgnoreCase("y"));
        }
    }

}
