import java.util.Scanner;

public class C_13_PrintElementsOfArrayRecursively {

    static void printElements(int[] arr,int idx){
        int n = arr.length;
        if(n==idx){
            return;
        }
        System.out.print(arr[idx]+" ");
        printElements(arr,idx+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        printElements(arr,0);
    }


}
