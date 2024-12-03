
public class FindtheIndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return -1;
        } else if (needle.length() > haystack.length()) {
            return -1;
        }

        int answer = -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
