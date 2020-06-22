package abstractLecture.pokemon;

public class Charizard extends Pokemon implements FireType {
    public Charizard(int hp, String name, String trainer) {
        super(hp,name, trainer);
    }


    @Override
    public void attack(int attack) {
        if(attack == 1) {
            fireBlast();
        } else if(attack == 2){
            ember();
        } else if(attack == 3){
            flameWheel();
        }
    }

    @Override
    public void fireBlast() {
        System.out.println(this.name + " used FireBlast");
    }

    @Override
    public void ember() {
        System.out.println(this.name + " used Ember!");
    }

    @Override
    public void flameWheel() {
        System.out.println(this.name + " used Flame wheel!");
    }

}
