import java.util.Scanner;

public class C_14_FrequencyArray {
    //TO CHECK WHETHER A GIVEN NUMBER IS PRESENT OR NOT IN THE ARRAY ON FREQUENCIES
    static int[] makefrequencyarray(int[] arr){
        int n = arr.length;
        int[] freq = new int[100005];
        for(int i = 0;i<arr.length;i++){
             freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] freq = makefrequencyarray(arr);

        System.out.println("enter the number of queries");
        int q = sc.nextInt();

        while(q>0){
            System.out.println("enter the number to be searched");
            int x = sc.nextInt();

            if(freq[x] >0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            q--;
        }
    }
}
