package grades;

import java.util.ArrayList;

public class Student {

    private String name;
//    private int grades;
    private ArrayList<Integer> grades;


    //Constructor


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //Default Constructor
    public Student() {

    }

    //getter
    public String getName() {
        return this.name;
    }

    //method for getting grade
    public void addGrade(int grade) {
        if(grade>=0 && grade<=100){
            grades.add(grade);
        } else
            System.out.println("Invalid grade.");
    }

    public double getGradeAverage() {
        double sum = 0;

        for(Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    //experimental main to create objects.
    public static void main(String[] args) {
        //creating an arrayList
        ArrayList<Student> students = new ArrayList<>();
        Student alsoRamoni = new Student("Ramon");
        alsoRamoni.addGrade(88);
        students.add(alsoRamoni);
        students.get(0).addGrade(99);
        System.out.println(students.get(0).getGradeAverage());

        Student laura = new Student("Laura");



//        students.add("Gus");
//        students.add("Ramon");
//        students.add("Laura");
//        students.add("Justin");


//        ArrayList<Integer> grade  = new ArrayList<>();
//        grade.add(88);
//        grade.add(71);
//        grade.add(85);
//        grade.add(54);
//        System.out.println(grade);



    }
}
