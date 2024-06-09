import java.util.Scanner;

public class C_20_PrefixSumInPlace {

    static int[] prefixsum(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        return arr;
    }

    static void printarray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("prefix sum array");
        int[] ans = prefixsum(arr);
        printarray(arr);

    }

}
