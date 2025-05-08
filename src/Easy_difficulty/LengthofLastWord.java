package Easy_difficulty;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int j = 0;

        if (!s.contains(" ")) {
            return s.length();
        }

        for (int i = s.length() - 1; 0 <= i; i--) {
            if (s.charAt(i) == ' ' && j == 0) {
                continue;
            } else if (s.charAt(i) == ' ' && j != 0) {
                break;
            } else {
                j++;
            }
        }
        return j;
    }
}
