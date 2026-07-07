class Solution {
    public int searchInsert(int[] arr, int target) {
        if(target<arr[0]){
            return 0;
        }
        if(target>arr[arr.length-1]){
            return arr.length;
        }
        int i=0;
        int j=arr.length-1;
        int ans=0;
        int mid=0;
        while(i<=j){
             mid=i+(j-i)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
               
                i=mid+1;
               
            }
            else{
                j=mid-1;
            }
        }
        return i;
        
        
    }
}