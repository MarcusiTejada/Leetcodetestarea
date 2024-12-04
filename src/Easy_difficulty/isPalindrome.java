package Easy_difficulty;

public class isPalindrome {
    class Solution {
        public boolean isPalindrome(int x) {
            boolean answer;
            String basic = Integer.toString(x);
            StringBuilder sb = new StringBuilder(basic);
            String flip = sb.reverse().toString();
            answer = basic.equals(flip);
            return answer;
        }
    }
}
