import java.util.Scanner;

public class C_23_ReverseString {


    static String reverseString(String s,int idx){
        //base case
        if(idx == s.length()){
            return "";
        }
        //recursive work
        return reverseString(s,idx+1) + s.charAt(idx);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        String ans = reverseString(s,0);
        System.out.println(ans);
    }
}
