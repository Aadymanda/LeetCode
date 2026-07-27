class Solution {
    public int maxProduct(int[] arr) {
        int max=-1;
        int smax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax){
                smax=arr[i];
            }
            else{}
        }
        return (max-1)*(smax-1);
        
    }
}