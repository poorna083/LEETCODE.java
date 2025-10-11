import java.util.Arrays;
import java.util.Scanner;
public class InnerislandPerimiter {
    public int islandPerimeter(int[][] grid) {
        if (grid == null) return 0;
        for (int i = 0 ; i < grid.length ; i++){
            for (int j = 0 ; j < grid[0].length ; j++){
                if (grid[i][j] == 1) {
                    return getPerimeter(grid,i,j);
                }
            }
        }
        return 0;
    }
    
    public int getPerimeter(int[][] grid, int i, int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {return 1;}
        if (grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == -1) return 0;
        
        int count = 0;
        grid[i][j] = -1;
        
        count += getPerimeter(grid, i-1, j);
        count += getPerimeter(grid, i, j-1);
        count += getPerimeter(grid, i, j+1);
        count += getPerimeter(grid, i+1, j);
        
        return count;
        
    }
}

public class islandPerimiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int [] [] grid = new int[Size][Size];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
}
