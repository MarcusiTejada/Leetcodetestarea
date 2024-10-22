import java.util.ArrayList;
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
        ArrayList<Integer> numbers = new ArrayList<>();
        char[] roman = s.toCharArray();
        int i = 0;

        while (i < roman.length) {
            if (i + 1 == roman.length) {
                numbers.add(key.get(roman[i]));
                i++;
            } else {
                if (roman[i] == (roman[i + 1])) {
                    numbers.add(key.get(roman[i]));
                    i++;
                } else {
                    String str = "" + roman[i] + roman[i + 1];
                    switch (str) {
                        case "IV":
                            numbers.add(4);
                            i = i + 2;
                            break;
                        case "IX":
                            numbers.add(9);
                            i = i + 2;
                            break;
                        case "XL":
                            numbers.add(40);
                            i = i + 2;
                            break;
                        case "XC":
                            numbers.add(90);
                            i = i + 2;
                            break;
                        case "CD":
                            numbers.add(400);
                            i = i + 2;
                            break;
                        case "CM":
                            numbers.add(900);
                            i = i + 2;
                            break;
                        default:
                            numbers.add(key.get(roman[i]));
                            i++;
                    }
                }
            }
        }
        for (int number : numbers) {
            answer += number;
        }

        return answer;
    }
}
