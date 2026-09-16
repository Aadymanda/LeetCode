class Solution {
    public static boolean ispossible(int arr[],int mid,int days){
        int d=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
           
            if(sum+arr[i]<=mid){
                sum+=arr[i];

            }
            else{
                d++;
                sum=arr[i];
            }

        }
        d=d+1;
        
        return (d<=days);
    }
    public int shipWithinDays(int[] arr, int days) {
        int max=Integer.MIN_VALUE;
        int m=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            m+=arr[i];


        }
        int si=max;
        int ei=m;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(ispossible(arr,mid,days)){
                ei=mid-1;
            }
            else{
                si=mid+1;

            }

        }
        return si;
        
    }
}