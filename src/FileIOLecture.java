import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {

    public static void main(String[] args) throws IOException {
        Path myDirectory = Paths.get("src");
        Path myFile = Paths.get("src/grades","Student.java");
        Path gitignore = Paths.get(".gitignore");

        System.out.println(Files.exists(myDirectory));
        System.out.println(Files.exists(myFile));
        System.out.println(Files.notExists(gitignore));

        String directory = "test";
        Path myTest = Paths.get(directory);
        Path helloFile = Paths.get(directory,"hello.txt");

        if(Files.notExists(myTest)){
            try {
                Files.createDirectory(myTest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(Files.notExists(helloFile)){
            try {
                Files.createFile(helloFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        Writing to hello.txt
        String[] names = {"justin","sophie","vivian"};
        List<String> instructors = Arrays.asList(names);
//        instructors.add("Casey");

//        List<String> students = new ArrayList<>();
//        students.add("Laura");
//        students.add("Andrew");
//        students.add("Mark");
//        students.add("Aaron");
//        students.add("Jay");

//        try {
//            Files.write(helloFile,students);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            List<String> myStudents = Files.readAllLines(helloFile);
            System.out.println(myStudents);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> myStudents = Files.readAllLines(helloFile);
        for(String student : myStudents){
            System.out.println(student);
        }

        String newStudent = "Ramon";
        List<String> newStudents = Arrays.asList("Ramon","Justin","Julia","Augustine","Sophie");
        Files.write(helloFile,newStudents,StandardOpenOption.APPEND);

        List<String> newClass = new ArrayList<>();

        for(String student : myStudents){
            if(student.equals("Justin")){
                newClass.add("Shelby");
                continue;
            }
            newClass.add(student);
        }

        Files.write(helloFile,newClass);
        System.out.println(newClass);

    }
}
