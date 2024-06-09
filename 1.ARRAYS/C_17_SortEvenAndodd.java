import java.util.Scanner;

public class C_17_SortEvenAndodd {

    static void printarray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortevenandodd(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if((arr[left]%2!=0) && (arr[right]%2==0)){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
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
        sortevenandodd(arr);
        System.out.println("array after sorting");
        printarray(arr);
    }
}
