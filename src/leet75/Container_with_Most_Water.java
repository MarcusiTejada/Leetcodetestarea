package leet75;

public class Container_with_Most_Water {
    public int maxArea(int[] height) {

        if (height.length == 2) {
            return Math.min(height[0], height[1]);
        }

        int answer = 0, left = 0, right = height.length - 1;


        while (left < right) {
            if (answer < (Math.min(height[left], height[right]) * (right - left))) {
                answer = Math.min(height[left], height[right]) * (right - left);
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }

        return answer;
    }

}
