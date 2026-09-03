class Solution {
    public boolean uniformArray(int[] arr) {
        int e=0;
        int o=0;
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            min=Math.min(i,min);
            if(i%2==0){
                e=1;
            }
            else{
                o=1;
            }
          
        }
        if(e!=o)return true;
        return min%2==0?false:true;
       
        
    }
}