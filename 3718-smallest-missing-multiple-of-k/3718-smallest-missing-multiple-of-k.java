class Solution {
    public int missingMultiple(int[] arr, int k) {
        Set<Integer> s=new HashSet<>();
        for(int i:arr){
            s.add(i);

        }
        int i=1;
        while(s.contains(k*i)){
            i++;
        }
        return k*i;
        
    }
}