class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder sb=new StringBuilder("");
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
                if(count>=2){
                    sb.append(ch);
                }
            }
            else{
                count--;
                if(count>=1){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
        
    }
}