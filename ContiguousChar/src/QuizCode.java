public class QuizCode {
    public static void main(String[] args) {
        String A="lmsltrv";
        int B=5;
        String C="l";

        System.out.println(solve(A,B,C));
    }

    public static int solve(String A, int B, String C) {
        int cnt=0;
        char[] Arr=A.toCharArray();
        int firstIndex=A.indexOf(C);
        int lastIndex=A.lastIndexOf(C);



        for(int i=firstIndex;i<=lastIndex;i++){
            if(Arr[i]==C.charAt(0)){
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

        int j=firstIndex-1;
        while((B>0)&&(j<A.length())){

            Arr[j]=C.charAt(0);
            cnt++;
            B--;
            j++;

        }

        int i=lastIndex+1;
        while(B>0 && i<A.length()){

            Arr[i]=C.charAt(0);
            cnt++;
            B--;
            i++;

        }




        return cnt;
    }
    }

