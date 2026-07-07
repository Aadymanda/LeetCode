class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int count=0;
        int sum=0;
        while(i<=j){
            if(arr[j]+arr[i]>limit){
                count++;
                j--;
            }
            else{
               i++;
               j--;
               count++;
                }

            }
            

        return count;
        
    }
}