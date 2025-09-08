//class calculator--multiple add() methods ---add sum 2 integers, 3 integers or two doubles. diff no of parameters ..
public class Calculator {

    public static int add(int a , int b) {
        return a+b;
    }

    public static int add(int a , int b , int c) {
        return a + b + c;
    }

    public static double add(double a , double b ) {
        return a + b ;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,6));
        System.out.println(calc.add(5,6 ,7));
        System.out.println(calc.add(5.9,6.2));
    }
}

//class Vehicle ----method service()--subclass Car--override--service()--implementation--calls--super.service()

public class Vehicle {

    public  void service() {
        System.out.println("VEHICLE IS GETTING SERVICED ");

    }
}
