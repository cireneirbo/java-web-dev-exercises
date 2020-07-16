package exercises.controlflowandcollections;


import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] someNumbers =  { 1, 1, 2, 3, 5, 8 };
        for(int i : someNumbers) {
            if (i%2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        String storyString = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] storyArray = storyString.split("\\.");
        for (String i : storyArray) {
            System.out.println(i.trim() + '.');
        }
    }
}


