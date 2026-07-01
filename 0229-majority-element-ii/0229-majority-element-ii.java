class Solution {
    public List<Integer> majorityElement(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        int n=arr.length;
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>n/3){
                l.add(entry.getKey());
            }
        }
        return l;
        

        
    }
}