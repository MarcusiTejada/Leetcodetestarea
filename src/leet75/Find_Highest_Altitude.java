package leet75;

public class Find_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int pos = 0, answer = 0;

        for (int i = 0; i < gain.length; i++) {
            pos = pos + gain[i];
            if (pos > answer) {
                answer = pos;
            }
        }
        return answer;
    }
}
