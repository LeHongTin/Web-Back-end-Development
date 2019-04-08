package Exercise.DesignTriangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3f,4f,5f);
        System.out.println(triangle);
        System.out.println("Area is : " + triangle.getArea());
        System.out.println("Primeter is : " + triangle.getPrimeter());
    }


}
