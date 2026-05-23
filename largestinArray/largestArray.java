package largestinArray;

public class largestArray {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }

        }return largest;
    }
    public static void main(String[]args){
        int numbers[]={2,6,5,8,3,9};
        System.out.println("largest value is:"+getLargest(numbers));
    }
}
