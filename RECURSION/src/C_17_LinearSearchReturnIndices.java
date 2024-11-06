import java.util.Scanner;

public class C_17_LinearSearchReturnIndices {

    static void findElement(int[] arr,int x,int n,int idx){
        if(idx==n){
            return;
        }

        if(arr[idx]==x){
            System.out.print(idx+" ");
        }

        findElement(arr,x,n,idx+1);
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
        System.out.println("Enter target value");
        int target = sc.nextInt();

        findElement(arr,target,n,0);
    }
}
