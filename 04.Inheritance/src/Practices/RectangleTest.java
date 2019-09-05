package Practices;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(2.3, 5.8);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle3);
        System.out.println("Perimeter rectangle2 is : " + rectangle2.getPerimeter());
        System.out.printf("\nArea rectangle2 is : %5.2f", rectangle2.getArea());
    }
}
