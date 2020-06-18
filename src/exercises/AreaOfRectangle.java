package exercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the rectangle's width?");
        Double widthIn = input.nextDouble();
        System.out.println("What is the rectangle's height?");
        Double heightIn = input.nextDouble();

        System.out.println(widthIn * heightIn);
    }
}
