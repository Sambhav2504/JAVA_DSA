import java.util.Scanner;

public class C_5_SumOfDigits {

    static int sumOfDigits(int n){
        n = Math.abs(n); //to handle negative numbers
        if(n<10){
            return n;
        }
        return sumOfDigits(n/10) + n%10;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ans = sumOfDigits(n);
        System.out.println(ans);
    }
}
