// Write a Java program to reverse the elements of an array.
package Array.Easy;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 4, 8, 0};
        int[] newarray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            newarray[i] = array[array.length - 1 -i];
        }
        System.out.println("\n" + Arrays.toString(newarray));
    }
}