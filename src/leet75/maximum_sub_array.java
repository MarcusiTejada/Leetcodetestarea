package leet75;

public class maximum_sub_array {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, maxAvgVal = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxAvgVal = sum / k;

        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            if (sum / k > maxAvgVal) {
                maxAvgVal = sum / k;
            }
        }

        return maxAvgVal;
    }
}
