package leet75;

import java.util.ArrayList;
import java.util.List;

public class Kids_with_greatest_num_candles {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int largest = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > largest) {
                largest = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= largest) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }

        return answer;
    }
}
