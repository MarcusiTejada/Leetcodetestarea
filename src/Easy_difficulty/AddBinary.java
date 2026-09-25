package Easy_difficulty;

public class AddBinary {
    public String addBinary(String a, String b) {
        String answer;
        int big, small;
        answer = "";
        StringBuilder sb = new StringBuilder();

        if (a.length() > b.length()) {
            big = a.length();
            small = b.length();
        } else {
            big = b.length();
            small = a.length();
        }


        return answer;
    }
}
