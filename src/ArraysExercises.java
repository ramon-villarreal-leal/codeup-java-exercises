


import java.util.Arrays;

public class ArraysExercises {
    //add Person method that grabs an array of person objects
    public static Person[] addPerson(Person[] people, Person person) {
        //visually see
        System.out.println("original length = "+ people.length);

        Person[] newName = Arrays.copyOf(people, people.length+1);
        //visiaully see length
        System.out.println("adding one = "+newName.length);
        //adding to the last one since it does not exist
        newName[newName.length-1] = person;
        return newName;
    }


    public static void main(String[] args) {
        //creating an array of objects 1-5 as int data types
        int[] numbers = {1, 2, 3, 4, 5};
        //turning to String since they will not be able to show
        System.out.println(Arrays.toString(numbers));
        // creating an array with 3 objects
        Person[] names = new Person[3];

//        Person[] extraDude = addPerson(names, );
//        System.out.println(Arrays.toString(extraDude));

//        names = addPerson(names, new Person("Kyle"));

        names[0] = new Person("Laura");
        names[1] = new Person("Ramon");
        names[2] = new Person("Elaine");
        // uses the add person  method to add to index of an array!
        names = addPerson(names, new Person("Kyle"));



        for(Person name : names) {
            System.out.println(name.getName());
        }


    }
}
