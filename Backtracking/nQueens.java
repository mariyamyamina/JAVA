import java.util.*;
public class nQueens{
    public static boolean isSafe(char board[][] , int row , int col){
        //verical up
         for(int i=row-1 ; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
         }
         //diag left up
         for(int i=row-1 , j=col-1 ; i>=0 && j>=0 ; i--,j--){
               if(board[i][j]=='Q'){
                return false;
               }
         }
         //diag right up
         for(int i=row-1 , j=col+1 ; i>=0 && j <board.length ; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
         }
         return true;
    } 
    public static void nQueensfunc(char board[][] , int row){
        //Base case
        if(row==board.length){
            // printboard(board);
            count++;
            return;
        }

        for(int j=0 ; j<board.length ; j++){
            if(isSafe(board , row , j)){
                board[row][j] = 'Q';
                nQueensfunc(board , row+1);
                board[row][j] ='.';
            }
        }
    }

    public static void printboard(char board[][]){
        System.out.println("---------------------------");
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board.length ; j++){
               System.out.print( board[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    static int count = 0;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char board[][] = new char[n][n];
        count =0;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                board[i][j]='.';
            }
        }
        nQueensfunc(board , 0);
        System.out.print(count);
        sc.close();
    }
}