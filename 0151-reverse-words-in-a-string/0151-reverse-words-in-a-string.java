class Solution {

    public String rev(String a) {
        return new StringBuilder(a).reverse().toString();
    }

    public String reverseWords(String s) {
        String a = s.trim();

        StringBuilder ans = new StringBuilder("");
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i)!=' ') {
                b += a.charAt(i);
            } else {
                while(a.charAt(i-1)==' '){
                    i--;
                }
                ans.append(rev(b));
                ans.append(" ");
                b = "";
            }

        }
        ans.append(rev(b));
        return ans.toString().trim();

    }
}