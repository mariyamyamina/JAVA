public class GridWays {
    public static int findGridWays(int i , int j , int n , int m){

        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        int w1 = findGridWays(i+1 , j , n , m);
        int w2 = findGridWays(i , j+1 , n , m);
        return w1 + w2;
    }
    public static void main(String[]args){
        int n=4;
        int m=5;

        System.out.print(findGridWays(0 , 0 , n , m));
    }
}
