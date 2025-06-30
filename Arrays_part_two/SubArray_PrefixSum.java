//Maximum subarray sum -II (prefix Sum)

//Time complexity O(n^2)

package Arrays_part_two;

public class SubArray_PrefixSum {

    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i=1 ; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0 ; i<numbers.length ;i++){
            int start =i;

            for(int j=0 ; j<numbers.length ; j++){
                int end=j;

                currSum = (start==0) ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            
        }
        System.out.print("MAX SUM : " + maxSum);
    }
   
    //TIme complexity : O(n) ->Best case
    public static void KadanesAlgorithm(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            currSum+=numbers[i];
            maxSum = Math.max(currSum , maxSum);

            if(currSum < 0){
                currSum=0;
            }
        }
        System.out.print("Max subarray sum :" +maxSum);
    }
    public static void main(String[]args){
        int numbers[] = {1,-2,6,-1,3};
        //  maxSubarraySum(numbers);
         KadanesAlgorithm(numbers);
    }
}
