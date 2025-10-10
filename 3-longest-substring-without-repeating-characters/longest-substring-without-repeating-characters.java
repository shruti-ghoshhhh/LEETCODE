class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash, -1); // initialize all to -1

        int l = 0, max = 0, n = s.length();

        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);

            if (hash[ch] != -1 && hash[ch] >= l) {
                l = hash[ch] + 1;
            }

            int len = r - l + 1;
            max = Math.max(max, len);
            hash[ch] = r;
        }

        return max;
    }
}
