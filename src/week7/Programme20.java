package week7;

import java.util.Arrays;

import static com.sun.org.apache.regexp.internal.RETest.test;

//Write a Java program to test if an array contains a specific value.
public class Programme20 {
    public static void main(String[] args) {

    }

    public void specificValue() {
        int[] myArray = {1, 8, 5, 67, 45};
        System.out.println("Original Arrays: " + Arrays.toString(myArray));
        System.out.println("Result:" + test(myArray));

    }

    public static boolean test(int[] numbers) {
        for (int number : numbers) {
            if (number == 0 || number == -1) {
                return false;
            }
        }
        return true;
    }
}