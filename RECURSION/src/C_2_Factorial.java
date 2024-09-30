import java.util.Scanner;

public class C_2_Factorial {

    static int findFactorial(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //subProblem and recursive work
        return n * findFactorial(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for finding factorial");
        int n = sc.nextInt();
        int ans = findFactorial(n);
        System.out.println("Factorial of "+n+" is:"+ans);
    }
}
