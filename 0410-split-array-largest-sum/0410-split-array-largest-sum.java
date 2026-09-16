class Solution {
    public boolean check(int arr[],int mid,int k){
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid){
                sum+=arr[i];
            }
            else{
                count++;
                sum=arr[i];
            }

        }
        count++;
        return count<=k;

    }
    public int splitArray(int[] arr, int k) {
        int si=0;
        int ei=0;
        for(int i:arr){
            si=Math.max(si,i);
            ei+=i;
        }
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(check(arr,mid,k)){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }


        }
        return si;

        
    }
}