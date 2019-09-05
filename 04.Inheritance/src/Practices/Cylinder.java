package Practices;

public class Cylinder extends Circle {
    double hight = 1.1;
    public Cylinder() {
    }
    public Cylinder(double hight) {
    this.hight = hight;
    }
    public Cylinder(double hight,double radius, String color, boolean filled) {
        super(radius,color,filled);
        this.hight = hight;
    }
    public double getVolume() {
        return this.hight * getArea();
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public double getHight(){
        return this.hight;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius " + getRadius() + " and hight " + getHight() + " of " + super.toString();
    }
}
