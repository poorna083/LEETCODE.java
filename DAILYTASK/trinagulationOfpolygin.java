import java.util.Scanner;
class InnertrinagulationOfpolygin {
    public int minScoreTriangulation(int[] values) {
        int vertexCount = values.length;
        int[][] minScore = new int[vertexCount][vertexCount];

        for (int gap = 2; gap < vertexCount; gap++) {
            for (int start = 0; start + gap < vertexCount; start++) {
                int end = start + gap;
                int currentMinScore = Integer.MAX_VALUE;

                for (int mid = start + 1; mid < end; mid++) {
                    int triangleScore = minScore[start][mid] 
                        + minScore[mid][end] 
                        + values[start] * values[mid] * values[end];
                    currentMinScore = Math.min(currentMinScore, triangleScore);
                }
                minScore[start][end] = currentMinScore;
            }
        }
        return minScore[0][vertexCount - 1];
    }
    
}
public class trinagulationOfpolygin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size:");
        int size = sc.nextInt();
        System.out.println("Enter The array Elements:");
        int [] values = new int[size];
        for(int i=0;i<size;i++){
            values[i]=sc.nextInt();
        }
        InnertrinagulationOfpolygin i = new InnertrinagulationOfpolygin();
        System.out.println(i.minScoreTriangulation(values));

    }
}
