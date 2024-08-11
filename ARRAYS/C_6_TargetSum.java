import java.sql.SQLOutput;
import java.util.Scanner;

public class C_6_TargetSum {
    static int targetSum(int[] arr,int x){
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++)
                if(arr[i]+arr[j]==x){
                    ans++;
                }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter  "+n+" elements in array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target sum number");
        int x = sc.nextInt();
        int ans =  targetSum(arr,x);
        System.out.println("total pairs"+ans);

    }
}

