import java.util.*;

public class LonelyNums {
    public static void main(String[]args){
      
       int arr[] = {10,6,5,8};

       //5 6 8 10

       Arrays.sort(arr);

        if(arr.length==1 || arr[0]+1 != arr[0+1]){
             System.out.print(arr[0] + " ");
        }

          for(int i=1 ; i<arr.length-1 ; i++){
           if(arr[i+1] != arr[i]+1 && arr[i-1] != arr[i]-1){
                 System.out.print(arr[i] + " ");
           }    
         }

          if(arr[arr.length-1]-1 != arr[arr.length-2]){
                System.out.print(arr[arr.length - 1] + " ");
           }

    }
}
