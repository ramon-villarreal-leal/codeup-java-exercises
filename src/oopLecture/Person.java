package oopLecture;

public class Person {

//        // SLIDE 3
//        public String firstName;
//        public String lastName;
//        public int age = -1;
//        public char character;
//        boolean isEmployed;


//    public String firstname;
//    public String lastName;
//    public String password;
//
//    public void setPassword(String, password) {
//        this.password = Password.hash(password);
//    }









    // SLIDE 4

        // instance variables
//        public String firstName;
//        public String lastName;
//
//        // instance method
//        public String sayHello() {
//                return lastName + ", " + firstName + " says hi!";
//        }
//

    // SLIDE 7
        public static long worldPopulation = 7_500_000_000L; // class property
        public String name;                                  // instance property

        public static void main(String[] args) {

                System.out.println(Person.worldPopulation);
                Person.worldPopulation -= 1;
                System.out.println(worldPopulation);


                Person theBestDrummerAlive = new Person();
                theBestDrummerAlive.name = "Neil Peart";
                Person.worldPopulation += 1; // accessing a static property
                // this also works, but is usually not a good idea
            //use Person instead
                System.out.println(Person.worldPopulation); // 7500000001
                // DONT DO THIS, it will not compile
//                 System.out.println(Person.name);
        }

}