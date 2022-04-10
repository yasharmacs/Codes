class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(int i=0;i<ops.length;i++){
            switch(ops[i]){
                case "+":
                    int last = st.pop();
                    int secondLast = st.peek();
                    st.push(last);
                    st.push(last+secondLast);
                    break;
                case "D":
                     st.push(st.peek() * 2);
                     break;
                case "C":
                     st.pop();
                     break;
                default:
                    st.push(Integer.valueOf(ops[i]));
                    break;
            }
        }
        
        for(int n : st)
            sum += n;
        
        return sum;
    }
}