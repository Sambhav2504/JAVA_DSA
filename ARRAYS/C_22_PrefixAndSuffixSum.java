import java.util.Scanner;

public class C_22_PrefixAndSuffixSum {


    static int findArraySum(int[] arr){
        int totalSum=0;
        for(int i = 0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);

        int prefixsum = 0;
        for(int i = 0;i<arr.length;i++){
            prefixsum+=arr[i];
            int suffixsum = totalSum-prefixsum;
            if(prefixsum == suffixsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];  // One-based indexing, so size is n+1

        System.out.println("Enter " + n + " elements:");
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("is partition possible "+equalSumPartition(arr));

}
 }
