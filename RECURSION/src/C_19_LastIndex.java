import java.util.Scanner;

public class C_19_LastIndex {

    static int lastIndex(int[] arr,int n,int x,int idx){
        if(idx==n){
            return -1;
        }
        int last = lastIndex(arr,n,x,idx+1);

        if(arr[idx] == x && last == -1){
            return idx;
        }
        return last;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value");
        int target = sc.nextInt();
        int ans = lastIndex(arr,n,target,0);
        System.out.println(ans);
    }
}
