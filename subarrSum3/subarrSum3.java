package subarrSum3;

public class subarrSum3 {
    public static void subArr_kadane(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<numbers.length;i++){
            currSum=currSum+numbers[i];
            if(currSum<0){
                currSum=0;
            }maxSum=Math.max(currSum,maxSum);
        } System.out.println("our max subarray sum is:"+ maxSum);
    }
    public static void main(String [] args){
        int numbers[]={-6,3,4,-3,-9,8,4,5,2,9,-5};
        subArr_kadane(numbers);
    }
    
}
