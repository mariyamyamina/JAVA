// import java.util.*;

// public class linearSearch {
//     public static int linearSearchAlgo(String menu[] , String key){
//          for(int i=0; i<menu.length ; i++){
//              if(menu[i]==key){
//                 return i;
//              }
            
//          }
//           return -1;
//         }
    
//     public static void main(String[]args){
//         // int numbers[]={2,4,6,8,10,12,14,16};
//         // int key=14;

//         String menu[] = {"puri","roti","dal","chicken","puffs","samosa","briyani"};
//         String key = "dal";

//         int index = linearSearchAlgo(menu,key);
//         if(index == -1){
//             System.out.println("NOT found");
//         }else{
//             System.out.println("index : " + index);
//         }
//     }
// }

public class linearSearch{

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0 ; i<numbers.length ; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0 ; i<numbers.length ; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[]args){
        int numbers[] = {2,4,6,1,5};

        System.out.println("Largest num is :" + getLargest(numbers));
        System.out.println("Smallest num is :" + getSmallest(numbers));
    }
}