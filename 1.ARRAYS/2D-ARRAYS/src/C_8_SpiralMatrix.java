import java.util.Scanner;

public class C_8_SpiralMatrix {

    static void printMatrix(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void spiralMatrix(int[][] a,int r,int c){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElements = 0;
        while(totalElements<r*c){

            //1)topRow(print) -> leftCol to rightCol
            for(int j = leftCol;j<=rightCol && totalElements<r*c;j++){
                System.out.print(a[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
           //2)rightCol(print) -> topRow to bottomRow
            for(int i = topRow;i<=bottomRow && totalElements<r*c;i++){
                System.out.print(a[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
            //3)bottomRow(print) -> rightCol to leftCol
            for(int j = rightCol;j>=leftCol && totalElements<r*c;j--){
                System.out.print(a[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
           // 4)leftCol(print) -> bottomRow to topRow
            for(int i =bottomRow;i>=topRow && totalElements<r*c;i--){
                System.out.print(a[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;

        }

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
        printMatrix(a);

        System.out.println("elements in spiral order");
        spiralMatrix(a,r1,c1);
}

}
