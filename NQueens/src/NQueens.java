import java.util.*;
public class NQueens {
    private static Set<Integer> colSet = new HashSet<>();
    private static Set<Integer> diag1 = new HashSet<>();
    private static Set<Integer> diag2 = new HashSet<>();

    public static void main(String[] args) {
        int n=4;
        ArrayList<ArrayList<String>> ans=solveNQueens(n);
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(ans.get(i).get(j));
            }
        }
    }
    public static ArrayList<ArrayList<String>> solveNQueens(int n) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        dfs(result, new ArrayList<Integer>(), 0, n);
        return result;
    }

    private static void dfs(ArrayList<ArrayList<String>> result, List<Integer> list, int row, int n){
        if(row == n){
            ArrayList<String> tempList = new ArrayList<>();
            for(int x:list){
                char[] arr = new char[n];
                Arrays.fill(arr, '.');
                arr[x] = 'Q';
                tempList.add(new String(arr));
            }
            result.add(tempList);
            return;
        }

        for(int col=0;col<n;col++){
            if(colSet.contains(col) || diag1.contains(row + col) || diag2.contains(row - col))
                continue;

            //do
            list.add(col);
            colSet.add(col);
            diag1.add(row + col);
            diag2.add(row - col);

            //call
            dfs(result, list, row + 1, n);


            //undo
            list.remove(list.size() - 1);
            colSet.remove(col);
            diag1.remove(row + col);
            diag2.remove(row - col);

        }
    }

}
