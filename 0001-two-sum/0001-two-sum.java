class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ans[]=new int[2];
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                if(sum==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
        

    }
}