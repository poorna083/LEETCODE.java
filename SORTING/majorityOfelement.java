import java.util.Scanner;

public class majorityOfelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int count = 0,candidate = 0;
        for(int num :array){
            if (count == 0) {
                candidate = num;
            }
            count +=  (num==candidate) ? 1 : -1;
            

        }System.out.println(candidate);
        
    }
}
