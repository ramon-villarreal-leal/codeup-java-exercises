package inheritanceLecture;

public class Animal {
    //when using private on species d.getspecies() on dog class

    private String species;
    private int age;
    protected String protectedProp = "Protected prop value";

//    public Animal() {
//
//    }

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }
//
//    public void makeNoise() {
//        System.out.println("Animal is making some noise...");
//    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Animal a = new Animal("Primate", 7);
    }

//    public String printSummary () {
//        return "Species: " + this.species + "\nAge: " + this.age;
//    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + this.getSpecies() + '\'' +
                ", age=" + this.getAge() +

                '}';
    }

}
