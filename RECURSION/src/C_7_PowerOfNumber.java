import java.util.Scanner;

public class C_7_PowerOfNumber {

    static int power(int a,int b){

        if(b==0){
            return 1;
        }
        return power(a,b-1) * a;
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
