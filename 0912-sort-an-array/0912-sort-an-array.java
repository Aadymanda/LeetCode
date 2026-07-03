class Solution {
    public static void mergeSort(int arr[]){
        
        int n=arr.length;
        if(n<=1){
            return;
        }
        int mid=n/2;
        int lrr[]=new int[mid];
        int rrr[]=new int[n-mid];
        for(int i=0;i<mid;i++){
            lrr[i]=arr[i];
        }
        int j=0;
        for(int i=mid;i<n;i++){
            rrr[j++]=arr[i];
        }
        mergeSort(lrr);
        mergeSort(rrr);
        merge(arr,lrr,rrr);
    }
    public static void merge(int arr[],int lrr[],int rrr[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<lrr.length&&j<rrr.length){
            if(lrr[i]<rrr[j]){
                arr[k++]=lrr[i++];
            }
            else{
                arr[k++]=rrr[j++];
            }
        }
        while(i<lrr.length){
            arr[k++]=lrr[i++];
        }
        while(j<rrr.length){
            arr[k++]=rrr[j++];
        }
    }
    public int[] sortArray(int[] arr) {
        mergeSort(arr);
        return arr;
        
    }
}