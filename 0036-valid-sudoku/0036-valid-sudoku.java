class Solution {
    public boolean isValidSudoku(char[][] arr) {

       
        for (int i = 0; i < 9; i++) {
            Set<Character> a = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] == '.') {
                    continue;
                } else if (!a.contains(arr[i][j])) {
                    a.add(arr[i][j]);
                } else {
                    return false;
                }

            }
        }
        for (int i = 0; i < 9; i++) {
            Set<Character> b = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (arr[j][i] == '.') {
                    continue;
                } else if (!b.contains(arr[j][i])) {
                    b.add(arr[j][i]);
                } else {
                    return false;
                }

            }
        }
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                if (i % 3 == 0 && j % 3 == 0) {
                    Set<Character> b = new HashSet<>();
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            if (arr[k][l] == '.') {
                                continue;
                            } else if (!b.contains(arr[k][l])) {
                                b.add(arr[k][l]);
                            } else {
                                return false;
                            }

                        }
                    }
                }

            }
            
        }
return true;
    }
}