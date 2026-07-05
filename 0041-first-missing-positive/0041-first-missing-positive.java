class Solution {
    public int firstMissingPositive(int[] arr) {
        Set<Integer> s=new HashSet<>();
        for(int i:arr){
            s.add(i);
        }
        s.add(0);
      
        int ans=0;
        while(ans<s.size()){
            if(!s.contains(ans)){
                break;
            }
            ans++;
        }
        return ans;
        
    }
}