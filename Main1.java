package Minitest;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String name =scanner.nextLine();
        String classname =scanner.nextLine();
        int age =scanner.nextInt();
        Student student =new Student( name,classname,age);
        System.out.println(student.name +student.className+student.age);
    }
}
