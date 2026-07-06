class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st=new Stack<>();
        for(String s:arr){
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                int a=st.pop();
                st.push(a);
                st.push(2*a);
            }
            else if(s.equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int ans=0;
        while(!st.empty()){
            ans+=st.pop();
        }
        return ans;

        
    }
}