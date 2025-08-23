// Maximum sub array leetcode problem no 53
public class MaximumSubArraySum {
    public static int maxSubArraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int value : nums) {
            currSum += value;
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) {
                currSum = 0;
            }

        }
        return maxSum;

    }

    public static void main(String[] args) {

        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int max = maxSubArraySum(arr);
        System.out.println(max);

    }
}
