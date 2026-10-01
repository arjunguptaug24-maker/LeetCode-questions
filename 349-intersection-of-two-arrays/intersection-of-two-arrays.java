import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
    return intersection(nums2, nums1);   // swap so nums1 is the shorter one
}
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<nums1.length ; i++){
            set.add(nums1[i]);
        }
       ArrayList<Integer> list = new ArrayList<>();
        int index = 0 ;
        for(int i = 0 ; i<nums2.length ; i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
            
        }
        int ans[] = new int[list.size()];
        for(int i = 0 ; i<list.size() ; i++){
            ans[i] = list.get(i);
        }
        return ans;
        
    }
}