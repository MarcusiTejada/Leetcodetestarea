package Easy_difficulty;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int[] numbers = new int[nums.length + 1];

        for (int num : nums) {
            numbers[num] = 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (numbers[i] == 0) {
                return i;
            }
        }

        return 0;
    }
}
