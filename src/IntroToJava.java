public class IntroToJava {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");

        // This is a single line comment

        /*

        Multi-line comment

         */

        int age;
        //putting an int returns  4 ONLY instead of 4.8
        double randomNumber = 5.5;

//        double pi;

        double price;

        age = 24;
        // ++age calls at the same time as variable would say 25 instead of age++ 24
        System.out.println(++age);
        System.out.println(age++);
        System.out.println(age--);





//        pi = 3.14159;

        price = 19.99;

        System.out.println(age/randomNumber);
        //single quotes can be used for one character
        System.out.println('r');
        //
        System.out.println("\"This is a double quoted string\"");

        System.out.println("One backslash: \\ 'test'");

        int x = 3;
        int y = 2;

        x = x * y;

        x *= y;
        x /= y;
        x -= y;
        x += y;

        //Implicit Casting
        //putting content of smaller glass of
        // water into a larger glass of water
        short lessPrecise = 5;
        int morePrecise = lessPrecise;

        System.out.println(lessPrecise);
        System.out.println(morePrecise);

        //explicit casting: taking contents of larger glass, drinking some, pouring into smaller glass
        //

        double pi = 3.1415;
        System.out.println(pi);

        int almostPi = (int) pi;
        System.out.println(almostPi);

        //data type changes here
        double piAgain = almostPi;

        System.out.println(piAgain);




    }

}
