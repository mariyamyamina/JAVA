import java.util.*;
public class matrices {

    public static int Search(int matrix[][] , int key){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] == key){
                    System.out.println("key found at" +"(" + i + "," + j +")");
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[]args){
        int matrix[][] = new int[3][3];
        int n = matrix.length , m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                  matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0 ;i<n ; i++){
            for(int j=0 ;j<m ;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
         Search(matrix , 5);
         sc.close();
    }
}
