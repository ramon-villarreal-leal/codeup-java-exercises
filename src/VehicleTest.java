public class VehicleTest {

    public static void turnOnVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle : vehicles){
            vehicle.turnOn();
        }
    }

    public static void main(String[] args) {
        Car car = new Car(true, 5, "electric", 34);

        Jet jet = new Jet(true, 300, "Gas", 4000);


            //old exercise
//        car.setOperable(true);
//        car.setPassengerCapacity(4);
//        car.setPowerSource("Electric");
//        car.setMilesPerGallon(25);
//
//        jet.setOperable(false);
//        jet.setPassengerCapacity(200);
//        jet.setPowerSource("Gas");
//        jet.setMaximumAltitude(40000);

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = car;
        vehicles[1] = jet;




        car.deployAirbag();
        System.out.println("Car:");
        System.out.println(car.toString());

        jet.takeOff();
        System.out.println("Jet:");
        System.out.println(jet.toString());
        turnOnVehicles(vehicles);

    }
}
