package chapter01;

import java.util.Scanner;

// 17. Tính S(n) = x + (x^2)/2 + (x^3)/6 + ... + (x^n)/(n!)
public class E17 {
    private static long factorial(int n) {
        long t = 1L;
        for (int i = 1; i <= n; i++) {
            t *= i;
        }
        return t;
    }

    private static double sum(double x, int n) {
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            s += Math.pow(x, i) / factorial(i);
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        int n;
        while (true) {
            try {
                System.out.print("x = ");
                x = Double.parseDouble(scanner.nextLine());
                System.out.print("n = ");
                n = Integer.parseInt(scanner.nextLine());

                if (n <= 0) {
                    System.out.println("Số n phải là số nguyên dương");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Đầu vào không hợp lệ");
            }
        }
        scanner.close();

        double s = sum(x, n);
        System.out.println("S = " + s);
    }
}