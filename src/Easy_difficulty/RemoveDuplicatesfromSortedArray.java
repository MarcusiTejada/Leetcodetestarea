package Easy_difficulty;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length || nums[i] != nums[i + 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
