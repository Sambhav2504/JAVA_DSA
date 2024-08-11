import java.util.Arrays;
import java.util.Scanner;

public class C_5_SmallestAndLargest {

    static int[] smallestandlargest(int[] arr){
        Arrays.sort(arr);
        int[] ans ={arr[0],arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter  "+n+" elements in array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = smallestandlargest(arr);
        System.out.println("Smallest element "+ans[0]);
        System.out.println("Largest element "+ans[1]);
    }
}
