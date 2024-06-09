import java.util.Scanner;

public class C_19_PrefixSum {

    static void printarray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] prefixsumarr(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        int j = 0;

        pref[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            pref[i] = pref[i-1]+ arr[i];
        }
        return pref;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array before sorting");
        printarray(arr);
        System.out.println("array after sorting");
        int[] pref = prefixsumarr(arr);
        printarray(pref);
    }
}
