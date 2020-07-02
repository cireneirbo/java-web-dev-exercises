package exercises;

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

    /*private static String printWords() {



        //return ;
    }*/
}


/*
Write a static method to print out each word in a list that has exactly 5 letters.
Modify your code to prompt the user to enter the word length for the search.

BONUS: Instead of creating our own list of words,
what if we want to use the string from the Array Practice section?

Search “Java convert String to ArrayList” online to see how to split a
string into the more flexible ArrayList collection
*/
