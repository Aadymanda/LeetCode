class Solution {
    public int smallestNumber(int n, int t) {
        if(n==1){
            return t;
        }
        
       
        int num=n;
        int ans=1;
        int sol=-1;
        while(sol!=0){
            ans=1;
        
            while(n>0){
                int rem=n%10;
                ans=ans*rem;
                n=n/10;
                
            }
            sol=ans%t;
            if(sol!=0){
                num++;
            }
            n=num;
       
            
        }
    
        return num;
    }

}