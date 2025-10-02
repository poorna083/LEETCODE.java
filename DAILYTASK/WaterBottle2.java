import java.util.*;
class InnerWaterBottle2 {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum=numBottles,bottle=numBottles;
        while(bottle >= numExchange)
        {
            bottle-=numExchange;
            numExchange++;
            sum++;
            bottle++;
        }
        return sum;
    }  
}
public class WaterBottle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numBottle = sc.nextInt();
        int numExchange = sc.nextInt();
        InnerWaterBottle2 i = new InnerWaterBottle2();
        
    }
}
