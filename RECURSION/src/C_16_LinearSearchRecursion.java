import java.util.Scanner;

public class C_16_LinearSearchRecursion {

    static boolean findElement(int[] arr,int x,int idx){
        if(idx==arr.length){
            return false;
        }

        if(arr[idx]==x){
            return true;
        }
        else{
            return findElement(arr,x,idx+1);
        }
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

        boolean ans = findElement(arr,target,0);
        System.out.println(ans);
    }


}
