
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = -1;
        int ans = 0;

        for(int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        while(max >= min) {
            int mid = (max + min) / 2;
            int hour = 0;

            for(int i = 0; i < piles.length; i++) {
                hour += Math.ceil((double)piles[i] / mid);
            }

            if(hour > h) {
                min = mid + 1;
            }
            else {
                ans = mid;
                max = mid - 1;
            }
        }

        return ans;
    }
}
