package Practices;

import java.lang.annotation.Retention;
import java.util.Scanner;

public class Rectangle {
        public double weight;
        public double height;

        public Rectangle(){
        };

        public Rectangle(double weight, double height) {
            this.weight = weight;
            this.height = height;
        }
        public double getArea(){
            return this.weight * this.height;
        }
        public double getPerimeter() {
            return (this.weight + this.height)*2;
        }
        public String toString(){
            return "Area is : " + getArea() + "\nPrimeter is : " + getPerimeter();
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("weight is : ");
        double weight = scanner.nextDouble();
        System.out.println("Height is : ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(weight,height);
        System.out.println(rectangle);

        scanner.close();

    }


}
