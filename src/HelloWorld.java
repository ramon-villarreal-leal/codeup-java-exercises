public class HelloWorld {
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

        double pi;

        double price;

        age = 24;

        pi = 3.14159;

        price = 19.99;

        System.out.println(age/randomNumber);
        //single quotes can be used for one character
        System.out.println('r');
        //
        System.out.println("\"This is a double quoted string\"");

        System.out.println("One backslash: \\ 'test'");

        //start of exercise:

        int myFavoriteNumber = 6;

        System.out.println(myFavoriteNumber);

        //put pi in here error message of double cannot be converted into  java'lang.string
        String myString = "Let's do this!";

        System.out.println(myString);

        //possible lossy conversion from double to long when using long to log 3.14
        //when changing to float a lossy conversion double to float
        long myNumber = 123L;

        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        System.out.println(theNumberThree);
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);


        //string cannot be converted into an Int:
//        int three = (int) "three";

//        System.out.println(three);

//        int x = 4;
//        x += 5;
//        System.out.println(x);
//        int x = 3;
//        int y = 5;
//
//        y = y * x;
//
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
////        x = x / y;
//        y = y - x;
//
//        System.out.println(x);
//        System.out.println(y);



//    byte toMuch = 128;
//        System.out.println(++toMuch);

        float f = 3.14f;
        int i =(int)f;
        System.out.println(i);

        long L = 123456789;
        byte b =(byte)L;
        System.out.println(b);

    }
}
