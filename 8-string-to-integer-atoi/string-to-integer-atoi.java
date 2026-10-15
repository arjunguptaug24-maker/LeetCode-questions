class Solution {
    public int myAtoi(String s) {
        long num = 0;
        boolean started = false;   // true once a sign or digit has been seen
        boolean negative = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                if (started) break;      // space after sign/digits ends parsing
                continue;                // leading space: skip
            }
            else if (c == '+' || c == '-') {
                if (started) break;      // sign only allowed once, before digits
                started = true;
                negative = (c == '-');
            }
            else if (c >= '0' && c <= '9') {
                started = true;
                num = num * 10 + (c - '0');

                // clamp with the sign applied, and stop before long overflows
                if (!negative && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
                if (negative && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            }
            else {
                break;                   // any other character ends parsing
            }
        }

        return (int) (negative ? -num : num);
    }
}