class Solution {
    public int maxProduct(int[] arr) {
        int ans=Integer.MIN_VALUE;
        int p=1;
        int s=1;
        int n=arr.length;

        for(int i=0;i<n;i++){
            p=p*arr[i];
            s=s*arr[n-i-1];
            ans=Math.max(ans,p);
            ans=Math.max(ans,s);
            if(arr[i]==0){
                p=1;               
            }
            else if(arr[n-i-1]==0){
                s=1;
            }
            
        }
        return ans;
        
    }
}