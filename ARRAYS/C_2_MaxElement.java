import java.util.Scanner;

public class C_2_MaxElement {
    //TO FIND THE MAXIMUM ELEMENT FROM THE ARRAY
    static int maxarr(int [] arr){
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements in array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the max element of the array is  "+maxarr(arr));
    }

}

