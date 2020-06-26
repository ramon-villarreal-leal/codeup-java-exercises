import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");


        System.out.println("If you want to talk to bob say hi");

        String userInput;
        boolean greeting;

        do {
            userInput = scanner.next();
            greeting = (!userInput.equals("bye"));
            if(userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if(userInput.endsWith("!")) {
                System.out.println("whoa bro chill");
            } else if(userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }

        }while(greeting);
    }
}
