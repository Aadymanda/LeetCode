class Solution {
    public boolean sum(int num,int i){
        int n=num;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum+=rem;

        }
        return sum==i;
    }
    public int smallestIndex(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(sum(arr[i],i)){
                return i;
            }
        }
        return -1;

        
    }
}