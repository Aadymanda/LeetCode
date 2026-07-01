class Solution {
    public int maxProfit(int[] arr) {
        int sum=0;
        int buy=arr[0];
        for(int i=1;i<arr.length;i++){
            if(buy<arr[i]){
                sum+=arr[i]-buy;
                
            }
            buy=arr[i];
        }
        return sum;
        
    }
}