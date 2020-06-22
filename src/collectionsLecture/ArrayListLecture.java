package collectionsLecture;
import java.util.*;

public class ArrayListLecture {
    public static void main(String[] args) {
        // Creating ArrayList

        ArrayList<String> instructors = new ArrayList<>();
//        int[] threeNumbers = {10,2,6};
        List<Integer> threeNumbers = Arrays.asList(10,2,6);

        List<Integer> numbers = new ArrayList<>(threeNumbers);
        ArrayList<Person> people = new ArrayList<>();

        // Adding elements to ArrayList
        instructors.add("Justin");
        instructors.add("Sophie");
        instructors.add("Casey");
        instructors.add("Vivian");
        instructors.add(0, "David");
        //ArrayList automatically have a toString(); Method!!!
        //usually gives you a reference ID
        System.out.println(instructors);
        System.out.println(instructors.size());


        numbers.add(10);
        numbers.add(2);
        numbers.add(44);
        numbers.add(10);
        numbers.add(10);
        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.lastIndexOf(10));



        System.out.println(numbers.get(1));

        people.add(new Person("bob", "ross"));
        people.add(new Person("jane", "doe"));
        people.add(0, new Person("John", "Smith"));
        System.out.println(people.get(1));

        System.out.println(people);
        //we get hash codes!!!!

        for(Person x : people) {
            System.out.println(x.getFirstName());
        }

        System.out.println(instructors.contains("Justin")); //true lowercase false
        System.out.println(instructors.isEmpty()); //false
//        System.out.println(randomList.isEmpty);

        //works both ways!!!
        instructors.remove("David");
        instructors.remove(0);
        System.out.println(instructors);

    }
}

