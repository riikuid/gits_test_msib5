import java.util.Arrays;

public class soal2 {
    public static int[] soalnomor2(int[] scores, int[] gitsScores) {
        int[] denseRanking = new int[gitsScores.length];
        int[] uniqueScores = Arrays.stream(scores).distinct().toArray();

        for (int i = 0; i < gitsScores.length; i++) {
            int currentScore = gitsScores[i];
            int rank = 1;

            for (int j = 0; j < uniqueScores.length; j++) {
                if (currentScore >= uniqueScores[j]) {
                    break;
                }
                rank++;
            }

            denseRanking[i] = rank;
        }

        return denseRanking;
    }

    public static void main(String[] args) {
        int[] scores = {100, 100, 50, 40, 40, 20, 10};
        int[] gitsScores = {5, 25, 50, 120};
        int[] result = soalnomor2(scores, gitsScores);

        System.out.print("Output: ");
        for (int rank : result) {
            System.out.print(rank + " ");
        }
    }
}