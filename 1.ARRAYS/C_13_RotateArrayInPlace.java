import java.util.Scanner;

public class C_13_RotateArrayInPlace {

    static void printarray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reversearr(int[] arr, int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }

    }

    static int[] rotatearr(int[] arr, int k){
        int n = arr.length;
        k=k%n;
        reversearr(arr,0,n-k-1);
        reversearr(arr,n-k,n-1);
        reversearr(arr,0,n-1);
        return arr;

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
        System.out.println("enter the steps by which you wish to rotate the array");
        int k = sc.nextInt();
        System.out.println("array before reversing");
        printarray(arr);
        System.out.println("array after reversing");
        rotatearr(arr,k);
        printarray(arr);
    }
}
