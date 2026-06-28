class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int maxa=0;
        while(i<j){
            if(arr[i]>arr[j]){
                int area=(j-i)*arr[j];
                maxa=Math.max(maxa,area);
                j--;

            }
            else{
                int area=(j-i)*arr[i];
                maxa=Math.max(maxa,area);
                i++;
            }
            

        }
        return maxa;
        
    }
}