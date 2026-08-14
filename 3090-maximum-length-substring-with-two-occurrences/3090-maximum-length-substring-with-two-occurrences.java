class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0;
        HashMap<Character,Integer>hm=new HashMap<>();
        int max=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.get(ch)>2){
                hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}