import java.util.Scanner;

public class C_14_MaxOfArray {

    static int max(int[] arr,int a){
        if(a==arr.length-1){
            return arr[a];
        }
        int smallAns = max(arr,a+1);

        return Math.max(smallAns,arr[a]);
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
        System.out.println(max(arr,0));
    }
}
