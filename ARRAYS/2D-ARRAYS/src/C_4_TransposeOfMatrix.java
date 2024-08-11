import java.util.Scanner;

public class C_4_TransposeOfMatrix {

    static void printmatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] findtranspose(int[][] a,int r,int c){
        int[][] ans = new int[c][r];

        for(int i = 0;i<ans.length;i++){
            for(int j = 0;j<ans[i].length;j++){
                ans[i][j] = a[j][i];
            }
        }
        return ans;
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

       int[][] ans = findtranspose(a,r1,c1);
        System.out.println("transpose of matrix is");
        printmatrix(ans);

    }
}

