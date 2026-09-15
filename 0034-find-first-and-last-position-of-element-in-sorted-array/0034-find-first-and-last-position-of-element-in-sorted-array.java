class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int a=-1;
        int b=-1;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                a=mid;
                j=mid-1;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        i=0;
        j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                b=mid;
                i=mid+1;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        int []ans={a,b};
        return ans;
        
    }
}