class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {

        long left = 1;
        long right = 2000000000L;

        long ab = lcm(a, b);
        long ac = lcm(a, c);
        long bc = lcm(b, c);

        long abc = lcm(ab, c);

        while (left < right) {

            long mid = left + (right - left) / 2;

            long count = mid / a
                       + mid / b
                       + mid / c
                       - mid / ab
                       - mid / ac
                       - mid / bc
                       + mid / abc;

            if (count >= n) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return (int) left;
    }

    long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}