import java.util.Scanner;
class InnerwaterBottles {
    public int numWaterbottle(int numbottle,int numExchange){
            int totalBottles = numbottle;

        while (numbottle >= numExchange) {
            totalBottles += numbottle / numExchange;
            numbottle = (numbottle / numExchange) + (numbottle % numExchange);
        }

        return totalBottles; 
    }
}

public class waterBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of bottle");
        int numbottle = sc.nextInt();
        System.out.println("Enter the numExchane of bottle ");
        int numExchange = sc.nextInt();
        InnerwaterBottles i = new InnerwaterBottles();
        System.out.println(i.numWaterbottle(numbottle, numExchange));

    }
}
