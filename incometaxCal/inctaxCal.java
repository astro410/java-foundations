import java.util.Scanner;
public class inctaxCal {
    public static void main(String[]args){

        int taxAmt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income:");
        int inc=sc.nextInt();
        if(inc<500000){
            System.out.println("No tax");
            taxAmt=0;
        }else if(inc>=500000 && inc<1000000){
            System.out.println("20% tax");
            taxAmt=(int)(inc*(0.2));
           
        }else{
             System.out.println("30% tax");
             taxAmt=(int)(inc*(0.3));
             
        } System.out.println("Your tax amt is:" + taxAmt);

    }
    
}
