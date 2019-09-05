package exercise;

import practices.interfaceComparator.Circle;
import practices.interfaceComparator.Rectangle;
import practices.interfaceComparator.Shape;
import practices.interfaceComparator.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(3,"blue",true);
        shapes[1] = new Rectangle(2,3,"black",false);
        shapes[2] = new Circle(3);

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
            if(shape instanceof Colorable) {
                System.out.println(((Colorable) shape).howToColor());
            }
        }
    }
}
