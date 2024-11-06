package OOPS;

public class C_1_Intro {
   public static class Student{
        int rollno;
        float marks=100f;
        String name;

        public Student(int rollno,float marks,String name){
            this.rollno = rollno;
            this.marks = marks;
            this.name = name;
        }
        void greeting(){
            System.out.println("Hello! I am "+ this.name+"!  ");
        }
        //Constructor Chaining 
        public Student(){
            this (23,98.5f,"Raghav");
        }
    }

    public static void main(String[] args) {
       //initializing object
//        Student s1 = new Student();
//        s1.name = "Raghav";
//        s1.rollno = 15;
//        s1.marks = 90;
//        System.out.println(s1.name);
//        System.out.println(s1.rollno);
//        System.out.println(s1.marks);
        //Initializing object using Constructor
        Student s2 = new Student(21,98.5f,"Sambhav");
        System.out.println(s2.name);
        s2.greeting();
    }
}
