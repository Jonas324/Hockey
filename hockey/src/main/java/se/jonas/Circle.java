package se.jonas;

public class Circle {

    private double radius;
    private double area;

    Circle(double radius) {
        super();
        setradius(radius);
    }

    public double calculateArea() {
        area = (double) Math.PI * radius; 
        return area;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }
    
}
