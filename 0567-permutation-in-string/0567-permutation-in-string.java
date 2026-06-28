class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int fa[] = new int[26];
        int fb[] = new int[26];
        int n = s1.length();
        int m = s2.length();
        if (n > m)
            return false;
        for (int i = 0; i < n; i++) {
            fa[s1.charAt(i) - 'a']++;
            fb[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(fa, fb))
            return true;
        for (int i = 1; i <= m - n; i++) {
            fb[s2.charAt(i - 1) - 'a']--;
            fb[s2.charAt(i + n-1) - 'a']++;
            if (Arrays.equals(fa, fb))
                return true;
        }
        return false;

    }
}