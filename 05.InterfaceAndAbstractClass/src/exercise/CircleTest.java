package exercise;

import practices.interfaceComparator.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.2);
        System.out.println(circle);
        circle.resize(15);
        System.out.println(circle);
    }
}
