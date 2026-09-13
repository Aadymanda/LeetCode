class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        System.out.println(n);
        int brr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                brr[i][j]=arr[i][j];
            }
        }
        int k=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++ ){
                arr[i][j]=brr[k][i];
                k--;
            }
            k=n-1;
        }
    }
}