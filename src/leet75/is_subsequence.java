package leet75;

public class is_subsequence {
    public boolean isSubsequence(String s, String t) {
        int point = 0;

        if (s.isEmpty() || t.isEmpty()) {
            return false;
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(point)) {
                point++;
            }
        }

        return point == s.length() - 1;
    }
}
