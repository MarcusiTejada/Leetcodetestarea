package leet75;

public class increasing_Triplet_sequence {
    public boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) {
            return false;
        }

        int first, second = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (second < nums[j]) {
                    return true;
                }
                if (first < nums[j] && second > nums[j]) {
                    second = nums[j];
                }
            }
            second = Integer.MAX_VALUE;
        }

        return false;
    }
}


/*
 * [1,5,0,4,1,3]
 * first = 1 count = 1 j = 5
 * first = 5 count = 2 j = 0
 * first = 0 count = 2 j = 4
 * first = 4 count = 3 j = 1
 *
 *
 *
 *
 *
 * */
