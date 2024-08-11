import java.util.Scanner;

public class C_21_Missing_Number {

    static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        int sumOfNum = 0;
        for (int i = 1; i <= n; i++) {
            sumOfNum += i;
        }

        int sumOfArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArray += arr[i];
        }

        return sumOfNum - sumOfArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = missingNumber(arr);
        System.out.println("Missing Number: " + ans);
        sc.close();
    }
}
