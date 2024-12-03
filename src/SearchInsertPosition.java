public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            answer = mid;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        if (nums[answer] < target) {
            answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.print(searchInsert(nums, 7));
    }
}
