import java.sql.SQLOutput;
import java.util.Scanner;

public class C_2_AdditionOfMatrix {

    static void printmatrix(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    static void addmatrix(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("WRONG DIMENSIONS ENTERED");
            return;
        }

        int[][] sum = new int[r1][c1];
        for(int i =0;i<sum.length;i++){
            for(int j = 0;j<sum[i].length;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("ADDITION OF 2 MATRICES");
        printmatrix(sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows of 1 matrix");
        int r1 = sc.nextInt();
        System.out.println("enter the number of columns of 1 matrix");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("enter "+r1*c1+" elements");
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the number of rows of 2 matrix");
        int r2 = sc.nextInt();
        System.out.println("enter the number of columns of 2 matrix");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("enter "+r2*c2+" elements");
        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[i].length;j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("matrix 1 is");
        printmatrix(a);
        System.out.println("matrix 2 is");
        printmatrix(b);
        addmatrix(a,r1,c1,b,r2,c2);

    }
}
