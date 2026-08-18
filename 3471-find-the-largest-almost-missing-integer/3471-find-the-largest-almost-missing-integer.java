class Solution {
    int max=-1;
    public int largestInteger(int[]arr, int k) {
        
        if(arr.length==1){
            return arr[0];
        }
        if(arr.length==k){
            Arrays.sort(arr);
            return arr[arr.length-1];

        }
        if(k==1){
            Arrays.sort(arr);
          
            if(arr[arr.length-1]!=arr[arr.length-2]){
                return arr[arr.length-1];
            }
            if(arr[0]!=arr[1]){
                max=arr[0];
            }
            
            for(int i=1;i<=arr.length-2;i++){
                if(arr[i]!=arr[i+1]&&arr[i]!=arr[i-1]){
                    max=Math.max(arr[i],max);
                }
            }
           
            
        }
        else{
            int a=arr[0];
            int b=arr[arr.length-1];
            int ca=0;
            int cb=0;
            for(int i:arr){

                if(i==a){
                    ca++;
                }
                if(i==b){
                    cb++;
                }

            }
            if(ca==1&&cb==1){
                max=Math.max(a,b);
            }
            else if(ca==1){
                max=a;
            }
            else if(cb==1){
                max=b;
            }
            else{}
           
        }
        return max;
        
        
    }
}