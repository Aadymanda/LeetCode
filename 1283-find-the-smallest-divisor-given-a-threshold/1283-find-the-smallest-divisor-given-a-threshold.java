class Solution {
    public static boolean ispossible(int arr[],int mid,int t){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/(double)mid);

        }
        return sum<=t;
    }
    public int smallestDivisor(int[] arr, int threshold) {
          int ans=0;
        int si=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=Math.max(arr[i],max);
            }

        }
        int ei=max;
        while(si<=ei){
            int mid=(si+ei)/2;
          
            if(ispossible(arr,mid,threshold)){
                ans=mid;
                ei=mid-1;

            }
            else{
                si=mid+1;
            }
        }
        return ans;
        
    }
}