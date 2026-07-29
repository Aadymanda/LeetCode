class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind=i;
                break;
            }

        }
        if(ind!=-1){
        for(int i=n-1;i>ind;i--){
                if(arr[i]>arr[ind]){
                    int temp=arr[ind];
                    arr[ind]=arr[i];
                    arr[i]=temp;
                    break;
                }
        }
        }
            int i=ind+1;
            int j=n-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
                i++;
            }
        
        for( i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
}