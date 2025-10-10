/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

// Dummy GuessGame class for compilation
class GuessGame {
    private int pickedNumber;

    public GuessGame(int pickedNumber) {
        this.pickedNumber = pickedNumber;
    }

    public int guess(int num) {
        if (num > pickedNumber) return -1;
        else if (num < pickedNumber) return 1;
        else return 0;
    }
}

public class Solution extends GuessGame {
    public Solution(int pickedNumber) {
        super(pickedNumber);
    }

import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The upper bound (n):");
        int n = sc.nextInt();
        System.out.println("Enter the picked number:");
        int picked = sc.nextInt();
        Solution solution = new Solution(picked);
        System.out.println("Guessed number: " + solution.guessNumber(n));
    }
}
            } else if (result == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return -1;
    }
}
public class guessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number:");
        int n = sc.nextInt();
        InnerguessNumber i = new InnerguessNumber();
        System.out.println(i.numberguessing(n));
    }
}
