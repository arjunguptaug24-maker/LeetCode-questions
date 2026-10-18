
class Solution {
    public double myPow(double x, int n) {
        long power = n;                      // avoids overflow on MIN_VALUE
        double result = pow(x, Math.abs(power));
        return n < 0 ? 1.0 / result : result; // invert once, at the end
    }

    private double pow(double x, long n) {
        if (n == 0) return 1.0;
        double half = pow(x, n / 2);         // compute ONCE
        return (n % 2 == 0) ? half * half : half * half * x;
    }
}
