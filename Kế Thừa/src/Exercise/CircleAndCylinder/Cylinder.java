package Exercise.CircleAndCylinder;

public class Cylinder extends Circle{
    public double hight;

    public Cylinder(){

    }

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getVolume() {
        return super.getArea()*this.hight;
    }

    @Override
    public String toString() {
        return "A Clindder with hight = " + this.hight + " of " + super.toString() + " " ;
    }
}
