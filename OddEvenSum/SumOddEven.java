package OddEvenSum;
import java.util.Scanner;
public class SumOddEven {
    public static void main(String[]args){
        int evenSum=0;
        int oddSum=0;
        int num;
        int choice;
       
        do{
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter no's:");
            num=scanner.nextInt();
            if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }
        
        System.out.println("Do you want to continue if yes press 1 else 0(1/0):");
        choice=scanner.nextInt();
     }
        while(choice==1);
            System.out.println("Sum of even no's:"+evenSum);
            System.out.println("Sum of odd no's:"+oddSum);
        

    }
    
}
