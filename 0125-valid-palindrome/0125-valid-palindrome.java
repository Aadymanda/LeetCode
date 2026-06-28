class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder("");
        for(char c:s.toCharArray()){
            if(c>='A'&&c<='Z'||c>='a'&&c<='z'||c>='0'&&c<='9'){
                sb.append(c);
            }
        }
        String ans=sb.toString();
        String a=ans.toLowerCase();
        int i=0;
        int j=a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;

                
            }
            i++;
            j--;
        }
        return true;
        
    }
}