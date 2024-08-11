import java.util.Scanner;

public class C_11_ReverseAnArrayInPlace {
    //TO REVERSE AN ARRAY IN PLACE

    static void printarray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 }
 static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
 }
    static void revarr(int[] arr){
        int i = 0; int j = arr.length-1;
                while(i<j){
                    swap(arr,i,j);
                    i++;
                    j--;
                }
            }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter  "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array before reversing");
        printarray(arr);
        System.out.println("array after reversing");
        revarr(arr);
        printarray(arr);

    }
   }
