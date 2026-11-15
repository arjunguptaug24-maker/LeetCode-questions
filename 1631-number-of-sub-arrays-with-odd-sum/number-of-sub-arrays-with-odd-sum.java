class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1_000_000_007;
        int even = 1;   // empty prefix (sum = 0) counts as even
        int odd = 0;
        int sum = 0;    // running prefix parity (0 = even, 1 = odd)
        int count = 0;

        for (int x : arr) {
            sum = (sum + x) % 2;

            if (sum == 1) {
                count = (count + even) % MOD;
                odd++;
            } else {
                count = (count + odd) % MOD;
                even++;
            }
        }
        return count;
    }
}