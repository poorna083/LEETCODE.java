import java.util.Scanner;

public class RomanToInteger {
    static class Solution {
        public int romanToInt(String s) {
            int total = 0;
            int prevValue = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                int value = 0;

                switch (c) {
                    case 'I': value = 1; break;
                    case 'V': value = 5; break;
                    case 'X': value = 10; break;
                    case 'L': value = 50; break;
                    case 'C': value = 100; break;
                    case 'D': value = 500; break;
                    case 'M': value = 1000; break;
                }

                if (value < prevValue) {
                    total -= value;
                } else {
                    total += value;
                }
                prevValue = value;
            }

            return total;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sl = new Solution();
        System.out.println("Enter Roman Numeral:");
        String input = sc.nextLine();
        int result = sl.romanToInt(input);
        System.out.println("Integer Value: " + result);
        sc.close();
    }
}
