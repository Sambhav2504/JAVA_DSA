import java.util.Scanner;

public class C_9_SecondLargest {

    static int findmax(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static int Findsecondmax(int[] arr){
        int max = findmax(arr);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = findmax(arr);
        return secondmax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter  "+n+" elemnts");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int ans = Findsecondmax(arr);
        System.out.println("the second maximum element in the array is" +ans);

    }
}
