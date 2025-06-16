class Solution {
    public int countDigits(int n) {
        int c=0, cp=n;
        while(n!=0)
        {
            int dgt=n%10;
            if(cp%dgt==0) c++;
            n/=10;
        }
        return c;
    }
}