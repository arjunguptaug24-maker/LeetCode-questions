class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int min = (k*(k+1))/2;
        int max = (19*k - k*k)/2;
        List<List<Integer>> result = new ArrayList<>();
        if(n<min || n >max){
            return result;
        }
        int[] nums ={1,2,3,4,5,6,7,8,9};
        List<Integer> curr = new ArrayList<>();
        combination(result,curr,nums,n,0,k,0);
        return result;
        
    }
    private void combination(List<List<Integer>> result , List<Integer>   curr , int[] nums , int n , int i,int k,int sum){
    if(sum>= n || i == 9 || k== 0 ){
        if(sum == n&& k == 0){
            result.add(new ArrayList<>(curr));
        }
        return ;
    }
    
    
  

    curr.add(nums[i]);
    combination(result,curr,nums,n,i+1,k-1,sum+nums[i]);
    curr.remove(curr.size() -1);
    combination(result,curr,nums,n,i+1,k,sum);
}
}