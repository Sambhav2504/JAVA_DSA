import java.util.Scanner;

public class C_3_FibonacciNumber {

    static int findfib(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }
        //subProblem
//        int prev = findfib(n-1);
//        int prevPrev = findfib(n-2);
        //self-work
        return findfib(n-1) + findfib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term you want to find");
        int n = sc.nextInt();
        System.out.println("The term is "+findfib(n));
    }
}
