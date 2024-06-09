import java.util.Scanner;

import static java.lang.Math.abs;

public class C_18_SortArrayOfNumbers {

    static void printarray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reversearr(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] sortnumberarray(int[] arr){
        int left = 0;
        int n = arr.length;
        int right = n-1;
        int[] ans = new int[n];
        int k = 0;

        while(left<=right){

            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++] = arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }

        }
        return ans;


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
        int[] ans = sortnumberarray(arr);
        System.out.println("array after sorting");
        reversearr(ans);
        printarray(ans);
    }
}
