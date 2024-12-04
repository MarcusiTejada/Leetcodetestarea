package Medium_difficulty;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        int answer = 1;
        String concat = "";

        if (s.isEmpty()) {
            return 0;
        }


        for (int i = 0; i < s.length(); i++) {
            if (!concat.contains(String.valueOf(s.charAt(i)))) {
                concat += s.charAt(i);
                if (concat.length() > answer) {
                    answer = concat.length();
                }
            } else {
                concat = concat.substring(concat.indexOf(i) + 1) + s.charAt(i);
            }
        }


        return answer;
    }
}
