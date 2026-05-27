package subArrays;

public class subArr {
    public static void subArrays(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
<<<<<<< HEAD
                    System.out.print(numbers[k] + " ");
=======
                    System.out.print(numbers[k]+ " ");
>>>>>>> eb3a4c85e02b7081bcaf46ae13a7ff4330024cfe
                }System.out.println();
            }System.out.println();
        }
    }
    public static void main(String[]args){
        int numbers[]={2,4,6,8,10};
        subArrays(numbers);
    }
}
