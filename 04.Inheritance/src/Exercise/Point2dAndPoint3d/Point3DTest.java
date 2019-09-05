package Exercise.Point2dAndPoint3d;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point2 = new Point3D(4.3f,4.2f,4.1f);
        System.out.println("A point B with x = " + point2.getXYZ()[0] + " y = " + point2.getXYZ()[1] + " z = " + point2.getXYZ()[2] );
        point2.setXYZ(3f,4f,5f);
        System.out.println(point2);
    }
}
