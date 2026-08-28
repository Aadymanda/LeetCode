class Solution {
    public boolean ispalindrome(String s, int i, int j) {
       
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int max = -1;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (ispalindrome(s, i, j)) {
                    l = j - i + 1;
                    if (max < l) {
                        max = l;
                        start = i;
                        end = j;

                    }

                }
            }
        }
        return s.substring(start,end+1);

    }
}