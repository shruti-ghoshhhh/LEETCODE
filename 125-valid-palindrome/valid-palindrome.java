class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> list=new ArrayList<>();
        s=s.toLowerCase();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                list.add(c);
            }
        }
        int i=0,j=list.size()-1;
        while(i<j){
            if(list.get(i)!=list.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}