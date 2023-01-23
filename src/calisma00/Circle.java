package calisma00;

import java.util.Scanner;

public class Circle {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        float radius;
        System.out.println("Enter the radius of the circle:");
        radius = scanner.nextFloat();
        float area = (float) (3.14159 * radius * radius);
        float perimeter = (float) (2 * 3.14159 * radius);
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
