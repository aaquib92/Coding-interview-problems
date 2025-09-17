// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Arrays;

public class LeftRotateArray {

    // Rotate array to the left by d positions
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle rotations larger than array size

        // Step 1: Copy first d elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift the rest to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Step 3: Copy temp elements to the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 3; // number of left rotations

        // Call rotate method
        leftRotate(arr, k);

        // Print rotated array
        System.out.println("Rotated array: " + Arrays.toString(arr));

    }
}