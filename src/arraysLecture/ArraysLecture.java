package arraysLecture;
import oopLecture.Person;

import java.util.ArrayList;
import java.util.Arrays;
public class ArraysLecture {
    static int numberOfPlanets = 8;

    public static String[] colorsCopy(String[] array, String color){
        String[] newCopy = Arrays.copyOf(array,array.length+1);

        newCopy[newCopy.length-1] = color;
        return newCopy;
    }
    public static void main(String[] args) {

//        anything that evaluates to an int, can be passed as an index.
        String[] planets = new String[numberOfPlanets];
        System.out.println(planets.length);

        planets[0] = "Mercury";
        planets[7] = "Neptune";
//        planets[8] = "Pluto";
//        This throws a compile time error. Index 8 is out of bounds/

        System.out.println(planets[0]);
        System.out.println(planets[7]);

        int[] myNumbers = {1,2,3,4,5};

        for(int x: myNumbers){
            ++x;
            System.out.println(x);
        }

        int[] otherNumbers = {5,4,3,2,1};
        Arrays.sort(otherNumbers);
        System.out.println(Arrays.toString(otherNumbers));

        System.out.println(Arrays.equals(myNumbers,otherNumbers));

//        create an Array containing Person objects
        Person justin = new Person("Justin", "Reich");

        Person[] instructors = new Person[2];
//        Person[] instructors = {new Person(), new Person(), new Person()};
        instructors[0] = justin;
        instructors[1] = new Person("Sophie","K");
        System.out.println(Arrays.toString(instructors));

        Person[] oneMoreInstructor = Arrays.copyOf(instructors,instructors.length + 1);
        System.out.println(Arrays.toString(oneMoreInstructor));
        oneMoreInstructor[2] = new Person("John","Smith");
        System.out.println(Arrays.toString(oneMoreInstructor));

        for(Person instructor : oneMoreInstructor){
            System.out.println(instructor.getFirstName());
        }


//        instructors[2] = new Person("David","Stephens");

//        Person sophie = instructors[1];
//        sophie.getLastName();

//        System.out.println(instructors[2].getLastName());

//        creating an Array of Car objects
        Car[] myCars = {new Car(), new Car(), null, null};
//        instantiate a new Object
        myCars[2] = new Car();
        myCars[2].setMake("Nissan");
        myCars[2].setModel("Rogue");
        myCars[2].setYear(2017);
        System.out.println(myCars[2].getMake());
        System.out.println(myCars[2].getModel());
        System.out.println(myCars[2].getYear());

        Car marksCar = myCars[0];
//        marksCar[0] = new Car();
        marksCar.setMake("Ford");
        System.out.println(marksCar.getMake());
        System.out.println(myCars[1].getMake());

        String[] theBeatles = {"John", "Ringo", "George", "Paul"};
        Arrays.sort(theBeatles);
        System.out.println(theBeatles);

        for(String beatle: theBeatles){
            System.out.println(beatle);
        }

//        Array manipulation methods
//        Arrays.fill
        String[] colors = new String[7];
        Arrays.fill(colors, "blue");
//        Arrays.toString
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colorsCopy(colors, "red")));
//        Arrays.equals
        System.out.println(Arrays.equals(instructors,theBeatles));
    }
}