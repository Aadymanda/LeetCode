class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer> l = new ArrayList<>();
        int n = arr.length;
        long first = arr[0];
        int fq = 0;
        long second = 1000000000;
        int sq = 0;
        for (int i : arr) {
             if (first == i) {
                fq++;
            }  else if (second == i) {
                sq++;

            } 
            else if (fq == 0) {
                first = i;
                fq=1;
            }else if (sq == 0) {
                second = i;
                sq=1;
            }else {
                fq--;
                sq--;
            }

        }
        int f = 0;
        int s = 0;
        for (int i : arr) {
            if (i == first) {
                f++;
            } else if (i == second) {
                s++;
            }

        }
        if (f > n / 3) {
            l.add((int) first);
        }
        if (s > n / 3) {
            l.add((int) second);
        }
        return l;

    }

}
