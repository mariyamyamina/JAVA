import java.util.*;
public class LargestOfTwoNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("A is Greater");
        }else if(a<b){
            System.out.println("B is Greater");
        }else{
            System.out.println("A and B are Equal");
        }
        sc.close();
    }
}
