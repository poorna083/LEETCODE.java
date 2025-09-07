import java.util.*;
class nextgreaterEle{
    public int[] greaterElement(int[]array1,int[]array2){
        if(array1.length<=0 || array2.length<=0) return  
        for (int i = 0; i < array1.length; i++) {
            for (int j = i+1; j < array2.length; j++) {
                if (array1[i]>=array2[j]) {
                    return array1;
                }
            }
        }
    }
}

public class nextGreaterelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int [] array1 = new int[size1];
        int [] array2 = new int[size2];
        for(int i=0;i<size1;i++){
            array1[i]=sc.nextInt();
        }
        for(int i=0;i<size2;i++){
            array2[i]=sc.nextInt();
        }
        nextgreaterEle n = new nextgreaterEle();
        n.greaterElement(array1, array2);
    }    
}
