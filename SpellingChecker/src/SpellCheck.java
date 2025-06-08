import  java.util.*;
class Node{
    char ch;
    HashMap<Character,Node> child = new HashMap<Character,Node>();
    boolean isEnd= false;
    Node(char x){
        ch = x;
    }
}

public class SpellCheck {
    public static void main(String[] args) {
        String[] A = { "hat", "cat", "rat" };
        String[] B = { "cat", "ball" };

        int[] output=solve(A,B);
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }


    }
    public static int[] solve(String[] A, String[] B) {
        int N = A.length;
        Node root = new Node(' ');
        for(int i=0;i<N;i++){
            insert(root,A[i]);
        }
        int M = B.length;
        int OP[] = new int[M];
        for(int i=0;i<M;i++){
            OP[i] = search(root,B[i]);
        }
        return OP;
    }
    public static void insert(Node root,String word){
        Node temp = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.child.containsKey(ch)){
                temp.child.put(ch,new Node(ch));
            }
            temp = temp.child.get(ch);
        }
        temp.isEnd = true;
        return;
    }
    public static int search(Node root,String word){
        Node temp = root;
        for(int i=0; i<word.length();i++){
            char ch = word.charAt(i);
            if(!temp.child.containsKey(ch)){
                return 0;
            }
            temp = temp.child.get(ch);
        }
        if(temp.isEnd){
            return 1;
        }
        return 0;
    }
}
