class Solution {
    public boolean checkString(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(count==1&&c=='a'){
                return false;
            }
            else if(c=='b'){
                count=1;
            }
            

        }
        return true;
        
    }
}