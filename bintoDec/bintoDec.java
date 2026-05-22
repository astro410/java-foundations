package bintoDec;

public class bintoDec {
    public static int binDec(int binNum){
        int pow=0;
        int Decimal=0;
        while(binNum>0){
        int lastDig=binNum%10;
        Decimal=Decimal+(lastDig*(int)(Math.pow(2,pow)));
        pow++;
        binNum=binNum/10;
    }return Decimal;
}
    public static int decBin(int decimal){
        int pow=0;
        int rem=0;
        int binNo=0;
        while(decimal>0){
            rem=decimal%2;
            binNo=binNo+(rem*(int)(Math.pow(10,pow)));
            pow++;
            decimal=decimal/2;
        }return binNo;

    }
    public static void main(String[]args){
        //System.out.println(binDec(1111));
        System.out.println(decBin(21));

    } 
    
}
