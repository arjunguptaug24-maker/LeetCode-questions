import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        subsetsII(result , curr, 0 , nums);
        return result;
        
    }
    private void subsetsII(List<List<Integer>> result , List<Integer> curr , int i , int[] nums){
        if(i== nums.length ){
            result.add(new ArrayList<>(curr));
            return ;
        }
        curr.add(nums[i]);
        subsetsII(result,curr,i+1,nums);
        curr.remove(curr.size() -1);
        int next = i;
        while(next<nums.length && nums[i] == nums[next]){
            next++;
        }
        subsetsII(result,curr,next,nums);
        
    }
}