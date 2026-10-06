package leet75;

public class String_Compression {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return chars.length;
        }

        int index = 0, count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (i == chars.length - 1) {
                if (chars[i] != chars[i - 1]) {
                    chars[index] = chars[i - 1];
                    index++;
                    if (count > 1) {
                        String temp = String.valueOf(count);
                        for (int j = 0; j < temp.length(); j++) {
                            chars[index] = temp.charAt(j);
                            index++;
                        }
                    }
                    chars[index] = chars[i];
                    index++;
                } else {
                    count++;
                    chars[index] = chars[i - 1];
                    index++;
                    if (count > 1) {
                        String temp = String.valueOf(count);
                        for (int j = 0; j < temp.length(); j++) {
                            chars[index] = temp.charAt(j);
                            index++;
                        }
                    }
                }
            } else if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                chars[index] = chars[i - 1];
                index++;
                if (count > 1) {
                    String temp = String.valueOf(count);
                    for (int j = 0; j < temp.length(); j++) {
                        chars[index] = temp.charAt(j);
                        index++;
                    }
                }
                count = 1;
            }
        }


        return index;
    }
}
