class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c=0;
        for(String op: operations){
            if(op.contains("+"))c++;
            else c--;
        }
        return c;
    }
}