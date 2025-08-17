public class PrintDigits{
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void printDigits(int num){
        if(num==0) return;

        int last = num%10;
        printDigits(num/10);
        System.out.print(digits[last] + " ");
    }
    public static void main(String[]args){
        printDigits(6789);
    }
}