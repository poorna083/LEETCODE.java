import java.util.Scanner;

public class clearDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            Character c = Character.toLowerCase(s.charAt(i));
            if (c < 'a' && c > 'z') 
            flag = false;
        }
        if (flag) {
            System.out.println("\"\"");
            }
        else{
            System.out.println(("\""+s+"\""));
        } 
         
        
    }
}
