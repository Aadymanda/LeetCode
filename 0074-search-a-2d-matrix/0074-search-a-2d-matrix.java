class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n=arr.length;
        int m=arr[0].length;
        int si=0;
        int ei=m*n-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            int i=mid/m;
            int j=mid%m;
            if(arr[i][j]==target){
                return true;
            }
            else if(arr[i][j]>target){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return false;
        
    }
}