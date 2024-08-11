import java.util.Scanner;

public class C_15_SortZeroesandOnes {

    static void printarray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sortzeroesandones(int [] arr){
        int n = arr.length;
        int zeroes = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i = 0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array before sorting");
        printarray(arr);
        sortzeroesandones(arr);
        System.out.println("array after sorting");
        printarray(arr);
    }

}
