class Solution {
    public String makeGood(String s) {
        List<Character> stack=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty()){
                char top=stack.get(stack.size()-1);
                if(top!=ch && Character.toLowerCase(ch)==Character.toLowerCase(top)){
                    stack.remove(stack.size()-1);
                    continue;
                }
            }
            stack.add(ch);
        }
        String result="";
        for(char ch: stack){
            result+=ch;
        }
        return result;
    }
}