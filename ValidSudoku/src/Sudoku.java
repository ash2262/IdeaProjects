public class Sudoku {
    public static void main(String[] args) {
        string[] B={9 ..5.....6 ....14...", ".........", ".....92..", "5....2...", ".......3.", "...54....", "3.....42.", "...27.6.."};
        System.out.println(isValidSudoku(B));
    }
    public static int isValidSudoku(final String[] A) {
        int row[][]=new int[10][10];
        int col[][]=new int[10][10];
        int box[][]=new int[10][10];
        int r=0;
        for(int i=0;i<A.length;i++) {
            if(i>0 && i%3==0) {
                r+=3;
            }
            for(int j=0;j<A[0].length();j++) {
                if(A[i].charAt(j)!='.' && row[i][A[i].charAt(j)-'0']!=0) {
                    return 0;
                }
                else {
                    if(A[i].charAt(j)!='.')
                        row[i][A[i].charAt(j)-'0']=1;
                }
                if(A[i].charAt(j)!='.' && col[j][A[i].charAt(j)-'0']!=0) {
                    return 0;
                }
                else {
                    if(A[i].charAt(j)!='.')
                        col[j][A[i].charAt(j)-'0']=1;
                }
                if(A[i].charAt(j)!='.' && box[r+(j/3)][A[i].charAt(j)-'0']!=0) {
                    return 0;
                }
                else {
                    if(A[i].charAt(j)!='.')
                        box[r+(j/3)][A[i].charAt(j)-'0']=1;
                }
            }
        }
        return 1;
    }
}
