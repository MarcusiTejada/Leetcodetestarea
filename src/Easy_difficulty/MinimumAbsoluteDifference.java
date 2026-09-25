package Easy_difficulty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> answer = new ArrayList<>();
        int absDiff = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (absDiff > Math.abs(arr[i + 1] - arr[i])) {
                absDiff = Math.abs(arr[i + 1] - arr[i]);
                answer.clear();
                answer.add(List.of(arr[i], arr[i + 1]));
            } else if (absDiff == Math.abs(arr[i + 1] - arr[i])) {
                answer.add(List.of(arr[i], arr[i + 1]));
            }
        }

        return answer;
    }
}
