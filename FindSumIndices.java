//Leetcode problem no 1 Two Sum

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindSumIndices {
    // int x = 5;
    public static int[] findSumIndices(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int x = target - curr;
            if (map.containsKey(x)) {
                return new int[] { map.get(x), i };
            }
            map.put(curr, i);
        }

        return null;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, -2, 5 };
        int target = 6;
        System.out.println(Arrays.toString(findSumIndices(arr, target)));

    }
}