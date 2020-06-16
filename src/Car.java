public class Car extends Vehicle {

    private int milesPerGallon;

    public Car(boolean isOperable, int passengerCapacity, String powerSource, int milesPerGallon) {
        super(isOperable, passengerCapacity,powerSource);
        this.milesPerGallon = milesPerGallon;
    }

    public void deployAirbag() {
        System.out.println("Deploying airbag..");
    }

    public void turnOn(){
        System.out.println("Cranking engine...");
    }

    public void genericTurnOn(){
        System.out.println("Vehicle is turning on...");
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    @Override
    public String toString() {
        return "Car{" +
                "milesPerGallon=" + milesPerGallon +
                '}' + super.toString();
    }
}
