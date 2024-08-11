package ARRAYLISTS;
import java.util.ArrayList;
public class C_1_Basic {


    public static void main(String[] args) {
    Integer in = Integer.valueOf(5);
    System.out.println(in);
    Float f = Float.valueOf(3.5f);
        System.out.println(f);
    ArrayList<Integer> l1 = new ArrayList<>();
    //Add new element
    l1.add(5);
    l1.add(6);
    l1.add(7);
    l1.add(8);
    l1.add(9);

    //get an element at index i
        System.out.println(l1.get(3));

        //Print elements of Arraylist using For loop
        for(int i = 0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
        //Print all the elements directly
        System.out.println(l1);

        //add element at index i

        l1.add(1,2);
        System.out.println(l1);

        //modify an element at index i
        l1.set(1,100);
        System.out.println(l1);
        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element without providing index
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        //check if an element exists in ArrayList
        Boolean ans = l1.contains(Integer.valueOf(22));
        System.out.println(ans);
        //if you dont specify class inside brackets, you can keep any datatype
        ArrayList l2 = new ArrayList();
        l2.add("pqres");
        l2.add(1);
        l2.add(true);
        System.out.println(l2);


    }
}