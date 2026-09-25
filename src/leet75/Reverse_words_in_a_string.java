package leet75;

public class Reverse_words_in_a_string {
    public String reverseWords(String s) {
        String answer = "";
        StringBuilder temp = new StringBuilder();
        if (!s.contains(" ")) {
            return s.trim();
        }
        s = s.trim();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ' && i == 0) {
                temp.append(s.charAt(i));
                temp.reverse();
                answer = answer + temp;
            } else if (s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            } else if (s.charAt(i) == ' ' && !temp.isEmpty()) {
                temp.reverse();
                answer = answer + temp + " ";
                temp.setLength(0);
            }
        }

        return answer;
    }
}
