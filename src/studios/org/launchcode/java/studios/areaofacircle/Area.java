package studios.org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is the circle's radius?");
            Double radiusIn = input.nextDouble();

            while (radiusIn <= 0) {
                System.out.println("Please enter a positive number");
                System.out.println("What is the circle's radius?");
                radiusIn = input.nextDouble();

            }
            System.out.println("The area of a circle of radius " + radiusIn + " is: " + Circle.getArea(radiusIn));
        }
}
