package package1;

import java.util.Scanner;

/*
 * create class circle in pachage1 and that class calculate the area of circle.
 * Create a class Test in package2 which print the area of circle of package1
 */
public class Circle {
    private double radius;

    public Circle() {
        System.out.print("Enter radius : ");
        radius = new Scanner(System.in).nextDouble();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}