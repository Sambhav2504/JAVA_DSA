import java.util.Scanner;

public class C_4_FibonacciSeries {

    static void printFibonacci(int n){
       for(int i = 0;i<n;i++){
           System.out.print(fibonacci(i)+" ");
       }
    }
    static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        printFibonacci(n);
    }
}
