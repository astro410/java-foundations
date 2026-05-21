package starPatterns1;

public class pattern1 {
    public static void star(){
        for (int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void invertedStar(){
        int n=4;
        for (int line=1;line<=4;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void halfPyramid(){
        for (int line=1;line<=4;line++){
            for(int num=1;num<=line;num++){
                System.out.print(num);
            }System.out.println();
        }
    }
    public static void charPattern(){
        char ch='A';
        for (int line=1;line<=4;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }System.out.println();
        }
    }
    
    public static void main(String[]args){
        //star();
        //invertedStar();
        //halfPyramid();
        charPattern();
    }
    
}
