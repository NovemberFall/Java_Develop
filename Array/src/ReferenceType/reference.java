package ReferenceType;

import java.util.Arrays;

public class reference {
    public static void main(String[] args) {
        //integer number doesn't reference
//        int myIntValue = 10;
//        int anotherIntValue = myIntValue;
//        System.out.println("myIntValue = "+myIntValue);
//        System.out.println("anotherIntValue = "+anotherIntValue);
//
//        anotherIntValue++;
//
//        System.out.println("myIntValue = "+myIntValue);
//        System.out.println("anotherIntValue = "+anotherIntValue);

        //array will reference to another array, altering the original array's data
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));


    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};
    }
}
