class Solution {
    public int[] searchRange(int[] arr, int target) {
        int i=0;
        int j=arr.length-1;
        int si=-1;
        int ei=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                j=mid-1;
                si=mid;
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
             int mid=(i+j)/2;
            if(arr[mid]==target){
                i=mid+1;
                ei=mid;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }

        }
        int ans[]={si,ei};
        return ans;

        
    }
}