package arraysLecture;
import oopLecture.Person;

import java.util.Arrays;

public class ArraysLecture {

    public static String[] colorsCopy(String[] array) {
        String[] newCopy = Arrays.copyOf(array, array.length+1);
        return newCopy;
    }

    public static void main(String[] args) {


        //indicate array type, use "[]" to indicate its an array
        int numberOfPlanets = 8;
        //anything that evaluates as an int can be passed as an index.[numberOfPlanets]
        String[] planets = new String [numberOfPlanets];
        System.out.println(planets.length);
        planets[0] = "Mercury";
        planets[7] = "Neptune";
        //this thows a compile error index 8 is out of bounds.
//        planets[8] = "Pluto";

        System.out.println(planets[0]);
        System.out.println(planets[7]);

        int[] myNumbers = {1,2,3,4,5};
        int[] otherNumbers = {5,4,3,2,1};
        Arrays.sort(otherNumbers);
        //makes otherNumber alphbetical but need toString method.
        System.out.println(Arrays.toString(otherNumbers));
        System.out.println(Arrays.equals(myNumbers,otherNumbers));


        //create an array containing person objects:

        Person justin = new Person("Justin", "Reich");

        Person[] instructors = new Person[3];
//        Person[] instructors = {new Person(),new Person(),new Person()};
            instructors[0] = justin;
            instructors[1] = new Person("Sophie", "Kurihara");
            instructors[2] = new Person("David", "Stephens");
//            System.out.println(instructors[2].getLastName());

            //creating an array of car objects:
            Car[] myCars = new Car[5];
            //instantiate a new car object
            myCars[0] = new Car();

        myCars[0].setMake("Nissan");
            myCars[0].setModel("ROgue");
            myCars[0].setYear(2017);
        System.out.println(myCars[0].getMake());
        System.out.println(myCars[0].getModel());
        System.out.println(myCars[0].getYear());

//        Car marksCar[] = new Car[1];
//        myCars[1]
//        marksCar[0] = new Car();
//        Car marksCar = myCars[1];
//        marksCar.setMake(marksCar.getMake());
//        marksCar.setMake(marksCar.getMake());

        String[] theBeatles = {"John", "Ringo", "George", "Paul"};
        Arrays.sort(theBeatles);
        System.out.println(theBeatles);

        for(String beatle: theBeatles) {
            System.out.println(beatle);
        }

        // array manipulation methods:
        // Arrays.fill

        String[] colors = new String[7];
        Arrays.fill(colors,"blue");

        // Arrays.toString
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colorsCopy(colors)));

        //Arrays .equals
        System.out.println(Arrays.equals(instructors, theBeatles));







//        System.out.println(instructors[1]);
    }
}
