import java.util.Stack;

public class DoubleCharTrouble {
    public static void main(String[] args) {
        //System.out.println(solve("abccbc"));
        //System.out.println(solve("aaaaa"));
        System.out.println(solve("aba"));
    }
    public static String solve(String A) {
        //char[] Arr=A.toCharArray();
        StringBuilder ans=new StringBuilder();
        Stack<Character> stk=new Stack<Character>();
        stk.push(A.charAt(0));
        boolean isDuplicate=false;
        for (int i = 1; i < A.length(); i++) {
            char peek=!stk.isEmpty()?stk.peek():Character.MIN_VALUE;
            if(( peek!=A.charAt(i))&&(!isDuplicate))
            {
                stk.push(A.charAt(i));
            }else if((!stk.isEmpty())&&( stk.peek()==A.charAt(i))){
                stk.pop();
            }
        }
        int n=stk.size();
        for (int i = 0; i < n; i++) {
            ans=ans.append(stk.pop());
        }
        return ans.reverse().toString();
    }
}
