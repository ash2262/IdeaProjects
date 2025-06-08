public class RegularExpression {
    public static void main(String[] args) {
        //String A="aaa";
        String A="acz";
        //String B="a*";
        String B="a?a";
        System.out.println(isMatch(A,B));
    }
    public static int isMatch(final String A, final String B) {

        int n = A.length();
        int m = B.length();
        int[] first = new int[m+1];
        int[] second = new int[m+1];

        for(int i=1; i<=m; i++)
        {
            if(B.charAt(i-1) == '*')
                first[i] = 1;
            else
                break;
        }

        first[0] = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                if(A.charAt(i-1) == B.charAt(j-1) || B.charAt(j-1) == '?')
                    second[j] = first[j-1];
                else if(B.charAt(j-1) == '*')
                    second[j] = (first[j] == 1 || second[j-1] == 1) ? 1 : 0;
                else
                    second[j] = 0;
            }
            first[0] = 0;
            int[] temp = first;
            first = second;
            second = temp;
        }

        return first[m];
    }
}
