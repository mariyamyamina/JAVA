//Print number of 7s in 2D matrix

public class Question1{

    public static int Search_seven(int arr[][],int count){

         int n = arr.length;
         int m = arr[0].length;

         for(int i=0 ; i<n ;i++){
            for(int j=0 ; j<m ; j++){
                if(arr[i][j] == 7){
                    count++;
                }
            }
         }
         System.out.println(count);
         return 0;
     }
   
     public static void main(String[]args){

         int arr[][] = {{4,7,8},{8,8,7},{7,7,9}};
         int count =0 ;
         Search_seven(arr,count);
         
     }
}