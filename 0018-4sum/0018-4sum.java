class Solution {
    public List<List<Integer>> fourSum(int[] arr, long t) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        for (int l = 0; l < n; l++) {
             if (l > 0 && arr[l] == arr[l - 1])
                    continue;
            for (int i =l+1; i <n; i++) {
                if (i > l+1 && arr[i] == arr[i - 1])
                    continue;
                int j = i + 1;
                int k = n - 1;
                while (j < k) {
                    long sum=(long)arr[i] + arr[j] + arr[k]+arr[l];
                    if (sum < t) {
                        j++;
                    } else if (sum> t) {
                        k--;
                    } else {
                        List<Integer> li = new ArrayList<>();
                        li.add(arr[l]);
                        li.add(arr[i]);
                        li.add(arr[j]);
                        li.add(arr[k]);
                        ans.add(li);
                        j++;
                        k--;
                        while (j < k && arr[j] == arr[j - 1])
                            j++;
                        while (j < k && arr[k] == arr[k + 1])
                            k--;

                    }
                }
            }
        }
        return ans;
    }
}