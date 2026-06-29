class Solution {
    public boolean check(int arr[],int h,int ans){
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=(int)Math.ceil(arr[i]*1.0/ans*1.0);
            if(count>h){
                return false;
            }
        }
        if(count>h){
            return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int i=1;
        int j=0;
        for(int k=0;k<arr.length;k++){
            j=Math.max(j,arr[k]);
        }
        int mid=-1;
        int ans=0;
        while(i<=j){
            mid=i+(j-i)/2;
            if(!check(arr,h,mid)){
                i=mid+1;
            }
            else{
                ans=mid;
                j=mid-1;
            }
        }
        return ans;


        
    }
}