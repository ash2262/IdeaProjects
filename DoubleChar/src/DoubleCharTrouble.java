import java.util.Stack;

public class DoubleCharTrouble {
    public static void main(String[] args) {
    //String  A = "abccbc";
        String  A = "abba";
        System.out.println(solve(A));

    }
    public static String solve(String A) {
        //char[] output=null;
        char[] arr=A.toCharArray();
        Stack<Character> stk=new Stack<Character>();
        for (int i = 0; i < arr.length; i++) {
            if(!stk.isEmpty()&& stk.peek()==arr[i])
                stk.pop();
            else
                stk.push(arr[i]);

        }
        //String output=stk.stream().toList().toString();
        StringBuilder output=new StringBuilder();
        while (!stk.isEmpty())
            output.append(stk.pop());
        return output.reverse().toString();
    }
}
