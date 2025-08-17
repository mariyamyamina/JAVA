public class Descending {
    public static void printDec(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }

    public static void printAsc(int n){
         if(n==10){
            System.out.print("10 ");
            return;
         }
         System.out.print(n+ " ");
         printAsc(n+1);
    }

   public static int fact(int n){
    if(n==0){
        return 1;
    }
    int fN_1 = fact(n-1);
    int fN = n * fN_1;
    
    return fN;
   }


   public static int sumOfNumbers(int n){
      if(n==1){
         return 1;
      }
      int sum_1 = n + sumOfNumbers(n-1);
      int sum = sum_1;
      return sum;
   }

   public static int fibonacciSeries(int n){
       if(n==0){
          return 0;
       }else if(n==1){
          return 1;
       }
       int fib_nm1 = fibonacciSeries(n-1);
       int fib_nm2 = fibonacciSeries(n-2);
       int fib_n = fib_nm1 + fib_nm2;
       return fib_n;
   }

    public static boolean isSort(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSort(arr,i+1);
    }

    public static int firstOccurence(int arr[] , int key , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return firstOccurence(arr,key,i+1);
    }

    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,key,i+1);

        if(isFound!=-1){
            return isFound;
        }

        if(arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }

        int xnm1 = power(x,n-1);
        int xn = x*xnm1;
        return xn;
    }

    public static int optimizedPower(int x,int n){
        if(n==0){
            return 1;
        }

        int halfPower = optimizedPower(x,n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2!=0){
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static int TilingProblem(int n){ //Amazon
        if(n==0 || n==1){
            return 1;
        }

        //vertical alignment
        int fnm1 = TilingProblem(n-1);
        //Hoeizontal Alignment
        int fnm2 = TilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void removeDuplicates(String str , int idx , StringBuilder newStr , boolean map[]){ //Google,Microsoft
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar -'a'] == true){
            removeDuplicates(str,idx+1,newStr,map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }

    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        //single
        int fnm1 = friendsPairing(n-1);
        //Pair
        int fnm2 = friendsPairing(n-2);
        int pairways = (n-1)*fnm2;

        int totways = fnm1 + pairways;
        return totways;
    }

    public static void BinaryString(int n , int lastPlace , String str){  //paytm
        if(n==0){
            System.out.println(str);
            return;
        }
       
        if(lastPlace==0){
            BinaryString(n-1 , 0 , str+"0");
            BinaryString(n-1 , 1 , str+"1");
        }else{
            BinaryString(n-1 , 0 , str+"0");
        }
    }

    public static void main(String[]args){
        System.out.print(TilingProblem(4));
    }
}
