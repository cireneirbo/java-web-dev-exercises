package exercises.controlflowandcollections;

import java.sql.SQLOutput;
import java.util.*;

public class ArrayListNumber {

    public static void main(String[] args) {

        //ArrayList<Integer>
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            numbersList.add(i);
        }
        System.out.println(sumOfEvenNumbersArrayList(numbersList));

        //Array int
        int numbers[] = {0,2,4,5,45,85,6,5,9,8,2,4,3};
        System.out.println(sumOfEvenNumbersArray(numbers));

        //ArrayList<String>
        ArrayList<String> stringList = new ArrayList<>();
        String storyString = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        storyString.replaceAll(",", " ");
        storyString.replaceAll("\\."," ");
        String[] storyArray = storyString.split(" ");
        for (String i : storyArray) {
            stringList.add(i);
        }
        printWords(stringList);

    }

    public static int sumOfEvenNumbersArray(int list[]) {
        int sumEvenTotal = 0;
        for(int i = 0; i < list.length; i++) {
            if (i % 2 == 0) {
                sumEvenTotal += i;
            }
        }

        return sumEvenTotal;
    }

    public static int sumOfEvenNumbersArrayList(ArrayList<Integer> list) {
        int sumEvenTotal = 0;
        for(int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                sumEvenTotal += i;
            }
        }

        return sumEvenTotal;
    }

    private static void printWords(ArrayList<String> strings) {

        for (String i : strings) {
            if(i.length() == 5) {
                System.out.println(i);
            } else {

            }
        }

    }

}


