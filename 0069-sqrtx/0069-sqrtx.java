class Solution {
    public int mySqrt(int x) {
         if (x == 0 || x == 1)
            return x;
        int i=0;
        int j=x/2;
        while(i<=j){
            int mid=i+(j-i)/2;
             long square = (long) mid * mid;
            if(square==x){
                return mid;
            }
            else if(square>x){
                j=mid-1;
            }
            else{
                i=mid+1;
            }

        }
        return j;

        
    }
}