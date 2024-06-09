import java.util.Scanner;

public class C_6_RotateBy90 {

    static void printmatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void TransposeInPlace(int[][] a,int r1,int c1){

        for(int i = 0;i<a.length;i++){
            for(int j = i;j<a[i].length;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i]  = temp;
            }
        }




    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }

    static void reversearray(int[] arr){
        int i = 0, j = arr.length-1;

        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotateby90(int[][] a,int r){
         TransposeInPlace(a,r,r);

         for(int i = 0;i<a.length;i++){
             reversearray(a[i]);
         }
        System.out.println("rotated array is");
         printmatrix(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows of 1 matrix");
        int r1 = sc.nextInt();
        System.out.println("enter the number of columns of 1 matrix");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("enter " + r1 * c1 + " elements");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("original matrix is");
        printmatrix(a);

        rotateby90(a,r1);



        }}
