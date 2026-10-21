class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        List<Integer> ls=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ls.add(i);
            }
            
        }
        return ls;
    }
}