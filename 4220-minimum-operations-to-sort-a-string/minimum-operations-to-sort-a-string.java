class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int[] temp = new int[n];
        int max = -1;
        int min = Integer.MAX_VALUE;
        boolean sorted = true;

        for (int i = 0; i < n; i++) {
            temp[i] = s.charAt(i) - 'a';
            if (temp[i] > max) max = temp[i];      // fixed
            if (temp[i] < min) min = temp[i];      // fixed
            if (i > 0 && temp[i] < temp[i - 1]) sorted = false;
        }

        if (sorted) return 0;
        if (n == 2) return -1;

        if (temp[0] == min || temp[n - 1] == max) return 1;

        for (int i = 1; i < n - 1; i++) {
            if (temp[i] == min || temp[i] == max) return 2;
        }

        return 3;
    }
}