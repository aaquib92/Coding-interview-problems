import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllSubarraySumIndices {
    public static List<int[]> findAllSubarraySumIndices(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == target) {
                    result.add(new int[] { start, end });
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {


 int arr[] ={1,2,3,-2,5};
 int target =6;
        List<int[]> subarrays = findAllSubarraySumIndices(arr, target);
        System.out.println(subarrays);


        if (subarrays.isEmpty()) {
            System.out.println("No subarrays found with sum " + target);
        } else {
            System.out.println("Subarrays with sum " + target + ":");
            for (int[] indices : subarrays) {
                System.out.println(Arrays.toString(indices));
            }
        }

    }
}
