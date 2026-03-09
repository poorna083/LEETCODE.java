import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        char [] array = new char[size];
        for(int i=0;i<size;i++){
            array[i]= sc.next().charAt(i);
        } 
        
        
    }
}
