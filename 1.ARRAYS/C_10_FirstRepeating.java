import java.util.Scanner;

public class C_10_FirstRepeating {

    static int firstRepeating(int[] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i]; //RETURN STATEMENT STOPS THE LOOP AND COMES OUT
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter  "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
       int ans =  firstRepeating(arr);
        System.out.println("first repeating number is "+ans);
    }
}
