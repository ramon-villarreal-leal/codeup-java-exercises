public class Jet extends Vehicle {

    private int maximumAltitude;

    public Jet(boolean isOperable, int passengerCapacity, String powerSource, int maximumAltitude) {
        super(isOperable, passengerCapacity, powerSource);
        this.maximumAltitude = maximumAltitude;
    }

    public int getMaximumAltitude() {
        return maximumAltitude;
    }

    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    public void takeOff(){
        System.out.println("Taking off..");
    }

    public void turnOn(){
        System.out.println("Igniting jet engines...");
    }

    public void genericTurnOn(){
        System.out.println("Vehicle is turning on...");
    }

    @Override
    public String toString() {
        return "Jet{" +
                "maximumAltitude=" + maximumAltitude +
                '}' + super.toString();
    }
}
