class Solution {
    public String smallestPalindrome(String s) {
        int arr[]=new int[26];
        StringBuilder left=new StringBuilder("");
        String mid="";
        
        for(char c:s.toCharArray()){
            arr[c-'a']++;      
        }
        for(int i=0;i<26;i++){
            if(arr[i]%2==1){
                mid=String.valueOf((char)('a'+i));
            }
            for(int j=0;j<arr[i]/2;j++){
                left.append(String.valueOf((char)('a'+i)));
            }

        }
        String ans=left+mid+left.reverse().toString();
       return ans;
        
    }
    
 
}