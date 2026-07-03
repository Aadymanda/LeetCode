class Solution {
    public String mergeAlternately(String s1, String s2) {
        int i=0;
        int j=0;
        StringBuilder ans=new StringBuilder("");
        while(i<s1.length()&&j<s2.length()){
            ans.append(s1.charAt(i++));
            ans.append(s2.charAt(j++));    
        }
        while(i<s1.length()){
            ans.append(s1.charAt(i++));
              
        }
        while(j<s2.length()){
            
            ans.append(s2.charAt(j++));    
        }
        return ans.toString();
    }
}