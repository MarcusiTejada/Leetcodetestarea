package neetcode;

public class contains_dupe {
    public boolean hasDuplicate(int[] nums) {
        for (int number : nums) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] == number) {
                    return true;
                }
            }
        }
        return false;
    }
}

