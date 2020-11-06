public class Judge{
    public Judge(){};

    public int findJudge(int n, int[][] trust){
        int[] count = new int[n];
        for(int[] i: trust){
            count[i[0] - 1]--;
            count[i[1] - 1]++;
        }

        for(int i = 0; i != n; ++i){
            if(count[i] == n - 1){
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[][] trust = new int[][] {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        int n = 4;
        Judge judge = new Judge();

        System.out.println(judge.findJudge(n, trust));
    }
}