class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0 ; 
        int right = nums.length -1 ;
        int n = nums.length ;
        while(left<n){
            if(nums[left] + nums[right] == target){
                return new int[]{left,right};
            }
            else {
                right--;
                if(left == right){
                    left = left + 1 ;
                    right = n -1 ;
                }
            }
          

        }
          return new int[]{0};
        

     

}
}