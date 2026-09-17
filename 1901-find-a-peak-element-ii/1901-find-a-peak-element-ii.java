class Solution {
    public int max(int arr[][],int mid){
        int ans=-1;
        int max=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
           if(arr[i][mid]>max){
            max=arr[i][mid];
            ans=i;
           }
        }
        return ans;
    }
    public int[] findPeakGrid(int[][] mat) {
        int si=0;
        int ei=mat[0].length;
        while(si<=ei){
            int mid=(si+ei)/2;
            int row=max(mat,mid);
            int left=mid-1>=0?mat[row][mid-1]:-1;
            int right=mid+1<mat[0].length?mat[row][mid+1]:-1;
            if(mat[row][mid]>=left&&mat[row][mid]>=right){
                return new int []{row,mid};
            }
            else if(mat[row][mid]<left){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return new int []{-1,-1};
        
    }
}