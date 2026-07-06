class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int ans=Integer.MAX_VALUE;
        int l=0;
        int r=0;
        int sum=0;
        while(r<arr.length){
            if(sum+arr[r]>=target){
                ans=Math.min(ans,r-l+1);
                sum=sum+arr[r];
                while(sum>=target){
                    sum=sum-arr[l];
                    l++;
                    if(sum>=target){
                       ans=Math.min(ans,r-l+1); 
                    }
               
                } r++;
                
            }
            else{
                sum=sum+arr[r];
                r++;
            }
            
        }
       
        return (ans==Integer.MAX_VALUE)?0:ans;
    }
}