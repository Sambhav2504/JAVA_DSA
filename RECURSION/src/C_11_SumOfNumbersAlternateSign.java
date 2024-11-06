import java.util.Scanner;

public class C_11_SumOfNumbersAlternateSign {

    static int sumOfNumber(int n){
        if(n==0){
            return 0;
        }

        if(n%2==0){
            return sumOfNumber(n-1) - n;
        }
        else return sumOfNumber(n-1) + n;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ans = sumOfNumber(n);
        System.out.println(ans);
    }

}
