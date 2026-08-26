class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
      
        String ans="";
        int count=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
                
            }
            
               while(count>k){
                if(s.charAt(j)=='1'){
                    count--;
                }
                j++;
               }
                
            
            if(count==k){
                while(j<i && s.charAt(j)=='0'){
                    j++;
                }
                String cur=s.substring(j,i+1);
                if (ans.isEmpty() ||
                    cur.length() < ans.length() ||
                    (cur.length() == ans.length() && cur.compareTo(ans) < 0)) {

                    ans = cur;
                }

            }

        }
        return ans;

        
    }
}