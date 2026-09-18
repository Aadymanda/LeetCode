class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int count=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                if(count!=0){
                    ans+='(';
                }
                count++;
                
            }
            else{
                if(count!=1){
                    ans+=')';
                }
                count--;
            }
        }
        return ans;
        
    }
}