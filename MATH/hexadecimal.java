import java.util.Scanner;
class Innerhexadecimal {
    public String toHex(int num) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = map[(num & 15)] + result; 
            num = (num >>> 4);
        }
        return result;
    } 
}

public class hexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Innerhexadecimal i = new Innerhexadecimal();
        System.out.println(i.toHex(num));
    }
}
