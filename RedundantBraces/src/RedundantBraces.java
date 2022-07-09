import java.util.Stack;

public class RedundantBraces {
    public static void main(String[] args) {
        //System.out.println(braces("((a+b))")); //ans=1
        //System.out.println(braces("(a+(a+b))")); //ans=0
       // System.out.println(braces("((a))"));   //ans=1
         System.out.println(braces("(a)"));  // ans=1
    }


    public static int braces(String A) {
        int output=0;
        Stack<Character> stk=new Stack<>();
        for (int i = 0; i <A.length() ; i++) {
            if(A.charAt(i)=='*'||A.charAt(i)=='+'||A.charAt(i)=='-'||A.charAt(i)=='/'||A.charAt(i)=='('||A.charAt(i)==')') {
                if (A.charAt(i) != ')') {
                    stk.push(A.charAt(i));
                } else {
                    if (stk.peek() == '(')
                        return 1;
                    while (stk.peek() != '(') {
                        stk.pop();
                    }
                    if (stk.peek() == '(')
                        stk.pop();
                }

            }
            }
        return  output;
    }
}
