class Solution {
    public int maxFrequency(int[] arr, int k) {
        int l=0;
        int r=0;
        int n=arr.length;
        Arrays.sort(arr);
        long total=0;
        long max=1;
        while(r<arr.length){
            total+=arr[r];
            if(total+k>=(long)arr[r]*(r-l+1)){
                max=Math.max(max,r-l+1);
            }
            else{
                total-=arr[l];
                l++;
            }
            r++;

        }
        return (int)max;
        
    }
}