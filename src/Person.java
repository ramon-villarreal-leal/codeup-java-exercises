public class Person {
    //private variable of String name
    private String name;
    private int age;

    public int getAge(){return this.age;}

    public void setAge(int age) {
        this.age = age;
    }
    // getter
    public String getName() { return this.name; }
    // setter
    public void setName(String name) {

        this.name = name;
    }
    // method
    public void sayHello() {
        //this.name instead of getName() makes more sense -JUSTIN
        System.out.println("Hello my name is " + getName() + "\n");
    }
    // constructor
    public Person(String name) {
         this.setName(name);
         //justin did it like this!
//         this.name = name;


//         this.setAge(age);
    }

    public static void main(String[] args) {

        Person nameOf = new Person("Ramon");
        //constructor takes care of this
        //bottom code redundant.
        nameOf.setName("Laura");
        System.out.println(nameOf.getName());
        nameOf.sayHello();
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//
//
//        person1.sayHello();
//        person2.sayHello();


    }

}
