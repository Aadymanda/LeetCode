class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int brr[]=new int[n];
        int crr[]=new int[n];
        brr[0]=arr[0];
        for(int i=1;i<n;i++){
            brr[i]=Math.max(brr[i-1],arr[i]);
        }
        crr[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            crr[i]=Math.max(crr[i+1],arr[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(brr[i],crr[i])-arr[i];
        }
        return sum;
        
    }
}