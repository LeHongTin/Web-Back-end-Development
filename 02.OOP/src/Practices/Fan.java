package Practices;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FLAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "Blue";

    public Fan(boolean on, int speed, double radius, String color){
        this.on = on;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan " + getColor() + " is on with speed : "+ getSpeed() + ", daisus : " + getRadius() ;
        } else return "fan is off ";
    }
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFLAST() {
        return FLAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(true, Fan.FLAST,10, "yellow");
        System.out.println(fan1);

    }
}
