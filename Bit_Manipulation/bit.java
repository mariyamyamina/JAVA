package Bit_Manipulation;

public class Bit {
    public static void main(String[]args){
        int result = ClearLastIBit(15,2);
        System.out.println(result);
    }

    public static void OddEven(int n){
        if((n&1)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static int Get_ith_Bit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int Set_ith_Bit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int Clear_ith_Bit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int Update_ith_bit(int newBit,int n , int i){
         if(newBit==0){
            return Clear_ith_Bit(n,i);
         }else{
            return Set_ith_Bit(n,i);
         }
    }

    public static int ClearLastIBit(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
}
