class Solution {
    public int subarraySum(int[] arr, int k) {
        int n=arr.length;
        int prr[]=new int[n];
        prr[0]=arr[0];

        int count=0;
        if(prr[0]==k)count++;
        for(int i=1;i<n;i++){
           prr[i]=prr[i-1]+arr[i];
           if(prr[i]==k){
              count++;
           }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(k==prr[j]-prr[i]){
                    count++;
                }
            }
        }
        return count;

        
    }
}