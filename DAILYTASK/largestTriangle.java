import java.util.Scanner;
class InnerlargestTriangle {
    public double largestTriangleArea(int[][] array) {
        double maxArea = 0.0;
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = j + 1; k < n; ++k) {
                    int x1 = array[i][0], y1 = array[i][1];
                    int x2 = array[j][0], y2 = array[j][1];
                    int x3 = array[k][0], y3 = array[k][1];
                    double area = 0.5 * Math.abs(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 -y2));
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    
}

public class largestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][]array = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                array[i][j] = sc.nextInt();
            }
        }
        InnerlargestTriangle i = new InnerlargestTriangle();
        System.out.println(i.largestTriangleArea(array));
        sc.close();
    }
}
