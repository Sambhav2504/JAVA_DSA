import java.util.Scanner;

public class C_9_KMultiples {

    static void multiples(int a,int b){
        if(b==1){
            System.out.print(a+" ");
            return;
        }
        multiples(a,b-1);
        System.out.print(a*b+" ");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int p = sc.nextInt();
        System.out.println("Enter the number of multiples");
        int q = sc.nextInt();
        multiples(p,q);
    }
}
