class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int count=1;
        int max=1;
        for(int num:s){
             int n=num;
            if(s.contains(n+1)){
                continue;

            }
            else{
               
                count=1;
                while(s.contains(n-1)){
                    count++;
                    n--;
                }
                max=Math.max(count,max);
            }
        }
        return max;
        
    }
}