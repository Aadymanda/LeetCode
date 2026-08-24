class Solution {
    public int[] resultArray(int[] arr) {
        int brr[]=new int[arr.length];
        int crr[]=new int[arr.length];
        brr[0]=arr[0];
        crr[0]=arr[1];
        int j=0;
        int k=0;
        for(int i=2;i<arr.length;i++){
            if(brr[j]>crr[k]){
                brr[++j]=arr[i];
            }
            else{
                crr[++k]=arr[i];
            }

        }
        int l=0;
        for(int i:brr){
            if(i==0)break;
            arr[l++]=i;

        }
        for(int i:crr){
            if(i==0)break;
            arr[l++]=i;
        }
        return arr;
        
    }
}