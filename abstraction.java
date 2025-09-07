//abstract class Shape--abstract method calculateArea(). 2 subclasses Circle, square--attributes like radius,sides
public abstract class Shape {
    public abstract double calculateArea();
}

//subclasses class
public  class Circle extends Shape {
    private final  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }
}

//subclasses 2
public  class Square extends Shape  {
    private final  double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// create interface Flyable--abstract method fly() --abstract class Bird implements flyable---subclass eagle--extends Bird

public interface Flyable {
     void fly() ;
}

public abstract class Bird implements Flyable {
       private final String bread;

       public Bird(String bread) {
              this.bread = bread;
       }

       public String getBread() {
              return bread;
       }
}

public class Eagle extends Bird{

    public Eagle() {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");

    }
}
