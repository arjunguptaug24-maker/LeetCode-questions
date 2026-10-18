class Solution {
    public double myPow(double x, int n) {
        long power = n;
        boolean negative = false;

        if (power < 0) {
            negative = true;
            power = -power;
        }

        double result = 1.0;
        double base = x;

        while (power > 0) {
            if ((power & 1) == 1) {
                result *= base;
            }
            base *= base;
            power >>= 1;
        }

        return negative ? 1.0 / result : result;
    }
}