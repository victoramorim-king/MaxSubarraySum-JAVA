public class Main {
    public static void main(String[] args) {
        int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = MaxSubarraySum.findMaxSubarraySum(array);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}