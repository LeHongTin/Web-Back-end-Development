package Exercise.CircleAndCylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.2,"yellow");
        System.out.println(circle1);
        System.out.println("Area is " + circle1.getArea());
        circle1.setColor("red");
        circle1.setRadius(2.3);
        System.out.println(circle1);

    }
}
