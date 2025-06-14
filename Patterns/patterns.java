package Patterns;

public class patterns {
    public static void hollow_rectangle(int row,int col){
          for(int i=1 ; i<=row ; i++){
              for(int j=1 ; j<=col ; j++){
                  if(i==1 || i==row || j==1 || j==col){
                    System.out.print("* ");
                  }else{
                    System.out.print("  ");
                  }
              }
              System.out.print("\n");
          }
    }

public static void inverted_rotated_half_pyramid(int row){
    for(int i=1 ; i<=row ; i++ ){
        for(int j=1 ; j<= row-i ; j++){
            System.out.print(" ");
        }
        for(int j=1 ; j<=i ; j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
}

public static void inverted_half_number_pyramid(int n){
     for(int i=1;i<=n;i++){
        for(int j=1 ; j<=n-i+1 ; j++){
            System.out.print(j);
        }
        System.out.print("\n");
     }
}

public static void floyds_triangle(int n){
    int num=1;
    for(int i=1 ; i<=n ; i++){
       for(int j=1 ; j<=i ; j++){
            System.out.print(num + " ");
            num++;
       }
       System.out.print("\n");
    }
}

public static void zero_one_triangle(int n){
    for(int i=1 ; i<=n ; i++){
       for(int j=1 ; j<=i ; j++){
        if((i+j)%2==0){
            System.out.print("1 ");
        }else{
            System.out.print("0 ");
        }
       }
       System.out.print("\n");
    }
}

public static void butterfy_pattern(int n){
    for(int i=1 ; i<=n ; i++){
         //star i
         for(int j=1 ; j<=i ; j++){
            System.out.print("* ");
         }
         //spaces 2*(n-i)
         for(int j=1 ; j<=2*(n-i);j++){
            System.out.print("  ");
         }
         for(int j=1 ; j<=i ; j++){
            System.out.print("* ");
         }
         System.out.print("\n");
    }

    for(int i=n ; i>=1 ; i--){
        //star i
         for(int j=1 ; j<=i ; j++){
            System.out.print("* ");
         }
         //spaces 2*(n-i)
         for(int j=1 ; j<=2*(n-i);j++){
            System.out.print("  ");
         }
         for(int j=1 ; j<=i ; j++){
            System.out.print("* ");
         }
         System.out.print("\n");
    }
}

public static void rhombus(int n){
    for(int i=1 ; i<=n ; i++){
       for(int j=1 ; j<=n-i ; j++){
        System.out.print("  ");
       }
       for(int j=1 ; j<=n ; j++){
          System.out.print("* ");
       }
       System.out.print("\n");
    }
}

public static void hollow_rhombus(int a , int b){
    for(int i=1 ; i<=a ; i++){
        for(int j=1 ; j<=a-i ;j++){
            System.out.print(" ");
        }
        for(int j=1 ; j<=b ; j++){
           if(i==1 || i==a || j==1 || j==b){
            System.out.print("*");
           }else{
            System.out.print(" ");
           }
        }
        System.out.print("\n");
    }
}

public static void diamond(int n){
    for(int i=1 ; i<=n ; i++){
       for(int j=1 ; j<=n-i ; j++){
        System.out.print(" ");
       }
       for(int j=1;j<=i;j++){
        System.out.print("* ");
       }
       System.out.print("\n");
    }

    for(int i=n ; i>=1 ; i--){
        for(int j=1 ; j<=n-i ; j++){
        System.out.print(" ");
       }
       for(int j=1;j<=i;j++){
        System.out.print("* ");
       }
       System.out.print("\n");
    }
}
public static void main(String[]args){
  diamond(4);
}

}


