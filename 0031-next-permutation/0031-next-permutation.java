class Solution {
    public void rev(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] arr) {
        int n=arr.length-1;
        int bp=-1;
        int el=arr[n];
        int min=Integer.MAX_VALUE;
        for(int i=arr.length-2;i>=0;i--){
             
             if(arr[i]<arr[i+1]){
                bp=i;
                break;
             }

        }
        if(bp!=-1){
           int max=arr[bp];
           int ans=-1;
            for(int i=arr.length-1;i>=0;i--){

               if(arr[i]>max){
                ans=i;
                break;
               }

            }
            int temp=arr[bp];
            arr[bp]=arr[ans];
            arr[ans]=temp;


        }
        rev(arr,bp+1,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
}