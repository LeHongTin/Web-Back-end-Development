package Practices;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c,r1,r2;
    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return Math.pow(b,2) - 4 * a * c;
    }

    public double getRoot1() {
            return ((-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a));
    }

    public double getRoot2() {
            return ((-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a));
          }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a b c : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation pt1 = new QuadraticEquation(a,b,c);
        if(pt1.getDiscriminant() > 0) {
            System.out.printf("pt co 2 ng : x1 = " + pt1.getRoot1() + "; x2 = " + pt1.getRoot2() );
        } else {
            if (pt1.getDiscriminant() == 0) {
                System.out.println("pt co 1 nghiem duy nhat x = " + pt1.getRoot1());
            } else {
                System.out.println("pt vo nghiem !!");
            }
        }



        scanner.close();
    }
}

