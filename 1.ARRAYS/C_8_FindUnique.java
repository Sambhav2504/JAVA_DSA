import java.sql.SQLOutput;
import java.util.Scanner;

public class C_8_FindUnique {
    static int uniquenumber(int[] arr){
        int n = arr.length;
        int ans = -1;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
                }
            }
        }
        for(int i = 0;i<n;i++){
            if(arr[i]>0){
                 ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int unique = uniquenumber(arr);
        System.out.println("the unique number is  "+unique);
    }
}
