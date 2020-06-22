package exceptionsLecture;

import java.sql.SQLException;

public class ExceptionLecture {

    public static void main(String[] args) {

        // ================================ SLIDE 3

//        throw new RuntimeException("Something went wrong");

//        throw new ArrayIndexOutOfBoundsException("ajhwdhd dhdhjd djdjd");

//        String[] names = {"cathy", "bob"};
//        System.out.println(names[10]);

//        int x = 3;
//        int y = 0;
//
//        System.out.println(x / y);
//        throw new ArithmeticException("Cannot divide by zero");


        // lecture example
//        int x =2;
//        int y =8;
//        int z = x + y;
//        if(z == 10) {
//            throw new ArithmeticException("Numbers can't add to 10");
//        } else {
//
//        }
        //lecture example
//        String st = null;
//        System.out.println("st.length() = " + st.length());
//
//        //NullPointerExeception



//        throw new ArithmeticException("Cannot divide by zero");

        // Exceptions may be thrown

//        try{
//            String str = null;
//            System.out.println(str.length());
//        } catch(Exception e){
////            System.out.println("Something went wrong");
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("It will run after code runs");
//        try {
//            throw new Exception("uh oh");
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//
//        try{
//            throw new SQLException("seomthing went wrong")
//        }catch(){
//
//        }

//        try {
//            throw new Exception("Something went wrong");
//        } catch(NullPointerException e) {
//            System.out.println(e.getMessage());
//        } catch(RuntimeException e) {
//            System.out.println("Runtime exception happened");
//        } catch(Exception e) {
//            System.out.println("Something went wrong generally");
//        }
//
//        System.out.println("What will happen?");
//
//        System.out.println("Will this run?????");

        // You have to handle most exceptions that extend from Exception

//            try {
//                // risky things
//                boolean badThingHappened = true;
//                if (badThingHappened) {
//                    throw new Exception("EXCEPTION: you did the bad thing!!!");
//                }
//                System.out.println("This only runs if condition is false");
//            } catch(Exception e) {
//                System.out.println("You did x and it broke");
//                System.out.println(e.getMessage());
//                e.printStackTrace(System.out);
//            }

        // Curriculum Example


//            try {
//                System.out.println("Let's see...");
//                int result = 1 / 0;
//                System.out.println("I can divide by zero!");
//            } catch (ArithmeticException e) {
//                System.out.println("Math still works!");
//                System.out.println(e.toString());
//                System.out.println();
//                e.printStackTrace(System.out);
//            }

//            System.out.println("This will still run");




        // ================================ SLIDE 4

//        int[] numbers = {1, 2, 3};
//        int x = 5;
//        try {
//            x = numbers[1];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception caught!");
//            x = 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("This will always run.");
//            // normally used for "clean up" like closing file streams or DB connections
//        }
//        System.out.println(x);
//        System.out.println("This always runs");



        // we can catch multiple exceptions, including exceptions we defined

//            try {
//                double result;
//                String[] strings = {"Bob", "Fred", "Sally"}; // will not be caught by specific Exception
//                System.out.println(strings[3]);
//            } catch(ArrayIndexOutOfBoundsException e) {
//                System.out.println(e.toString());
//            } catch(Exception e) {
//                System.out.println("This won't run");
//                System.out.println(e.toString());
//            }


        // ================================ SLIDE 5 and 6

//        try {
//            throw new Exception("Bummer. The risky stuff failed. You'll handle it.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        // ================================ SLIDE 7

        // catching a custom exception


//        try {
//            soutName("Bob"); // cannot call soutName without exception handling
//        } catch (NameIsBobException e) {
//            e.printStackTrace();
//        }


        // ================================ SLIDE 8


        // calling a method that handles an exception

//            thisHandlesAnException();

        // using throws in a method, we can kick the responsibility of handling the exception up the chain

//            try {
//                thisMakesAnException();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }


//        try {
//            throw new NameIsBobException("The name is bob : ");
//        } catch (NameIsBobException e) {
//            e.printStackTrace();
//        }

        try {
            soutName("Justin");
        } catch (NameIsBobException e) {
            e.printStackTrace();
        }
    }

    public static void thisHandlesAnException() {
        try {
            throw new Exception("Yep, an exception again :(");
        } catch (Exception e) {
            System.out.println("EXCEPTION!!!");
            System.out.println(e.getMessage());
        }
    }

    public static void thisMakesAnException() throws Exception {
        throw new Exception("Exception!");
    }

    public static void soutName(String name) throws NameIsBobException {
        if (name.equalsIgnoreCase("bob")) {
            throw new NameIsBobException("NOOOOOOO!!!!");
        } else {
            System.out.println(name);
        }
    }

}
