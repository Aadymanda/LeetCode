class Solution {
    public long maxAlternatingSum(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]=Math.abs(arr[i]);
            
        }
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        long ans=0;
        while(i<j){
            ans+=arr[j]*arr[j];
            ans-=arr[i]*arr[i];
            j--;
            i++;

        }
        if(i==j){
            ans+=arr[j]*arr[j];
        }
        return ans;

        
    }
}