package MATRIX;

import java.util.Arrays;
import java.util.Scanner;
class InnerreShape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        public int[][] matrixReshape(int[][] nums, int r, int c) {
    int n = nums.length, m = nums[0].length;
    if (r*c != n*m) return nums;
    int[][] res = new int[r][c];
    for (int i=0;i<r*c;i++) 
        res[i/c][i%c] = nums[i/m][i%m];
    return res;
}
    }
    
}
public class reShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] []mat = new int[size][size];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        InnerreShape i = new InnerreShape();
        System.out.println(i.matrixReshape(mat, r, c));
    }
}
