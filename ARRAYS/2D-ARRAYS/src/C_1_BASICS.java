import java.util.Scanner;

public class C_1_BASICS {

    static void printarray(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //int[][] arr = new int[2][3];


    public static void main(String[] args) {

//        int[][] arr = {{1,2,3},
//                {4,5,6},
//                {7,8,9}};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int r = sc.nextInt();
        System.out.println("enter number of columns");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("enter "+r*c+" elements");
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        printarray(arr);
    }
}
