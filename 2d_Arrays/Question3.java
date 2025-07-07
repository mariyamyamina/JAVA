public class Question3 {
    public static void main(String[]args){
        //Rectangular matrix

    //     int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
    //     int n = arr.length;
    //     int m = arr[0].length;

    //     int transpose[][] = new int[m][n];

    //     for(int i=0 ; i<n ;i++){
    //         for(int j=0 ; j<m ;j++){
    //             transpose[j][i] = arr[i][j];
    //         }
    //     }
    //     for(int i=0 ; i<m ; i++){
    //         for(int j=0 ; j<n ; j++){
    //             System.out.print(transpose[i][j]+" ");
    //         }
    //         System.out.println();
    //     }

    //Square matrix

     int arr[][] = {{10,20,30},{23,56,78},{56,34,11}};
     int n = arr.length;
     int m = arr[0].length;

     for(int i=0 ; i<n ;i++){
        for(int j=i ; j<n ;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
     }

     for(int i=0 ; i<n ;i++){
        for(int j=0 ; j<n ;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
     }
     }
}
