import java.util.Scanner;
class InnerVersion{
    public int compareVersion(String version1, String version2) {
        if (version1.isEmpty()||version2.isEmpty())return 0;\
        
    }
}
public class versions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String version1 = sc.nextLine();
        String version2 = sc.nextLine();
        InnerVersion i = new InnerVersion();
        i.compareVersion(version1, version2);
        sc.close();
    }
}
