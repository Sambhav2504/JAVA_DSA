import java.util.Scanner;

public class Main {

    // Method to print the matrix
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to multiply two matrices
    static void multiplyMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {

        // Check if matrix multiplication is possible
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible with the given dimensions.");
            return;
        }

        // Resultant matrix of size r1 x c2
        int[][] ans = new int[r1][c2];

        // Matrix multiplication logic
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix after multiplication:");
        printMatrix(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter " + r1 * c1 + " elements for the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input for the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter " + r2 * c2 + " elements for the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication
        multiplyMatrix(a, r1, c1, b, r2, c2);
    }
}
