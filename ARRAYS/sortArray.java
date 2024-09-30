package ARRAYS;

import java.util.Scanner;

public class sortArray {

    static void printarray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortArray2(int[] arr){
        int left = 0, right =arr.length-1;

        while(left < right){
            if(arr[left]==2 && (arr[right]==1 || arr[right] == 0)){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==1 || arr[right]==0){
                left++;
            }
            if(arr[right]==2){
                right--;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sortArray2(arr);
        printarray(arr);
    }
}
