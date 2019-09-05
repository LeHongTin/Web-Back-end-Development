package Exercise.Point2dAndPoint3d;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(3.3f , 2.2f);
        System.out.println("Point A with x = " + point1.getX() + " y = " + point1.getY());
        point1.setXY(4.2f,1.1f);
        System.out.println("A new point A with x = " + point1.getXY()[0] + " x = " + point1.getXY()[1]);
    }
}
