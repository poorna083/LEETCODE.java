package MATRIX;

import java.util.Arrays;
import java.util.Scanner;
class InnerreShape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
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
    }
}
