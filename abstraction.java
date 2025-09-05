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
