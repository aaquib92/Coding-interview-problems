public class SecondHighestNumberInArray {
    public static int findSecondHighestNumber(int[] arr) {
        Integer first = null;
        Integer second = null;

        for (int nums : arr) {
            if (first == null || nums > first) {
                second = first;
                first = nums;
            } else if (first != nums && (second == null || nums > second)) {
                second = nums;
            }
        }
        return second;
    }

    public static void main(String[] args) {

         int[] numbers = {10, 20, 4, 45, 99, 99, 45};

        System.out.println(findSecondHighestNumber(numbers));

    }

}
