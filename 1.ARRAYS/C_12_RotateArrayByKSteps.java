import java.util.Scanner;

public class C_12_RotateArrayByKSteps {

    static void printarray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int[] rotatearr(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j = 0;

        for(int i =n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i = 0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
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
        System.out.println("enter the steps by which you want to rotate the array");
        int k = sc.nextInt();
        System.out.println("original array");
        printarray(arr);
        System.out.println("array after rotating");
        int[] ans = rotatearr(arr,k);
        printarray(ans);
    }
}
