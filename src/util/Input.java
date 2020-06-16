package util;


import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("What is your way of saying yes?");
        return scanner.nextLine();

    }


    public boolean yesNo() {
        System.out.println("Different ways to say yes");
        String answer = getString();
        if (answer.equalsIgnoreCase("yes")
                ||answer.equalsIgnoreCase("y")||answer.equalsIgnoreCase("yee")) {
            return true;
        } else {
            return false;
        }
    }

    //original getInt()
//    public int getInt(){
//        return scanner.nextInt();
//    }


    public int getInt() {
//        System.out.println("Enter a valid number");
        if(scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("invalid input, enter valid integer");
            scanner.next();
            return getInt();
        }
//        return scanner.nextInt(); // this works also OLD WAY no prompting user
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d%n", min, max);
        int answer = getInt();
        if (answer >= min && answer <= max) {
            System.out.println("You entered within the range!");
            return answer;
        } else {
            //CALL THIS INSTEAD OF GETINT() LINE 35!!!
            System.out.println("You need to enter a number in the range!");
            return getInt(min, max);
        }
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
//
    public double getDouble(double min, double max){
        System.out.printf("Enter a decimal between %.4f - %.4f%n", min, max);
        double floatAnswer = getDouble();
        if(floatAnswer >= min && floatAnswer <= max) {
            return floatAnswer;
        } else {
            return getDouble(min,max);
        }
    }


}


