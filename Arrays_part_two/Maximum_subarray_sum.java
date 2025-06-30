//Maximum SubArray sum - I (Brute Force)

//Time complexity O(n^3) -> Worst time complexity
package Arrays_part_two;

public class Maximum_subarray_sum {

    public static void MaxSubArraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0 ; i<numbers.length ; i++){
            int start = i;
            
            for(int j=i ; j<numbers.length ; j++){
                int end = j;
                currSum =0;
                for(int k=start ; k<=end ;k++){
                    currSum += numbers[k];
                }
                System.out.print(currSum + " ");

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.print("\n");
        }
        System.out.println("Max Sub Array sum :" + maxSum);
    }
    public static void main(String[]args){
        int numbers[] = {1,2,3,4,5};
    
        MaxSubArraySum(numbers);

    }
}
