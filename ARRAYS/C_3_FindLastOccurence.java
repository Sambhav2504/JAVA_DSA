import java.util.Scanner;

public class C_3_FindLastOccurence {
    //TO FIND THE LAST OCCURENCE OF AN ELEMENT IN ARRAY

    static void lastoccurence(int [] arr,int x){
         int lastindex = -1;
         for(int i =0;i<arr.length;i++){
             if(arr[i]==x){
                 lastindex= i;
             }
         }
         if(lastindex == -1){
             System.out.println("element is not present in the array");
         }
         else{
             System.out.println("last occurence is  " +lastindex);
         }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements in array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element whose last occurence you want to find");
        int x = sc.nextInt();
        lastoccurence(arr,x);

    }
}
