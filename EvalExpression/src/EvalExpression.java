import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class EvalExpression {
    public static void main(String[] args) {
        String[]  input={"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(input));
    }
    public static int evalRPN(String[] A) {

        int output=0;
        int num1=0;
        int num2=0;
        Stack<Integer> stack=new Stack<>();
        HashSet<String> oper=new HashSet<String>();
        oper.add("*");
        oper.add("+");
        oper.add("/");
        oper.add("-");

        for (int i = 0; i < A.length; i++) {
            if(oper.contains(A[i])){
                num1=stack.pop();
                num2=stack.pop();
                var res=Evaluate(num1,num2, A[i]);
                stack.push(res);
            }
            else {
                stack.push(Integer.parseInt(A[i]));
            }
        }
        output=stack.pop();
    return  output;
    }

    public  static int Evaluate(int num1,int num2, String op){

        switch (op) {
            case "*":
                return num1*num2;
            case "+":
                return num1+num2;
            case "/":
                return num2/num1;
            case "-":
                return num2-num1;
        }
        return 0;
    }
}
