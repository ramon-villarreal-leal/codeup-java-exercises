import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //basic for loop
        //create an int with a value of 5
        //create a while loop runs while
//        for(int i = 5; i <= 15; i += 1) {
//            if(i <= 15) {
//                System.out.print(i + " ");
//            }
//        }

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        //Counts to 100 by going through even numbers;

//        int i = 0;
//        do {
//            System.out.println(i);
//            i +=2;
//        }while(i <= 100);
// counts from 100 - 10 backwards by 5
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

        //WRONG WAY DO NOT DO THIS USE LONG INSTEAD NO INT
//        int i = 2;
////        double squared = Math.sqrt(i);
//        do {
//            System.out.println(Math.pow(2, i));
//            i++;
//        } while(i < 1000000);

        // last part of do while exercise CORRECT ANSWER
//        long i = 2L;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);
        //refactored for loop for above exercise

//        for(int i = 5;  i <= 15; i+=1) {
//            if(i <= 15) {
//                System.out.print(i + " ");
//            }
//        }

//        for(int i=0; i <= 100; i +=1) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        for(int i = 100; i >=-10; i -=1) {
//            if(i % 5 == 0){
//                System.out.println(i);
//            }
//        }
        // refactored to for loop squared one

//        for(long i =2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }

        // fizz buzz for loop java
//        for(int i = 0; i <= 100; i +=1) {
//            if(i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //table of powers:

        Scanner sc = new Scanner(System.in);
//
        System.out.print("What number would you like to go up too?: ");
        int userInput = sc.nextInt();

        System.out.print("Continue? [y/N]");
        String userAnswer = sc.next();
        boolean saidYes = userAnswer.equalsIgnoreCase("y");
        if(saidYes) {
            System.out.println("\nHere is your table! \n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");



            for(int i = 1; i <= userInput; i += 1) {
//                String output = String.format("%-7d| %-8d| %-7d", i, i*i, i*i*i); // string formatted like this anywhere it goes
//                System.out.println(output);
                System.out.printf("%-7d|%-8d |%-6d \n", i, i*i, i*i*i);
//                String.format(output); //useful later on
            }

        } else {
            System.out.println("Terminated");
        }


        //grades displaying:
//        System.out.print("Would you like to enter a grade?");
//        int userGradeInput = sc.nextInt();
//
//        System.out.print("Continue to see your grade? [y/n]");
//        String userAnswer = sc.next();
//        boolean yesSeeGrades = userAnswer.equalsIgnoreCase("y");
//        if (yesSeeGrades) {
//            if (userGradeInput >= 95) {
//                System.out.println("A+");
//            } else if (userGradeInput >= 90) {
//                System.out.println("A-");
//            } else if (userGradeInput >= 85) {
//                System.out.println("B+");
//            } else if (userGradeInput >= 80) {
//                System.out.println("B-");
//            } else if (userGradeInput >= 75) {
//                System.out.println("C+");
//            } else if (userGradeInput >= 70) {
//                System.out.println("C-");
//            } else if (userGradeInput >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//
//            System.out.printf("Your grade is: %s ", userGradeInput);
//
//        } else {
//            System.out.println("Looks like you won't see your grade.");
//        }


    }
}







