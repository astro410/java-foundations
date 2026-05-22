package primeNO;

public class primeNo {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
            }
        }return isPrime;
}
    public static boolean isprimeOpt(int n){
        boolean isprimeOpt=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprimeOpt=false;
            }
        }return isprimeOpt;
    }
    public static void primeinRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
    }
    public static void main(String []args){
        //System.out.println(isPrime(9));
        //System.out.println(isprimeOpt(13));
        primeinRange(13);
    }
    
}
