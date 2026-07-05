class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int l=0;
        boolean a=false;
        Set<Integer> s=new HashSet<>();
      
        for(int r=0;r<arr.length;r++){
           int len=r-l;
           if(len>k){
            s.remove(arr[l]);
            l++;
           }
           len=r-l;
          
            if(s.contains(arr[r])){
                a=true;
                break;
            }
            s.add(arr[r]);
          

           
        }
        return a;

    }
}