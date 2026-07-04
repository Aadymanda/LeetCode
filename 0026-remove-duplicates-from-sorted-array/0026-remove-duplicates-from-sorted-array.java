class Solution {
    public int removeDuplicates(int[] arr) {
        int count=0;
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]==arr[j-1]){
                count++;
            }
            else{
                i++;
                arr[i]=arr[j];
            }
        }
        return n-count;
        
    }
}