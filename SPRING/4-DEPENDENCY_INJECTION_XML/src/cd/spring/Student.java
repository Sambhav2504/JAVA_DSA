package cd.spring;

public class Student {
    private String name;
    private int roll;
    private Address address;

//    public void setAddress(Address address) { //SETTER METHOD
//        this.address = address;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setRoll(int roll) {
//        this.roll = roll;
//    }
    public Student(String name,int roll,Address address){
        this.name = name;
        this.roll = roll;
        this.address = address;
    }
    public void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(address);
    }
}
