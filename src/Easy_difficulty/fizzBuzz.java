package Easy_difficulty;

import java.util.List;

public class fizzBuzz {
    public List<String> fizzBuzz(int n) {
        String[] asnswer = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                asnswer[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                asnswer[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                asnswer[i - 1] = "Buzz";
            } else {
                asnswer[i - 1] = String.valueOf(i);
            }
        }

        return List.of(asnswer);
    }
}
