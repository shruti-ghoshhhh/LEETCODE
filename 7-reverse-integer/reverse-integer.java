class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            // int dgt=x%10;
            // x/=10;
            // if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && dgt >
            // 7)) return 0; // Overflow for positive numbers
            // if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && dgt <
            // -8)) return 0; // Overflow for negative numbers
            // rev=(rev*10)+dgt;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;
            int dgt = x % 10;
            rev = rev * 10 + dgt;
            x /= 10;

        }
        return rev;
    }
}
