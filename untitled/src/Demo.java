import java.awt.*;

public class Demo {
    private String name;
    private int age;
    private String nameClass;

    public Demo() {
        this.name="Nguyen van A";
        this.age = 18;
        this.nameClass = "I1";
    }
    public Demo(String name, int age, String nameClass) {
        this.name = name;
        this.age = age;
        this.nameClass = nameClass;
    }
    public void height (double height) {
        if(height > 1.7 ) {
            System.out.println("Good");
        } else {
            System.out.println("Nomal");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return ("Name is " + this.name + ", Age " + this.age + "Class : " + this.nameClass);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo demo1 = new Demo("Nguyeen A", 20, "I1");
        demo1.height(1.8);
        demo.height(1.6);
    }
}
