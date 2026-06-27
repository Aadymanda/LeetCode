class Solution {
    public String getFreq(String s){
        StringBuilder ans=new StringBuilder("");
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        char c='a';
        for(int i:arr){
            ans.append(c);
            ans.append(i);
            c++;
        }
        return ans.toString();

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> ans=new HashMap<>();
        for(String s:strs){
            String freq=getFreq(s);
            if(ans.containsKey(freq)){
                ans.get(freq).add(s);
            }
            else{
                List<String> li=new ArrayList<>();
                li.add(s);
                ans.put(freq,li);

            }
        }
        return new ArrayList<>(ans.values());

        
    }
}