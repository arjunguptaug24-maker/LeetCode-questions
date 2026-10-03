class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = 0;
        int n = nums.length;
        int totalsum = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ; i++){
            currsum = Math.max(nums[i] , nums[i]+currsum);
            totalsum = Math.max(currsum,totalsum);


        }
        return totalsum;
        
    }
}