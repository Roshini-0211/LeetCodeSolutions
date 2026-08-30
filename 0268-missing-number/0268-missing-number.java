class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        int expectedsum=n*(n+1)/2;
        for(int total:nums){
            sum=sum+total;
        }
    
        return expectedsum-sum;
        
    
    }
}