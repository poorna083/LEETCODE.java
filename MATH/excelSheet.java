import java.util.Scanner;
class InnerexcelSheet {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }

        return result.toString();
    }
    
}
public class excelSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        InnerexcelSheet i = new InnerexcelSheet();
        System.out.println(i.convertToTitle(n));

    }
}
