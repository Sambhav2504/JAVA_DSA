import java.util.Scanner;

public class C_22_RemoveOccurrence {

    static String removeOcuurrence(String s){
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != 'a'){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

    //USING RECURISON
    static String removeOccurenceRecurison(String s,int idx){
        if(idx==s.length()){
            return " ";
        }
         String smallAns = removeOccurenceRecurison(s,idx+1);
         char currChar = s.charAt(idx);

         if(currChar != 'a'){
             return currChar + smallAns;
         }else{
             return smallAns;
         }

    }

    static String removeOccurenceRecursion2(String s){
        //basecase
        if(s.length() == 0) return " ";
        //small work(using recursion)
        String smallAns = removeOccurenceRecursion2(s.substring(1));
        
        // Self Work
         char currChar = s.charAt(0);
         
         if(currChar != 'a'){
             return currChar+smallAns;
         }
         else{
             return smallAns;
         }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        String ans = removeOccurenceRecursion2(s);
        System.out.println(ans);
    }
}
