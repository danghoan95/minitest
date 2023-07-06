package Minitest;

public class Sum {
    public static void main(String[] args) {
        int sum =0;
        int[] a ={1,2,3,4,5,6,7,8,9,10};
        int max =a[0];
        for(int i=0;i<a.length;i++){
            sum += a[i];
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("Sum :" + sum);
        System.out.println("max :" + max);
    }
}
