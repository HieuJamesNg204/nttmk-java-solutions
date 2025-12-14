package chapter01;

import java.util.Scanner;

// 10. Tính T(x, n) = x^n
public class E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double n;
        while (true) {
            try {
                System.out.print("x = ");
                x = Double.parseDouble(scanner.nextLine());
                System.out.print("n = ");
                n = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Đầu vào không hợp lệ!");
            }
        }
        scanner.close();

        double t = Math.pow(x, n);
        System.out.println("T = " + t);
    }
}