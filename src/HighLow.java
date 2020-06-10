import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        guessingGame();
    }
    //exercise 5:
    public static void guessingGame() {
        Scanner sc = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean stopGame = false;
//        System.out.println("Pick a number between 1-100");
        do {
            System.out.println("Pick a number between 1-100");

            int numberGuess = sc.nextInt();
            //debugging line
//            System.out.println(randomNumber);
            if (randomNumber > numberGuess) {
                System.out.println("GO HIGHER");
            } else if (randomNumber < numberGuess) {
                System.out.println("Go lower!!!");
            } else {
                stopGame = true;
                System.out.println("GREAT GUESS");
            }
        }while(!stopGame);
    }
}
