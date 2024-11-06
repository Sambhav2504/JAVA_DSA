import java.util.ArrayList;
import java.util.Scanner;

public class C_20_ReturnIndicesArrayList {

    static ArrayList<Integer> findElement(int[] arr,int x,int n,int idx){

        ArrayList<Integer> ans = new ArrayList<>();
        if(idx==n){
            return ans;
        }
        if(arr[idx]==x){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = findElement(arr,x,n,idx+1);
        ans.addAll(smallAns);
        return ans;
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

        ArrayList<Integer> ans = findElement(arr,target,n,0);

        for(Integer i :ans){
            System.out.print(i+" ");
        }
    }
}
