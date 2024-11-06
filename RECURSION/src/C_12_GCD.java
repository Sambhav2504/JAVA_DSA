import java.util.Scanner;

public class C_12_GCD {
    static int Igcd(int x,int y){

        while(x%y != 0){
            int rem = x%y;
            x=y;
            y=rem;
        }
        return y;
    }

    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number");
        int x = sc.nextInt();
        System.out.println("Enter 2 number");
        int y = sc.nextInt();
        int ans =  gcd(x,y);
        System.out.println(ans);
    }
}
