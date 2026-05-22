package binCoeff;

public class binCoeff {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }return f;

    }
    public static int binCoeffecient(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int nmr=factorial(n-r);
        int binCoeffecient=fact_n/(fact_r*nmr); 

        return binCoeffecient;
    }
    public static void main(String[]args){
       // System.out.println(factorial(8));
       System.out.println(binCoeffecient(8, 6));

    }
    
}
