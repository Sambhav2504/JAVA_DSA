import java.util.Scanner;

public class C_1_FindElement {
    //TO FIND WHETHER A GIVEN ELEMENT IS PRESENT IN AN ARRAY OR NOT AND IF YES THEN ON WHICH POSITION

    static void findelement(int[] arr,int x){
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("element is present at  "+i);
                ans = i;
                break;
            }
        }
        if(ans == -1){
            System.out.println("element is not present in the array");
        }
        else{
            System.out.println("element is present at " +ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter  " +n+" elements in array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number you want to find");
        int x = sc.nextInt();
        findelement(arr,x);
    }
}
