public class StrSmallestPrefix {
    public static void main(String[] args) {
        //String A="abba";
        String A="acd";
        //String B="cdd";
        String B="bay";
        System.out.println(smallestPrefix(A,B));
    }
    public static String smallestPrefix(String A, String B) {
        StringBuilder output=new StringBuilder( A.charAt(0));
        output.append(A.charAt(0));
        int i=1;
        while (i<A.length()&& A.charAt(i)<B.charAt(0)){
               output.append( A.charAt(i));
               i++;
        }
        output.append(B.charAt(0));

        return output.toString();
    }
}
