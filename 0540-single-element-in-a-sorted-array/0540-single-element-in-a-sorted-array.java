class Solution {
    public int singleNonDuplicate(int[] arr) {
       int i=1;
       int j=arr.length-2;
       if(arr.length==1){
        return arr[0];
       }
       if(arr[0]!=arr[1]){
        return arr[0];
       }
       if(arr[j+1]!=arr[j]){
        return arr[j+1];
       }
       while(i<=j){
        int mid=i+(j-i)/2;
        if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
            return arr[mid];
        }
        else if(arr[mid]==arr[mid+1]){
            if(mid%2==1){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        else{
            if(mid%2==0){
                j=mid-1;
            }
            else{
                i=mid+1;
            }

        }
       }
       return -1;
    }
}