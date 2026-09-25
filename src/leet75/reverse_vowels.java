package leet75;

import java.util.ArrayList;
import java.util.List;

public class reverse_vowels {
    public String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
        StringBuilder sb = new StringBuilder(s);

        int j = s.length() - 1;

        for (int i = 0; i < j; ) {
            if (vowels.contains(Character.toLowerCase(s.charAt(i))) && vowels.contains(Character.toLowerCase(s.charAt(j)))) {
                char temp = s.charAt(j);
                sb.setCharAt(j, s.charAt(i));
                sb.setCharAt(i, temp);
                i++;
                j--;
            } else if (vowels.contains(Character.toLowerCase(s.charAt(i))) && !vowels.contains(Character.toLowerCase(s.charAt(j)))) {
                j--;
            } else if (!vowels.contains(Character.toLowerCase(s.charAt(i))) && vowels.contains(Character.toLowerCase(s.charAt(j)))) {
                i++;
            } else {
                i++;
                j--;
            }
        }


        return sb.toString();
    }
}

