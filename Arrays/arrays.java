// import java.util.*;

// public class arrays {
//     public static void main(String[]args){
//         //Creating a Array
//         int marks[] = new int[50];
        
//         //Input
//         Scanner sc = new Scanner(System.in);
//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
       
//         //Output
//         System.out.println("Phy : " + marks[0]);
//         System.out.println("Maths : " + marks[1]);
//         System.out.println("Chem : " + marks[2]);
        
//         //Update
//         marks[2] = marks[2]+5;
//         System.out.println("Chem : " + marks[2]);

//         System.out.println("Average :" + (marks[0] + marks[1]+marks[2])/3);

//         sc.close();
//     }
// }

//Pasing arrays as argument
public class arrays{
    public static void update(int marks[]){
       for(int i=0; i<marks.length ; i++){
           marks[i] = marks[i] + 2;
       }
    }
    public static void main(String[]args){
        int marks[] = {87,85,90};
        update(marks);

        for(int i=0;i<marks.length;i++){
             System.out.print(marks[i]+" ");
        }
        
    }
}