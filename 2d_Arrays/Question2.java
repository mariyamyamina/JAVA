public class Question2 {
    public static void main(String[]args){
        int arr[][] = {{1,2,3} , {4,5,6}, {7,8,9}};
        int sum = 0;
       
         for(int j=0 ; j<arr[0].length ; j++){
            sum += arr[1][j];
        }
        System.out.println(sum);
    }
}
