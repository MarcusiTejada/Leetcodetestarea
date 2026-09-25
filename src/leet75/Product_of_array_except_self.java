package leet75;

public class Product_of_array_except_self {
    public int[] productExceptSelf(int[] nums) {
        int temp = 1;
        int[] answer = new int[nums.length];
        if (nums.length == 2) {
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = temp;
            temp = temp * nums[i];
        }
        temp = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * temp;
            temp = temp * nums[i];
        }

        return answer;
    }
}

/* 1 2 3 4
 * 1,1,2,6
 * pre
 * 1,1,2,6
 * 1,1,8,6
 * 1,12,12,6
 * 12,12,12,6
 * */
