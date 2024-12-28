class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        else{
            int cp=x, rev=0;
            while(x>0)
            {
               rev=(rev*10)+(x%10);
                x/=10;
            }
             return rev == cp;
        }
}
}


