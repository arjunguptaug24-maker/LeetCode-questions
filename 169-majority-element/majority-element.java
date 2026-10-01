import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int value = 1 ;
        for(int i = 0 ; i< n ; i++){
            if(map.containsKey(nums[i])){
               map.put(nums[i] , map.get(nums[i]) +1);
                if(map.get(nums[i])>n/2){
                    return nums[i];
                }
            }
            else{
                map.put(nums[i] , value);
            }
        }
        if(n==1 ){
            return nums[0];
        }
        return -1;


    }
}