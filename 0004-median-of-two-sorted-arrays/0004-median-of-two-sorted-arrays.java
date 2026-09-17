class Solution {
    public double findMedianSortedArrays(int[] arr, int[] brr) {
        int l=(arr.length+brr.length-1)/2;
        int r=(arr.length+brr.length)/2;
        int count=-1;
        int el=0;
        int er=0;
        int i=0;
        int j=0;
        while(i<arr.length&&j<brr.length){
            if(arr[i]<=brr[j]){
                count++;
               
                 if(count==l)el=arr[i];
                 if(count==r)er=arr[i];
                 i++;

            }
            else{
                
                count++;
                 if(count==l)el=brr[j];
                 if(count==r)er=brr[j];
                 j++;
            }
           
        }
        while(i<arr.length){
             count++;
                
                 if(count==l)el=arr[i];
                 if(count==r)er=arr[i];
                 i++;
        }
        while(j<brr.length){
             
                count++;
                 if(count==l)el=brr[j];
                 if(count==r)er=brr[j];
                 j++;

        }
        if((arr.length+brr.length)%2==0){
            return (el+er)/2.0;
        }
        return er*1.0;

        
    }
}