class Solution {
    public int majorityElement(int[] nums) {


        int len = nums.length;
        boolean[] isVisited = new boolean[len];

        for (int i = 0; i < len; i++) {
            
            if (!isVisited[i]) {
                int count = 1;
                isVisited[i] = true;

               
                for (int j = i + 1; j < len; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                        isVisited[j] = true;
                    }
                }

                
                if (count > len / 2) {
                    return nums[i]; 
                }
            }
        }
        
        return -1; 
    }

   
}

        
    