class Solution {
    public String convert(String s, int r) {
        if(r==1 || s.length() <= r){
            return s;
        }
       String arr[]=new String[s.length()];
       for (int i = 0; i < r; i++) {
            arr[i] = ""; 
       }
       int j=0;
       int n=s.length();
       while(j<n){
       for(int i=0;i<r&&j<n;i++){
        arr[i]+=s.charAt(j++);
       }
       for(int i=r-2;i>0&&j<n;i--){
        arr[i]+=s.charAt(j++);
       }
       }
       String result = "";
        for (int i = 0; i < r; i++) {
            result += arr[i];
        }
        return result;
    }
    
}
