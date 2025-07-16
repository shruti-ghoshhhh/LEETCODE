class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String str=sentences[i];
            int count = str.split(" ").length;
            max = Math.max(max, count);
        }
        return max;
    }
}