import java.util.Scanner;

public class C_1_PrintNumbersUsingRecursion {

    static void printIncreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    static void printDecreasing(int n){ //5 4 3 2 1
        //base case
        if(n == 1){
            System.out.println(1);
            return;
        }
         //self work
        System.out.println(n);

        //recursive work
        printDecreasing(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
       // printIncreasing(n);
        printDecreasing(n);
    }

}
