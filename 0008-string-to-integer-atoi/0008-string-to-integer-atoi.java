class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        long ans=0;
        int i=0;
        int sign=1;
        if(s.length()==0){
            return 0;

        }
        
       if(s.charAt(0)=='-'||s.charAt(0)=='+'){
         sign=s.charAt(i)=='-' ? -1 :1;
         i++;
       }
        for(;i<s.length();i++){
            if(s.charAt(i)-'0'>=0 &&s.charAt(i)-'0'<=9){
                ans=ans*10+(s.charAt(i)-'0');
                if((ans*sign)>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                if((ans*sign)<Integer.MIN_VALUE ){
                    return Integer.MIN_VALUE;
                    
                }
            }
            else{
                return (int)(ans*sign);
            }
        }
        if(sign==-1){
            return (int)(ans*-1);
        }
        return (int)ans;
    }
}