class Solution {
    public int check(int[]arr,int mid,int k){
        int ans=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
               count++;
               if (count == k) {
                ans++;
                count = 0; 
               }
            }
            else{
               
                count=0;
            }
        }
            return ans;
        
    }
    public int minDays(int[] arr, int m, int k) {
        long n=arr.length;
        int a=1;
        if(n<(long)m*k){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        int si=min;
        int ei=max;
        while(si<=ei){
            int mid=(si+ei)/2;
            int val=check(arr,mid,k);
            
            if(val>=m){
                a=mid;
                ei=mid-1;
            }
            else{
                si=mid+1;
            }

        }
        return a;

        
    }
}