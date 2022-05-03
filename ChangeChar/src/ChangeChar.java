public class ChangeChar {
    public static void main(String[] args) {

    }
    public int solve(String A, int B) {

        int[] count = new int[26];
        int distinct = 0;
        for(int i=0; i<A.length(); i++)
        {
            count[ A.charAt(i)-'a' ]++;
            if( count[ A.charAt(i)-'a' ] == 1)
                distinct++;
        }

        int remove = 0;
        while(B > 0)
        {
            int min = 0;
            int index = 0;
            for(int i = 0; i<26; i++)
            {
                if(count[i] > min && min == 0)
                {
                    min = count[i];
                    index = i;
                }
                else if(min > count[i] && count[i] != 0)
                {
                    min = count[i];
                    index = i;
                }
            }
            count[index] = 0;
            B = B - min;
            if(B >= 0)
                remove++;
        }
        return distinct-remove;
    }
}
