package subarrSum2;
public class subarrSum2 {
    public static void maxsubArr_prefix(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        // calculate prefix array
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        // subarray sums
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0? prefix[end]: prefix[end] - prefix[start - 1];
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("MaxSum = " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {3, 5, -2, 4};
        maxsubArr_prefix(numbers);
    }
}
