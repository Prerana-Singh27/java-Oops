public class car {

    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLiters;

    int noOfSeats;

    car(String color) {
        noOfWheels=4;
        this.color=color;
        maxSpeed=150;
        currentFuelInLiters=2;
        noOfSeats=5;
    }

    public car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out if fuel , can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode , please refuel");
        } else {
            System.out.println("Car is started...bruhhhh");
        }
        return this;

    }



    public void drive() {
            currentFuelInLiters--;
            System.out.println("Car is driving");

    }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelInLiters() {
        return currentFuelInLiters;
    }

}
