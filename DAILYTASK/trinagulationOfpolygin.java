import java.util.Scanner;

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
        
    }
}
