class Solution {
public:
    int reverse(int x) {
        int num=x;
        long rev=0;
        int rem=0;
        
        while(num!=0){
            rem=num%10;
            if(rev*10+rem>INT_MAX||rev*10+rem<INT_MIN){
                return 0;
            }
            rev=rev*10+rem;
            num=num/10;
        }
        return rev;
    }
};