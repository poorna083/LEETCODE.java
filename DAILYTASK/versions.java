import java.util.Scanner;
class InnerVersion{
    public int compareVersion(String version1, String version2) {
        int temp1 = 0, temp2 = 0;
        int len1 = version1.length(), len2 = version2.length();
        int i = 0, j = 0;
        
        while (i < len1 || j < len2) {
            temp1 = 0;
            temp2 = 0;
            
            while (i < len1 && version1.charAt(i) != '.') {
                temp1 = temp1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            while (j < len2 && version2.charAt(j) != '.') {
                temp2 = temp2 * 10 + (version2.charAt(j) - '0');
                j++;
            }
            
            if (temp1 > temp2) return 1;
            if (temp1 < temp2) return -1;
            
            i++;
            j++;
        }
        return 0;
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
