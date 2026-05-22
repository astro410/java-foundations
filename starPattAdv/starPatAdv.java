package starPattAdv;

public class starPatAdv {
    public static void hollow_rect(int totRows,int totCols){
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totCols;j++){
                if(i==1||i==totRows||j==1||j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1;i<=n;i++){             //row_no
            for (int j=1;j<=n-i;j++){      //spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");    //stars
            }System.out.println();
        }
    }
    public static void inverted_half_pyramid_num(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j + " ");
            }System.out.println();
        }
    }
    public static void floyd_Triangle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }System.out.println();
        }
    }
    public static void zero_one_Triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }System.out.println();
        }

    }
    public static void main(String[]args){
        //hollow_rect(4, 5);
        //inverted_rotated_half_pyramid(5);
        //inverted_half_pyramid_num(5);
        //floyd_Triangle(5);
        zero_one_Triangle(5);
    }
    
}
