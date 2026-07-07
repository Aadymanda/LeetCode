class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        String ans="";
      
        while(n>0){
            int rem=n%10;
            if(rem>0){
                ans+=rem;
                sum+=rem;
            }
            n=n/10;

        }
        String a="";
        for(int i=ans.length()-1;i>=0;i--){
           a+=ans.charAt(i);
        }
        if(!a.equals("")){
        int b=Integer.parseInt(a);long res=b*sum;
        return res;
        }
        return 0;
        

        
    }
}