package cd.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Student {
    @Value("Sambhav")
    private String name;
    @Value("23")
    private int roll;
    @Value("102.3f")
    private float marks;

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);
    }
}
