package exercises.controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newIDNumber;

        System.out.println("Enter your students (or 0 to finish):");

        // Get student names and ID#s
        do {

            System.out.print("ID Number: ");
            newIDNumber = input.nextInt();


            if (!newIDNumber.equals(0)) {
                System.out.print("Student: ");
                String newStudent = input.nextLine();
                students.put(newIDNumber, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newIDNumber.equals(0));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " >" + student.getValue() + "<");
        }

    }

}
