class Solution {
    public int[] applyOperations(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                arr[i-1]*=2;
                arr[i]=0;
                count++;
            }

        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                arr[j++]=arr[i];

            }
        }
        while(j<n){
            arr[j++]=0;
        }
        return arr;
        
    }
}