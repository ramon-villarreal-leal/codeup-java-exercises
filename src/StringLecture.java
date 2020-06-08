
import java.util.Scanner;

public class StringLecture {
    public static void main(String[] args) {

//        Uncomment the Scanner and String variables.

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter your name:");
//
//        String input = sc.nextLine();
//
//        String name = "Jane Doe";

        /*
         *  TO DO: Write the control statements below to check the input
         *  String using Java methods.
         */



        //  If the input is an exact match to String name...
        //  Print message: "Welcome Jane Doe!"

//        if(input.equals(name)) {
//            System.out.println("Welcome Jane Doe!");
//        }

        //  If the input is not capitalized correctly...
        //  Print message: "Names are proper nouns."

//        if(input.equalsIgnoreCase(name)){
//            System.out.println("Name's are proper nouns...");
//        }
        //  If the input starts with "Jane"...
        //  Print message: "Hi Jane!"

//        if(input.startsWith(name)) {
//            System.out.println("Hi Jane");
//        }


        //  If the input ends with "Doe"...
        //  Print message: "Doe, a deer..."

//        if(input.endsWith("Doe")) {
//            System.out.println("Doe, a deer...");
//        }

        /*
         *  TO DO TOGETHER: Uncomment each line and view the results of each
         *  String manipulation method.
         */
        //what you are working with above
        String name = "Jane Doe Doe Doe";
        String fruit = "apple, apple, apple";

//        System.out.println(name.charAt(3));
//        System.out.println(name.indexOf("Doe"));
//        System.out.println(name.lastIndexOf("e"));
        //comes out as 14
//        System.out.println(fruit.lastIndexOf("apple"));

//        System.out.println(name.length());
//        System.out.println(name.replace("Doe", "Smith"));
        String nameSubString = (name.substring(3).toUpperCase());
        //original
        System.out.println(name);
        // manipulated return!
        System.out.println(nameSubString);

        //start at 0 stop at 3 so "Jan"!!!
//        System.out.println(name.substring(0,3));
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());

        // trim is really useful for catching user errors on input.
        String trimThis = "    too many spaces   ";

//        if(trimThis.equals("to many spaces"))
//
        System.out.println(trimThis);
        System.out.println(trimThis.trim());
        //preserves original string save it to variable to change
        System.out.println(trimThis);

        //this way saves the trim girl
        String trimmedVersion = trimThis.trim();
        System.out.println(trimmedVersion);

        // How would we fix this?
        System.out.println("Here is a backslash \\");

    }
}
