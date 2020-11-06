public class Judge{
    public Judge(){};

    public int findJudge(int n, int[][] trust){
        int[] count = new int[n + 1]; //We do not include 0
        for(int[] i: trust){
            count[i[0]]--; //if you trust someone you're not the judge
            count[i[1]]++;  //if you are trusted you could be the judge
        }
        for(int i = 1; i <= n; i++){
            if(count[i] == n - 1){  //the judge is trusted by n-1 people
                return i;
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
