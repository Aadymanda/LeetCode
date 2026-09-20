class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int pos=1;
        for(char ch:s.toCharArray()){
           
            sum+=(26-(ch-'a'))*pos;
            pos++;

        }
        return sum;
        
    }
}