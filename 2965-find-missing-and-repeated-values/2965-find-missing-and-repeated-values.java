class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
         
        int n = grid.length;
        int totalElements = n * n;
        
        
        int[] count = new int[totalElements + 1];
        
        int repeated = -1;
        int missing = -1;
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                count[num]++;
            }
        }
        
        
        for (int i = 1; i <= totalElements; i++) {
            if (count[i] == 2) {
                repeated = i; // Rendu thadava vantha repeated
            } else if (count[i] == 0) {
                missing = i;  // Oru thadava kooda varalana missing
            }
        }
        
        
        return new int[]{repeated, missing};
    }
}

    