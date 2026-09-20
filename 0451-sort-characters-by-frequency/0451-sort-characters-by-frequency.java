class Solution {
    public String frequencySort(String s) {
        String a="";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Character> l=new ArrayList<>(hm.keySet());
        l.sort((c,b)->hm.get(b)-hm.get(c));
        for(char c:l){
            for(int i=0;i<hm.get(c);i++){
                a+=c;

            }
        }
        return a;

    }
}