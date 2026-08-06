class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        
        // Step 1: Clean out negative numbers, zeroes, and numbers > n
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }
        
        // Step 2: Mark indices as visited using negative signs
        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if (val <= n) {
                int idx = val - 1;
                if (arr[idx] > 0) {
                    arr[idx] = -arr[idx];
                }
            }
        }
        
        // Step 3: The first positive index means (index + 1) was never visited
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }
        
        return n + 1;
    }
}