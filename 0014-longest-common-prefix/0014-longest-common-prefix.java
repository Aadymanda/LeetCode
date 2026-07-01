class Solution {
    public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String a=arr[0];
        String b=arr[arr.length-1];
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                ans.append(a.charAt(i));
            }
            else{
                break;
            }
        }
        return ans.toString();
        
    }
}