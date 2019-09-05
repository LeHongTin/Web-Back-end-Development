package Exercise.MoveablePoint;

public class MoveableTest {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(2.2f, 3.3f, 4.4f, 5.5f);
        System.out.println(point);
        System.out.println(point.move());
    }
}
