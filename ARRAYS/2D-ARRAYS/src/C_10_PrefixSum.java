import java.util.Scanner;

public class C_10_PrefixSum {

    static void makePrefixMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        // row-wise prefix sum
        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
        // column-wise prefix sum
        for(int j = 0; j < c; j++){
            for(int i = 1; i < r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    static int calculateSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;

        makePrefixMatrix(matrix);

        for(int i = l1; i <= l2; i++){
            if(r1 > 0){
                sum += matrix[i][r2] - matrix[i][r1-1];
            } else {
                sum += matrix[i][r2];
            }
        }

        return sum;
    }

    static int calculateSum2(int[][] matrix, int l1, int r1, int l2, int r2){
        makePrefixMatrix(matrix);
        int sum, up = 0, left = 0, upleft = 0;

        sum = matrix[l2][r2];
        if(l1 > 0) {
            up = matrix[l1-1][r2];
        }
        if(r1 > 0) {
            left = matrix[l2][r1-1];
        }
        if(l1 > 0 && r1 > 0) {
            upleft = matrix[l1-1][r1-1];
        }

        return sum - up - left + upleft;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter " + r * c + " elements:");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter 4 coordinates (l1, r1, l2, r2):");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        if (l1 < 0 || l1 >= r || l2 < 0 || l2 >= r || r1 < 0 || r1 >= c || r2 < 0 || r2 >= c || l1 > l2 || r1 > r2) {
            System.out.println("Invalid coordinates");
        } else {
            int ans = calculateSum(matrix, l1, r1, l2, r2);
            System.out.println("The sum of the submatrix using calculateSum is: " + ans);

            int ans2 = calculateSum2(matrix, l1, r1, l2, r2);
            System.out.println("The sum of the submatrix using calculateSum2 is: " + ans2);
        }
    }
}
