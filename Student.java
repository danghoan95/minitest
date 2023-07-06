package Minitest;

public class Student {
   public String name, className;
   public int age;

    public Student(String name, String className, int age){
        this.name=name;
        this.age=age;
        this.className =className;
    }
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
