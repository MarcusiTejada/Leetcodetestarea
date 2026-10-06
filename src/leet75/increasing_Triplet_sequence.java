package leet75;

public class increasing_Triplet_sequence {
    public boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) {
            return false;
        }

        int first = nums[0], second = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > first) {
                if (second > nums[i]) {
                    second = nums[i];
                } else if (second < nums[i]) {
                    return true;
                }
            } else {
                first = nums[i];
            }
        }

        return false;
    }
}



