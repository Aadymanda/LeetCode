class Solution {
    public long speed(int arr[],int mid,int h){
       
        long sum=0;
        for(int i:arr){
            sum+=(long)Math.ceil(i*1.0/mid*1.0);
        }
        return sum;

    }
    public int minEatingSpeed(int[] arr, int h) {
        int si=1;
        int ei=arr[0];
        int best=0;
        for(int i:arr){
          
            ei=Math.max(ei,i);
        }
        while(si<=ei){
            int mid=(si+ei)/2;
            long ans=speed(arr,mid,h);
             
            if(ans<=h){
                best=mid;
                ei=mid-1;
            
            }
            else{
                si=mid+1;
            }
        }
        return best;

        
    }
}