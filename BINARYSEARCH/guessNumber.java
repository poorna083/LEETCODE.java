import java.util.Scanner;

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

class Solution extends GuessGame {
    public Solution(int pickedNumber) {
        super(pickedNumber);
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = guess(mid);
            if (result == 0) return mid;
            else if (result == -1) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}

public class guessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the picked number: ");
        int picked = sc.nextInt();
        Solution solution = new Solution(picked);
        System.out.println("Guessed number: " + solution.guessNumber(n));
        sc.close();
    }
}
