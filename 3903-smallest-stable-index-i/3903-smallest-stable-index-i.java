class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int ans=Integer.MAX_VALUE;
        int minI=-1;
        for(int i=0;i<arr.length;i++){
            int max=arr[i];
            int min=arr[i];
            for(int j=0;j<=i;j++){
                max=Math.max(arr[j],max);
            }
            for(int j=i;j<arr.length;j++){
                min=Math.min(arr[j],min);
            }
            if(max-min<=k){
               return i;
            }

        }
        return -1;



        
    }
}