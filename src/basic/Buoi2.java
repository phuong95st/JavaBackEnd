package basic;

import java.util.Scanner;

public class Buoi2 {
    public static void baiTapBuoi2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        int b=0;
        do {
            System.out.println("Nhap b: ");
            b = scanner.nextInt();
            if(b==0){
                System.out.println("Error");
            }
        }while(b==0);

        System.out.println("Tong 2 so la: " + (a+b));
        System.out.println("Phan nguyen 2 so: " + (a/b));

    }
    public static void main(String[] args) {
        Buoi2.baiTapBuoi2();
    }
}
