import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        int maxFreq = 0;
        int maxElement = 0;

    
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        return maxElement;
    }
}