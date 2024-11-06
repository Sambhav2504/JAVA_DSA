import java.util.Scanner;

public class C_8_PowerOfNumberAlternate {

    static int power(int a,int b){
        if(b==0){
            return 1;
        }
        int smallPow = power(a,b/2);
        if(b%2==0){
            return smallPow * smallPow;
        }
        else{
            return a * smallPow * smallPow;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int p = sc.nextInt();
        System.out.println("Enter the number");
        int q = sc.nextInt();
        int ans = power(p,q);
        System.out.println(ans);
    }
}
