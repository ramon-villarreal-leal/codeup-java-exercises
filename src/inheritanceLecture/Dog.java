package inheritanceLecture;

public class Dog extends Animal{

    private String breed;
    private String name;
    private String nameOfOwner;

    public void soutProtectedProp(){
        System.out.println(protectedProp);
    }



    public Dog(String species, int age, String breed, String name, String nameOfOwner) {
        super(species, age *7);
        this.breed = breed;
        this.name = name;
        this.nameOfOwner = nameOfOwner;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String species, int age, String breed){
        super(species, age);
        this.breed = breed;

    }



//    public static void main(String[] args) {
//        Dog d = new Dog();
//        System.out.println(d.getSpecies());
//        d.setSpecies("Canine");
//        System.out.println(d.getSpecies());
//    }

//    @Override
    //method overriding
    public void makeNoise(){
        System.out.println("Bark bark!!");
    }
    //method overloading
    public void makeNoise(String noise){
        System.out.println(noise);
    }

//    public int makeNoise(int x) {
//        return 3;
//    }
//
//    public boolean makeNoise(boolean yesNo) {
//        return true;
//    }

    public void makeGenericAnimalNoise(){
        //
//        super.makeNoise();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "species='" + this.getSpecies() + '\'' +
                ", age=" + this.getAge() +
                ", breed=" + breed + '\'' +
                '}';
    }


//    @Override
//    public String toString() {
//        return "Dog{" +
//                "breed='" + breed + '\'' +
//                '}' + super.toString();
//    }
}
