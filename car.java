public class car {

    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

    public void drive() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out if fuel");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode , please refuel");
            currentFuelInLiters--;
        } else {
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }
    }
    public void addFuel(float fuel) {
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelInLiters() {
        return currentFuelInLiters;
    }

}
