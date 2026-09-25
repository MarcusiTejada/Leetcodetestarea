package leet75;

public class Greatest_Common_Divisor_of_Strings {
    public String gcdOfStrings(String str1, String str2) {
        String check = "", answer = "";
        int x = str1.length(), y = str2.length();
        int gcd;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        gcd = x;
        check = str1.substring(0, gcd);
        if (check.repeat(str1.length() / gcd).equals(str1) && check.repeat(str2.length() / gcd).equals(str2)) {
            return check;
        }

        return answer;
    }
}
