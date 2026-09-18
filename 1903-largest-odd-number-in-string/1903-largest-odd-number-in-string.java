class Solution {
    public String largestOddNumber(String num) {
        int ch[] = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            ch[i] = num.charAt(i) - '0';
        }
        int index = -1;
        String a = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] % 2 != 0 ) {
                index = i;
                break;

            }
        }
        for (int i = 0; i <= index; i++) {
            a += ch[i];
        }

        return a;

    }
}