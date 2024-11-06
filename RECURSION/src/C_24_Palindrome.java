import java.util.Scanner;

public class C_24_Palindrome {

    static String reverseString(String s,int idx){
        //base case
        if(idx == s.length()){
            return "";
        }
        //recursive work
        return reverseString(s,idx+1) + s.charAt(idx);
    }
    //Method 2
    static boolean Palindrome(String s,int l,int r){
        if(l>=r){
            return true;
        }
        return (s.charAt(l)==s.charAt(r) && Palindrome(s,l+1,r-1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        String ans = reverseString(s,0);
        System.out.println(ans);

        if(s.equals(ans)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        System.out.println(Palindrome(s,0,s.length()-1));
    }

}
