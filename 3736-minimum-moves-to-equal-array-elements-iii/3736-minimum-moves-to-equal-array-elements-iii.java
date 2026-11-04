class Solution {
    public int minMoves(int[] arr) {
        int max=-1;
        for(int i:arr){
            max=Math.max(max,i);
        }
        int ans=0;
        for(int i:arr){
            ans+=max-i;
        }
        return ans;

        
    }
}