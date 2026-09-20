class Solution {
    public boolean check(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();    
        int max=0;
        int maxi=0;
        int maxj=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(check(s,i,j)){
                    if(j-i+1>max){
                        maxi=i;
                        maxj=j;
                        max=j-i+1;
                    }
                }

            }

        }
        return s.substring(maxi,maxj+1);
        
    }
}