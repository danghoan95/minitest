package Minitest;
import java.util.Scanner;
public class TaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size ;
        int[] arr;
        System.out.println("Nhập size");
        size =scanner.nextInt();
        arr =new int[size];

for(int i=0;i<arr.length;i++){
    arr[i]=scanner.nextInt();

}
        System.out.print("các phần tử mảng:");
        for(int i=0;i<arr.length;i++){
        System.out.print( arr[i] + " ");
        }
    }
}
