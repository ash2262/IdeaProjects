public class ContiguousChar {
    public static void main(String[] args) {
        /*String A="oyorooms";
        int B=1;
        String C="o";*/

       /* String A="lmsltrv";
        int B=5;
        String C="l";*/

         /*String A="froxl";
        int B=1;
        String C="f";*/

/*        String A="afy";
        int B=2;
        String C="a";*/

/*           String A="uuufsvr";
            int B=7;
            String C="v";*/

/*            String A="k";
            int B=1;
            String C="k";*/
            /*String A="cexltqwwalupwqspvjylocipuuauhxeldcw";
            int B=8;
            String C="h";*/

                   String A="rtbhypvuedxxmiaevhauybcchu";
            int B=3;
            String C="u";
        System.out.println(solve(A,B,C));
    }
    public static int solve(String A, int B, String C) {
    int cnt=0;
    char[] Arr=A.toCharArray();
    int firstIndex=A.indexOf(C);
    int lastIndex=A.lastIndexOf(C);

        for (int i = firstIndex; i <=lastIndex ; i++) {
            if (Arr[i] == C.charAt(0)) {

                cnt++;
            }
            else if((Arr[i-1]==C.charAt(0))&&(Arr[i+1]==C.charAt(0))&&(Arr[i]!=C.charAt(0))&&(B>0)){
                Arr[i]=C.charAt(0);
                cnt++;
                B--;
            }
            if((B>0)&&(Arr[i]!=C.charAt(0))){
                Arr[i]=C.charAt(0);
                cnt++;
                B--;
            }
        }

        int i=firstIndex-1;
        while ((B>0)&&(i>=0)){

                Arr[i]=C.charAt(0);
                cnt++;
                B--;
                i--;

        }
        int j=lastIndex+1;
        while(B>0 && j<A.length()){

                Arr[j]=C.charAt(0);
                cnt++;
                B--;
                j++;

        }
        int finalcnt=0;
        int contigcnt=0;
        for (int k = 0; k < Arr.length-1; k++) {
            if(Arr[k]==C.charAt(0))
            {
                contigcnt++;
                if(finalcnt<contigcnt) {
                    finalcnt=contigcnt;
                }
            }
            else
                contigcnt=0;
        }

    return  finalcnt;
    }
}
