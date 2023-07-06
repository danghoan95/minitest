package Minitest;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int n;
        Scanner scanner =new Scanner(System.in);
        n=scanner.nextInt();
        int number = 2;
        while (number < n) {
            boolean flag = false;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println(number);
            }
            number++;

        }
    }
}


