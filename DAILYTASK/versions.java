import java.util.Scanner;
class InnerVersion{
    public int compareVersion(String version1, String version2) {
        if (version1.isEmpty()||version2.isEmpty()) return 0;
        StringBuffer sb = new StringBuffer(version1);
        Character c1 = '.';
        boolean contains = sb.indexOf(String.valueOf(c1))!= -1;
        if (contains) {
            
        }
        StringBuffer sb1 = new StringBuffer(version2);
        Character c2 = '.';
        boolean contain = sb.indexOf(String.valueOf(c2))!= -1;
        if(contain){

        }
    }
}
public class versions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String version1 = sc.nextLine();
        String version2 = sc.nextLine();
        InnerVersion i = new InnerVersion();
        System.out.println(i.compareVersion(version1, version2));
        sc.close();
    }
}
