import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int totalLength = arr1.length + arr2.length;
        int[] merged = new int[totalLength];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        return merged;
    }

    public static void main(String[] args) {

        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 40, 50, 60 };
        int[] merged = mergeArray(arr1, arr2);
        System.out.println(Arrays.toString(merged));

    }
}
