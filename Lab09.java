package lab09;

import java.util.Stack;

/**
 * @author jiahaoxian
 */

public class Lab09 {

    public static void main(String[] args) {

        String expression = "(2+4) * 8 + ((3-1) + 7)";
        
        isBalanced(expression);
        
        System.out.println(isBalanced(expression));
    }

    public static boolean isBalanced(String expression) {
        
        char[] exp = expression.toCharArray();
        
        Stack<Character> stack = new Stack();
        
        for(int i = 0; i < exp.length; i++) {
            if(exp[i] == '(') {
                stack.push('(');
            }
            
            if(exp[i] == ')') {
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }

}
