package leet75;

import java.util.HashMap;
import java.util.Map;

public class Max_number_of_KSum_pairs {
    public int maxOperations(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (key == k - key) {
                if (map.get(key) > 1) {
                    answer += map.get(key) / 2;
                }
            } else if (map.containsKey(k - key) && map.get(k - key) > 0) {
                int temp = Math.min(map.get(k - key), map.get(key));
                answer += temp;
                map.put(k - key, map.get(k - key) - temp);
                map.put(key, map.get(key) - temp);
            }
        }

        return answer;

    }
}
