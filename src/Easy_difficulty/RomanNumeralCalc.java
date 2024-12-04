package Easy_difficulty;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralCalc {
    public int romanToInt(String s) {
        int answer = 0;
        Map<Character, Integer> key = new HashMap<>();
        key.put('I', 1);
        key.put('V', 5);
        key.put('X', 10);
        key.put('L', 50);
        key.put('C', 100);
        key.put('D', 500);
        key.put('M', 1000);
        char[] roman = s.toCharArray();
        int i = 0;

        while (i < roman.length) {
            if (i + 1 == roman.length) {
                answer = answer + key.get(roman[i]);
                i++;
            } else {
                if (roman[i] == (roman[i + 1])) {
                    answer = answer + key.get(roman[i]);
                    i++;
                } else {
                    String str = "" + roman[i] + roman[i + 1];
                    switch (str) {
                        case "IV":
                            answer = answer + 4;
                            i = i + 2;
                            break;
                        case "IX":
                            answer = answer + 9;
                            i = i + 2;
                            break;
                        case "XL":
                            answer = answer + 40;
                            i = i + 2;
                            break;
                        case "XC":
                            answer = answer + 90;
                            i = i + 2;
                            break;
                        case "CD":
                            answer = answer + 400;
                            i = i + 2;
                            break;
                        case "CM":
                            answer = answer + 900;
                            i = i + 2;
                            break;
                        default:
                            answer = answer + key.get(roman[i]);
                            i++;
                    }
                }
            }
        }

        return answer;
    }
}
