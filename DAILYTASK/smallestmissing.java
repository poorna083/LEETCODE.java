import java.util.Scanner;
class Innersmallestmissing{
    public int missingvalue(int [] array , int value){
        for(int i=0;i<array.length;i++){
            while(array[i]>0){
                array[i]=value;
            }
        }
    }
}

public class smallestmissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size:");
        int size = sc.nextInt();
        System.out.println("Enter The array:");
        int [] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter The value:");
        int value = sc.nextInt();
        Innersmallestmissing i = new Innersmallestmissing();
        System.out.println(i.missingvalue(array, value));
    }
}
