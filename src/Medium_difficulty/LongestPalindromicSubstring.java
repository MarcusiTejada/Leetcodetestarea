package Medium_difficulty;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String answer = "";

        if (s.isEmpty() || s.length() == 1) {
            return s;
        }


        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            String temp = check(s, left, right);
            String temp2 = check(s, left, right + 1);
            if (answer.length() < temp.length()) {
                answer = temp;
            }
            if (answer.length() < temp2.length()) {
                answer = temp2;
            }
        }

        return answer;
    }

    public String check(String s, int left, int right) {
        String answer = "";
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            String temp = s.substring(left, right + 1);
            if (temp.length() > answer.length()) {
                answer = temp;
            }
            left--;
            right++;
        }
        return answer;
    }
}

