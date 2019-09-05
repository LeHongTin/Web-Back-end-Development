package Practices;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(2.1);
        System.out.println(cylinder2);

        Cylinder cylinder3 = new Cylinder(3.4, 2.5, "Orange",false);
        System.out.println(cylinder3);
    }
}
