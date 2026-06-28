class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        
        int maxf=0;
        int maxw=0;
        int freq[]=new int[26];
        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)-'A']++;
            maxf=Math.max(maxf,freq[s.charAt(j)-'A']);
            int window=j-i+1;
            if(window-maxf>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            maxw=Math.max(maxw,j-i+1);
        }
        return maxw;

        
    }
}