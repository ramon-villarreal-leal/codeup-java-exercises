package util;


import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();

    }


    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }


    public boolean yesNo() {
//        System.out.println("Different ways to say yes");
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
        String userInput = scanner.nextLine();
        try{
            return Integer.parseInt(userInput);
        }catch(NumberFormatException e) {
            System.out.println("Need a valid integer.");
             return getInt();
        }
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
        String userInput = scanner.nextLine();
        try{
            return Double.parseDouble(userInput);
        }catch(NumberFormatException e){ //checked exception most general
            System.out.println("enter a valid double number");
            return getDouble();
        }
    }
//
    public double getDouble(double min, double max){
        System.out.printf("Enter a decimal between %.4f - %.4f%n", min, max);
        double floatAnswer = getDouble();
        if(floatAnswer >= min && floatAnswer <= max) {
            return floatAnswer;
        } else {
            System.out.println("Please enter a number in the correct range between " + min + " " + "and " + max);
            return getDouble(min,max);
        }
    }


}


