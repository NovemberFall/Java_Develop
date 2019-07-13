package reverseChallenge;

import java.util.Arrays;

/*
-Write a method called reverse() with an int array as a parameter.

        -The method should not return any value. In other words, the method is allowed to modify the array parameter.

        -In main() test the reverse() method and print the array both reversed and non-reversed.

        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


        Tip:
        -Create a new console project with the name ÅeReverseArrayChallenge */
public class reverse {
    public static void main(String[] args) {
        int []array={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array = "+ Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int index = 0; index < halfLength; index++) {
            int temp = array[index];
            array[index] = array[maxIndex - index];
            array[maxIndex - index] = temp;
        }
    }
}
