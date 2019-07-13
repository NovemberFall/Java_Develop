```java
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int [] myIntArray = new int[10];
//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50;

//        int [] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        double [] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Elment " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is" + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum/(double)array.length;
    }
}
```
`Output:`
```py
Enter 5 integer values.
3
4
5
6
7
Elment 0, typed value was 3
Elment 1, typed value was 4
Elment 2, typed value was 5
Elment 3, typed value was 6
Elment 4, typed value was 7
The average is 5.0
```

# Array Challenge
```java
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.
```
---

```java
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
//the other way:
//        int[] sortedArray = Arrays.copyOf(array, array.length);        
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}



//output:
Enter 5 integer values:
50
160
40
23
222
Element 0 contents 222
Element 1 contents 160
Element 2 contents 50
Element 3 contents 40
Element 4 contents 23
```
# Reference Type

```java
public class reference {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("myIntValue = "+myIntValue);
        System.out.println("anotherIntValue = "+anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = "+myIntValue);
        System.out.println("anotherIntValue = "+anotherIntValue);

        int [] myIntArray = new int[5];
        int [] anotherArray = myIntArray;

        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+ Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+ Arrays.toString(anotherArray));
    }
}

//Output:
myIntValue = 10
anotherIntValue = 10
myIntValue = 10
anotherIntValue = 11
myIntArray = [0, 0, 0, 0, 0]
anotherArray = [0, 0, 0, 0, 0]


myIntArray = [1, 0, 0, 0, 0]
anotherArray = [1, 0, 0, 0, 0]
```
- integer number doesn't reference
- array will reference to another array, altering the original array's data

`Now altering`
```java
public class reference {
    public static void main(String[] args) {

        //array will reference to another array, altering the original array's data
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));


    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}

//Output:
myIntArray = [0, 0, 0, 0, 0]
anotherArray = [0, 0, 0, 0, 0]
myIntArray = [2, 0, 0, 0, 0]
anotherArray = [2, 0, 0, 0, 0]
```
`array = new int[] {1, 2, 3, 4, 5};` 
- This line is dereferencing the parameter but that doesn't mean the original array will be dereferenced.


```java
public class reference {
    public static void main(String[] args) {
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

//Output:
myIntArray = [0, 0, 0, 0, 0]
anotherArray = [0, 0, 0, 0, 0]
myIntArray = [2, 0, 0, 0, 0]
anotherArray = [4, 5, 6, 7, 8]
```

# minimum challenge
- Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
- The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered. 
- Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array. 
- In the main() method read the count from the console and call the method readIntegers() with the count parameter. 
- Then call the findMin() method passing the array returned from the call to the readIntegers() method.
- Finally, print the minimum element in the array.
<!-- Tips: 
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name ÅeMinElementChallengeÅf -->

```java
public class minimum {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = "+returnedMin);
    }

    private static int[] readIntegers(int count) {
        int [] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}

//output:
Enter count: 
8

Enter a number:
45
Enter a number:
32
Enter a number:
22
Enter a number:
444
Enter a number:
111
Enter a number:
6
Enter a number:
8
Enter a number:
9
min = 6
```

`The other way by using a ternary`
```java
public class minimum {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = "+returnedMin);
    }

    private static int[] readIntegers(int count) {
        int [] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = array[i] < min ? array[i] : min;
        }
        return min;
    }
}
```


# Reverse Challenge
- Write a method called reverse() with an int array as a parameter.
- The method should not return any value. In other words, the method is allowed to modify the array parameter.
- In main() test the reverse() method and print the array both reversed and non-reversed.
- To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
- For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
<!-- 
Tip:
	-Create a new console project with the name ÅeReverseArrayChallengeÅf -->
```java
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

//Output:
Array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Reversed array = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
```



