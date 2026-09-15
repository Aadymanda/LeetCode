class Solution {
    public int findMin(int[] arr) {
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]>=arr[i]){
                min=Math.min(min,arr[i]);
                i=mid+1;
            }
            else{
                min=Math.min(min,arr[mid]);
                j=mid-1;
            }
        }
        return min;
        
    }
}