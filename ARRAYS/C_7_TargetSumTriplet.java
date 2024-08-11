import java.util.Scanner;

public class C_7_TargetSumTriplet {

    static int tripletsum(int[] arr , int x){
        int target = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        target++;
                    }
                }
            }
        }
        return target;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements in array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the target value");
        int x = sc.nextInt();
        int ans = tripletsum(arr,x);
        System.out.println("the number of triplets  "+ans);
    }

}
