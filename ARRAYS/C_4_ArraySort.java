import java.util.Scanner;

public class C_4_ArraySort {
    //TO CHECK IF ARRAY IS SORTED OR NOT
    static boolean sorted(int [] arr){
        boolean check = true;
        for(int i = 1;i<arr.length;i++){
            if(arr[i-1] > arr[i]){
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements in array");
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sorted(arr));
    }
}
