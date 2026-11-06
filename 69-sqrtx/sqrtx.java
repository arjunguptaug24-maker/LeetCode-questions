class Solution {
    public int mySqrt(int x) {
 
        int ans = 0;
        int start = 1;
        int end = x;
        while(end>=start){
            int mid = start + (end-start)/2;
            if(mid>x/mid){
                end = mid-1;

            }
            else{
                ans= mid;
                start = mid+1;
            }
        }
        return ans;


        
    }
}