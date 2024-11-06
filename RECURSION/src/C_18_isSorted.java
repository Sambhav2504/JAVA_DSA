import java.util.Scanner;

public class C_18_isSorted {

    static boolean isSorted(int[] arr,int n,int idx){
        if(idx==n-1){
            return true;
        }
        if(arr[idx]>arr[idx+1]){
            return false;
        }

        return isSorted(arr,n,idx+1);
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
        boolean ans = isSorted(arr,n,0);
        System.out.println(ans);
    }
}
