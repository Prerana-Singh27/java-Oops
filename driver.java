public class driver {
    public static void main(String[] args){
    car myCar = new car();
    myCar.addFuel(6);
    myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        System.out.println( myCar.getCurrentFuelInLiters());
    }
}
