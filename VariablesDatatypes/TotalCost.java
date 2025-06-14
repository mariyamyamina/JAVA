import java.util.*;
public class TotalCost {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pencil+pen+eraser;
        System.out.println("Bill :" + bill);
        
        //Add 18% GST

        float newBill = bill +(0.18f * bill);
        System.out.println("New Bill :" + newBill);
        sc.close();
    }
}
