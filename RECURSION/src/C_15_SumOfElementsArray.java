import java.util.Scanner;

public class C_15_SumOfElementsArray {


    static int sumOfElements(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }

        return arr[idx] + sumOfElements(arr,idx+1);


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
        System.out.println(sumOfElements(arr,0));
    }
}
