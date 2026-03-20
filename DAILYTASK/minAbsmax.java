import java.util.Scanner;
class InnerminAbsmax{
    public int[] [] absminmax(int[][] grid,int k){
        if(k<=1) return grid = 0;
        
    }
}

public class minAbsmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int [] [] grid = new int[k][k];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        InnerminAbsmax i = new InnerminAbsmax();
        System.out.println(i.absminmax(grid, k));
    }
}
