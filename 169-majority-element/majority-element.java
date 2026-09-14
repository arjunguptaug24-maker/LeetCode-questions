import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        int count =-1 ;
        for(int keys : map.keySet()){
            if(map.get(keys) > n/2){
                count = keys;

            }
        }
        return count;        
    }
}