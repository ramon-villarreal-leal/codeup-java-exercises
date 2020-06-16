package inheritanceLecture;

public class AnimalTest {
    public static void main(String[] args) {
//        Animal a = new Animal();

//        Dog d = new Dog();
//        Cat c = new Cat();

//        a.setAge(3);
//        a.setSpecies("Primate");
//
//        d.setSpecies("Canine");
//        d.setAge(7);
//
//        c.setSpecies("Feline");
//        c.setAge(6);
//
////        a.makeNoise();
////        d.makeNoise();
////        c.makeNoise();
//
//        System.out.println(a.toString());
//        System.out.println("=============");
//        System.out.println(d.toString());
//        System.out.println("=============");
//        System.out.println(c.toString());

        Dog d = new Dog(
                "Canine",
                3,
                "pug",
                "Mr Frekcles",
                "Mr. Smith");

        d.soutProtectedProp();




//        System.out.println(d.toString());
//        d.makeGenericAnimalNoise();

//        Animal a = new Animal();
//        a.setSpecies("Primate");
//        a.setAge(100);
//
//        a.makeNoise();


    }
}
