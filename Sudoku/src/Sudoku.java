import java.util.*;
public class Sudoku {
    private int n;
    private ArrayList < ArrayList < Character >> A;
    private HashSet < Character > hashSet;
    public void solveSudoku(ArrayList < ArrayList < Character >> A) {
        n = A.size();
        this.A = A;
        hashSet = new HashSet < > ();
        backtrack(0, 0);
    }
    public boolean backtrack(int row, int col) {
        if (row == n)
            return true;
        char c = A.get(row).get(col);
        int rr, cc;
        rr = row;
        cc = col + 1;
        if (cc == n) {
            rr++;
            cc = 0;
        }
        if (c == '.') {
            for (char ch = '1'; ch <= '9'; ch++) {
                A.get(row).set(col, ch);
                if (isValid(row, col)) {
                    boolean status = backtrack(rr, cc);
                    if (status)
                        return true;
                }
                A.get(row).set(col, '.');
            }
        } else {
            return backtrack(rr, cc);
        }
        return false;
    }
    public boolean isValid(int row, int col) {
        hashSet.clear();
        char c;
        for (int i = 0; i < n; i++) {
            c = A.get(row).get(i);
            if (hashSet.contains(c))
                return false;
            if (c != '.')
                hashSet.add(c);
        }
        hashSet.clear();
        for (int i = 0; i < n; i++) {
            c = A.get(i).get(col);
            if (hashSet.contains(c))
                return false;
            if (c != '.')
                hashSet.add(c);
        }
        int sRow = (row / 3) * 3;
        int sCol = (col / 3) * 3;
        hashSet.clear();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int rr = sRow + i;
                int cc = sCol + j;
                c = A.get(rr).get(cc);

                if (hashSet.contains(c))
                    return false;
                if (c != '.')
                    hashSet.add(c);
            }
        }
        return true;
    }
}

