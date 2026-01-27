class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{'|| ch=='['){
                stack.add(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top=stack.get(stack.size()-1);
                if(ch==')' && top!='(') return false;
                if(ch=='}' && top!='{') return false;
                if(ch==']' && top!='[') return false;

                stack.remove(stack.size()-1);
            }
        }
        return stack.isEmpty();
    }
}
