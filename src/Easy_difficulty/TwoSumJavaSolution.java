package Easy_difficulty;

import java.util.HashMap;
import java.util.Map;

public class TwoSumJavaSolution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map <Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            int y = target - cur;
            if(map.containsKey(y)){
                answer[0] = i;
                answer[1] = map.get(y);
            }else{
                map.put(cur,i);
            }
        }
        return answer;
    }
}