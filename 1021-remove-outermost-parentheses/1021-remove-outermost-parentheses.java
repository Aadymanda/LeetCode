class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder("");
        int count=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                if(count!=0){
                    ans.append('(');
                }
                count++;
                
            }
            else{
                if(count!=1){
                    ans.append(')');
                }
                count--;
            }
        }
        return ans.toString();
        
    }
}