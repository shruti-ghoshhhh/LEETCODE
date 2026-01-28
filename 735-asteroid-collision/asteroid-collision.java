class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i: asteroids){
            boolean alive=true;
            while(!stack.isEmpty() && alive && stack.peek()>0 && i<0){
                int top=stack.peek();

                if(top<Math.abs(i)){
                    stack.pop();
                }
                else if(top==Math.abs(i)){
                    stack.pop();
                    alive=false;
                }
                else{
                    alive=false;
                }

            }
                if(alive){
                    stack.push(i);
                }
        }

        int res[]=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            res[i]=stack.pop();
        }
        return res;
    }
}