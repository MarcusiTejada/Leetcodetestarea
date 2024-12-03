
public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return -1;
        } else if (needle.length() > haystack.length()) {
            return -1;
        }

        int answer = -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) {
                break;
            }
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
