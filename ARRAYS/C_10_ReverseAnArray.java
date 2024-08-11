import java.util.Scanner;

public class C_10_ReverseAnArray {
    //SWAPPING AN ARRAY BY USING ANOTHER ARRAY

    static void printarray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] revarr(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-1;i>=0;i--){
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter  "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("original array before reversing");
        printarray(arr);
        System.out.println("array after reversing");
        int[] ans = revarr(arr);
        printarray(ans);

    }
}
