package Medium_difficulty;

public class ZigZagConversion {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        String answer = "";
        int col = 0;
        int cycle = numRows * 2 - 2;
        while (col <= numRows + 1) {
            for (int i = 0; i <= s.length() - 1; i++) {
                if (col == i % cycle) {
                    answer += s.charAt(i);
                }
            }
            col++;
        }

        return answer;
    }
}
