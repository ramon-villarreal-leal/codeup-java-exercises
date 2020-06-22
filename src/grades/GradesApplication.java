package grades;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import util.Input;
public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        //first student
        Student ramon = new Student("Ramoni");
        ramon.addGrade(88);
        ramon.addGrade(70);
        ramon.addGrade(85);
        ramon.getName();
        ramon.getGradeAverage();


        //second student
        Student laura = new Student("Laura");
        laura.addGrade(100);
        laura.addGrade(95);
        laura.addGrade(90);
        laura.getName();
        laura.getGradeAverage();


        //creating 3rd student object
        Student tom = new Student("Thomas");
        tom.addGrade(70);
        tom.addGrade(85);
        tom.addGrade(75);
        tom.getName();
        tom.getGradeAverage();


        //4th student object
        Student elaine = new Student("Elaine");
        elaine.addGrade(100);
        elaine.addGrade(80);
        elaine.addGrade(85);
        elaine.getName();
        elaine.getGradeAverage();


        //adding to map
        students.put("ramonipepperoni", ramon);
        students.put("calicocutie", laura);
        students.put("birdUp", tom);
        students.put("rubies226", elaine);

//        System.out.println(students.get("birdUp").getName());

        //START OF PROGRAM:
        System.out.println("Welcome!");

        System.out.println("\nHere are the GitHub usernames of our students: \n");

        for(String key : students.keySet()){
            System.out.print("|" + key + "| " );
        }
        //GET USER INPUT
        Input input = new Input();
        boolean continueConfirm;
        System.out.println("\n");

        do{
            System.out.println("What student would you like to see more information on? \n");
            String userInput = input.getString();
            if(students.containsKey(userInput)){
                System.out.println("\nName: " + students.get(userInput).getName()
                + " - Github Username: " + userInput +
                        "\nCurrent Average: " + students.get(userInput).getGradeAverage());
            } else{
                System.out.printf("\nSorry, no student found with the GitHub username of \"%s\" \n", userInput);
            }
            System.out.println("\nWould you like to see another student? [y/N] \n");
            continueConfirm = input.yesNo();
            System.out.println("Goodbye and have a wonderful day!");
        }while(continueConfirm);







    }
}
