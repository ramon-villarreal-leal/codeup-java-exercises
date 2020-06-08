import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {

//        String pinkFloyd = "We don't need no education \nWe don't need no thought control";
//        System.out.println(pinkFloyd);
//
//
//        String checkThisOut = "Check \"this\" out!, \"s inside of \"s!";
//        System.out.println(checkThisOut);
//
//        String windowsDrive = "In windows, the main drive is usually C:\\";
//        System.out.println(windowsDrive);
//
//        String backSlash = "I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!";
//        System.out.println(backSlash);

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
//        String iSaidYesBob = sc.next();
//
//        if(iSaidYesBob.endsWith("?")) {
//            System.out.println("Sure");
//        }  else if(iSaidYesBob.endsWith("!")) {
//            System.out.println("Whoa chill out!");
//        } else if (iSaidYesBob.contains("")) {
//            System.out.println("Fine. Be that way!");
//        } else {
//            System.out.println("whatever man");
//        }

        //sophies way!!!!!
        System.out.println("If you want to talk to bob say hi");

        String userInput;
        boolean greeting;

        do {
            userInput = sc.next();
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


//        if(iSaidYesBob.indexOf("?")) {

//        }
//        boolean yesQuestionBob = iSaidYesBob.indexOf("?");
//
//        if (yesQuestionBob) {
//            System.out.println("TEst");
//        }



    }
}

