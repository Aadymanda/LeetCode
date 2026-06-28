class Solution {
    public List<List<Integer>> threeSum(int[] nums) {List<List<Integer>> ans=new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return ans;
        }
        Arrays.sort(nums);
        int sum=0;
        
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            sum=nums[i];
            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                if(sum+nums[j]+nums[k]==0){
                    List<Integer>a=new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[k]);
                    ans.add(a);
                   while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                   
                   
                    j++;
                  

                }
                else if(sum+nums[j]+nums[k]>0){
                    k--;
                }
                else{
                    j++;
                }

            }
        }
        return ans;
        
    }
}