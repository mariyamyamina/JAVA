
public class Substring {
    public static int substring(String str , int i , int j , int n){
        if(n==1) return 1;
        if(n<=0) return 0;

        int res = substring(str,i+1 , j , n-1) + substring(str , i , j-1 , n-1) - substring(str,i+1 , j-1 , n-2);

        if(str.charAt(i)==str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String[]args){
           System.out.print(substring("abcab" , 0 , 4 , 5));
    }
}
