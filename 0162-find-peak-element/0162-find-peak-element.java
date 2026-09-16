class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 0;
        }
        if(arr[n-1]>arr[n-2]){
            return n-1;
        }
        int si=1;
        int ei=n-2;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                si=mid+1;

            }
            else{
                ei=mid-1;
            }
        }
        return -1;
    }
}