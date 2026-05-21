package calculator;
import java.util.Scanner;
public class calc {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter the operator:");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':System.out.println(a+b); //addition
                     break;
            case '-':System.out.println(a-b); //subraction
                      break;
            case '*':System.out.println(a*b); //multiplication
                      break;
            case '/':if(b==0) {
                System.out.println("Division not possible");
            }else{
                System.out.println(a/b); //division
            }
                    break;
            case '%':System.out.println(a%b); //modulous
                      break;

            default:System.out.println("Enter correct operator");
        }



    }
    
}
