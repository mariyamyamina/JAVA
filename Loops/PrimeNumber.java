package Loops;
import java.util.*;

public class PrimeNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int isPrime = 1;

        if(n<2) isPrime=0;

        for(int i=2 ; i<=Math.sqrt(n) ; i++){
            
            if(n%i==0){
               isPrime = 0;
               break;
            }
        }

        if(isPrime==1){
            System.out.println(n + " is a Prime Number");
        }else{
             System.out.println(n + " is not a Prime Number");
        }
         sc.close();
    }
   
}
