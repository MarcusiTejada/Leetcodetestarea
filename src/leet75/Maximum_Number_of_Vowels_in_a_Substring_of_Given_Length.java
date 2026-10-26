package leet75;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    public int maxVowels(String s, int k) {

        int answer = 0, running;
        boolean[] vowels = new boolean[26];
        vowels[0] = true;
        vowels[4] = true;
        vowels[8] = true;
        vowels[14] = true;
        vowels[20] = true;
        for (int i = 0; i < k; i++) {
            if (vowels[s.charAt(i) - 97]) {
                answer++;
            }
        }

        running = answer;

        for (int i = k; i < s.length(); i++) {
            if (vowels[s.charAt(i - k) - 97]) {
                running--;
            }
            if (vowels[s.charAt(i) - 97]) {
                running++;
            }
            if (running == k) {
                return running;
            }
            if (running > answer) {
                answer = running;
            }

        }

        return answer;
    }
}
