class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder("^#");

        for (char ch : s.toCharArray()) {
            sb.append(ch).append('#');
        }

        sb.append('$');
        String t = sb.toString();

        int[] P = new int[t.length()];
        int C = 0, R = 0;

        for (int i = 1; i < t.length() - 1; i++) {
            int mirror = 2 * C - i;

            if (i < R) {
                P[i] = Math.min(R - i, P[mirror]);
            }

            while (t.charAt(i + P[i] + 1)
                    == t.charAt(i - P[i] - 1)) {
                P[i]++;
            }

            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }
        }

        int maxLen = 0, center = 0;

        for (int i = 1; i < P.length - 1; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                center = i;
            }
        }

        int start = (center - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}