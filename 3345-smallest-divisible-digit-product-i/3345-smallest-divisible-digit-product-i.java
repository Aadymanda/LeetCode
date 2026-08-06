class Solution {
    public int smallestNumber(int n, int t) {
        int a=((n/10)+1)*10;
        for(int i=n;i<=a;i++){
            int j=i;
            int ans=1;
            while(j>0){
                int rem=j%10;
                ans=ans*rem;
                j=j/10;

            }
            if(ans%t==0){
                return i;
            }

        }
        return 1;
        
    }
}