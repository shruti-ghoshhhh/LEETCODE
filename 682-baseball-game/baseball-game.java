class Solution {
    public int calPoints(String[] operations) {
        List<Integer> stack=new ArrayList<>();

        for (int i=0;i<operations.length;i++) {
            String op=operations[i];

            if(op.equals("C")) {
                stack.remove(stack.size()-1);
            }
            else if(op.equals("D")) {
                int prod = 2*stack.get(stack.size()-1);
                stack.add(prod);
            }
            else if(op.equals("+")) {
                int last=stack.get(stack.size()-1);
                int secondLast=stack.get(stack.size()-2);
                stack.add(last+secondLast);
            }
            else{
                stack.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int i : stack) {
            sum+=i;
        }
        return sum;
    }
}
