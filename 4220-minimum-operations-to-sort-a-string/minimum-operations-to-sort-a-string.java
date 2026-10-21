class Solution {
    public int minOperations(String s) {
        int n = s.length();

        // 0: already sorted
        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;

        // -1: length 2 and unsorted
        if (n == 2) return -1;

        char min = 'z', max = 'a';
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c < min) min = c;
            if (c > max) max = c;
        }

        // 1: first char is the min, or last char is the max
        if (s.charAt(0) == min || s.charAt(n - 1) == max) return 1;

        // 2: min or max exists somewhere in the middle
        for (int i = 1; i < n - 1; i++) {
            char c = s.charAt(i);
            if (c == min || c == max) return 2;
        }

        // 3: max only at the front, min only at the back
        return 3;
    }
}