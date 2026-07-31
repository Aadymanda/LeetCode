class Solution {
    public int jump(int[] arr) {
        int l=0;
        int r=0;
        int max=0;
        int count=0;
        while(r<arr.length-1){
            for(int i=l;i<=r;i++){
                max=Math.max(max,arr[i]+i);
            }
            l=r+1;
            r=max;
           
            count++;
           
        }
        return count;
    }
}