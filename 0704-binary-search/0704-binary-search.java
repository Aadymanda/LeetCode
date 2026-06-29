class Solution {
    public int search(int[] arr, int target) {
        int ans=-1;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
        
    }
}