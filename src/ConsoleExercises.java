import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.println("The value of pi is approximately " + pi);
//        //same thing as print f
//        //System.out.printf();
//        System.out.format("The value of pi is approximately %.2f.", + pi);


        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        int enterInteger = sc.nextInt();
//
//        System.out.print("Integer is:  " + enterInteger + "\n");
//        sc.nextLine();
//
//        System.out.print("Enter your 3 favorite anime characters: ");
//        String firstChar = sc.next();
//        String secondChar = sc.next();
//        String thirdChar = sc.next();
//
//        System.out.println(firstChar);
//        System.out.println(secondChar);
//        System.out.println(thirdChar);
//
//        System.out.println("Enter your favorite sentence");
//        sc.nextLine();
//
//        String favoriteSentence = sc.nextLine();
//
//        System.out.println(favoriteSentence);

        System.out.println("First enter Length of classroom, then Width:");
        System.out.println("What is the length of class room: ");
        String lengthOfClassroom = sc.nextLine();
        System.out.printf("Length of classroom is %s \n", lengthOfClassroom);
        System.out.println("What is width?: ");
        String widthOfClassroom = sc.nextLine();
        System.out.printf("Width of classroom is %s \n", widthOfClassroom);

        int lengthOfClassConvert = parseInt(lengthOfClassroom);
        int widthOfClassConvert = parseInt(widthOfClassroom);

        int areaOfClass = lengthOfClassConvert * widthOfClassConvert;
        int perimeterOfClass = lengthOfClassConvert*2 + widthOfClassConvert*2;


        System.out.print("Area of classroom is " + areaOfClass + "\n");

        System.out.println("Perimeter of room is " + perimeterOfClass);



    }
}
