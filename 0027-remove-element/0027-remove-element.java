class Solution {
    public int removeElement(int[] arr, int val) {
        int count=0;
        for(int i:arr){
            if(i==val){
                count++;
            }
        }
        
        int j=arr.length-1;
        int i=0;
        while(j>arr.length-count-1){
            if(arr[j]==val){
                j--;
            }else if(arr[i]==val){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
                i++;
            }
            else{
                i++;
            }

        }
        return arr.length-count;
        
    }
}