class Solution {
    public boolean uniformArray(int[] arr) {
        int e=0;
        int o=0;
        Arrays.sort(arr);
        for(int i:arr){
            if(i%2==0){
                e=1;
            }
            else{
                o=1;
            }
          
        }
        if(e!=o){
            return true;
        }
        else{
            int mino=-1;
            int flag=0;
            for(int i:arr){
                if(i%2==0){
                    if(mino==-1){
                        return false;
                    }
                }
                else{
                    mino=i;
                }
            }
            
        }
        return true;
        
    }
}