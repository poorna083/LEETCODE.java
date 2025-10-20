import java.util.Scanner;
class InnervalueVariable {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String op : operations) {
            if (op.equals("++X") || op.equals("X++")) {
                X++;
            } else if (op.equals("--X") || op.equals("X--")) {
                X--;
            }
        }
        return X;
    }
    
}
public class valueVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] operations = new String[s.length()];
        InnervalueVariable i = new InnervalueVariable();
        System.out.println(i.finalValueAfterOperations(operations));
        
    }
}
