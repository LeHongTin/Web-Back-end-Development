package Exercise.CircleAndCylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(3.2,"black",4);
        System.out.println(cylinder1);
        System.out.println("Volume is " + cylinder1.getVolume());
    }
}
