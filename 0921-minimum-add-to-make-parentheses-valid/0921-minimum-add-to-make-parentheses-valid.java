class Solution {
    public int minAddToMakeValid(String s) {
        int co=0;
     
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }
            else{
                count--;
                if(count<0){
                    co++;
                    count=0;
                }
            }
        }
        return Math.abs(count+co);
        
    }
}