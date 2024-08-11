import java.util.Scanner;

public class C_21_SumOfValuesInRange {

    static void printarray(int[] arr){
        for(int i = 1; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void calculatePrefixSumInPlace(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] + arr[i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];  // One-based indexing, so size is n+1

        System.out.println("Enter " + n + " elements:");
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        calculatePrefixSumInPlace(arr);

        System.out.println("Enter the number of queries you want:");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter range numbers (l and r):");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = arr[r] - arr[l - 1];
            System.out.println("SUM = " + ans);
        }

        sc.close();
    }
}
