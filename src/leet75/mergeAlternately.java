package leet75;

public class mergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        String a = "";
        StringBuilder sb = new StringBuilder(word1);
        StringBuilder sb2 = new StringBuilder(word2);

        while (!sb.isEmpty() && !sb2.isEmpty()) {
            a += sb.charAt(0);
            a += sb2.charAt(0);

            sb.deleteCharAt(0);
            sb2.deleteCharAt(0);
        }

        if (!sb.isEmpty()) {
            a += sb.toString();
            return a;
        }

        if (!sb2.isEmpty()) {
            a += sb2.toString();
            return a;
        }
        return a;
    }
}
