import java.util.Scanner;

public class C_6_CountOfDigits {
      static int countOfDigits(int n){
          if(n<10){
              return 1;
          }
          return 1 + countOfDigits(n/10);
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int ans = countOfDigits(n);
        System.out.println(ans);
    }
}
