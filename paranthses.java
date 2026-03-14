class Solution {
    public boolean isValid(String s) {
        
        int top=-1;
        int n=s.length();
        char[] stack = new char[s.length()];
        for(int i=0;i<n;i++){
            char c = s.charAt(i);    // fix 3

            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (top == -1) return false;

                char t = stack[top];
                top = top - 1;

                if (c == ')' && t != '(') return false;
                if (c == '}' && t != '{') return false;
                if (c == ']' && t != '[') return false;
            }
        }

        return top == -1;
    }
}
