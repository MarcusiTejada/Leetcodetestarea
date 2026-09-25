package Easy_difficulty;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        if (digits.length == 1) {
            if (digits[0] + 1 == 10) {
                return new int[]{1, 0};
            } else {
                digits[0] = digits[0] + 1;
                return digits;
            }
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == 0 && digits[i] == 9) {
                int[] answer = new int[digits.length + 1];
                answer[0] = 1;
                for (int j = 1; j < answer.length; j++) {
                    answer[j] = 0;
                }

                return answer;
            } else {
                if (digits[i] + 1 == 10) {
                    digits[i] = 0;
                } else {
                    digits[i] = digits[i] + 1;
                    break;
                }
            }
        }
        return digits;
    }
}
