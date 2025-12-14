package chapter01;

import java.util.Scanner;

// 09. Tính T(n) = n!
public class E09 {
    private static long factorial(int n) {
        long t = 1L;
        for (int i = 1; i <= n; i++) {
            t *= i;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.print("n = ");
                n = Integer.parseInt(scanner.nextLine());

                if (n < 0) {
                    System.out.println("Số n phải là số nguyên không âm");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Số n phải là số nguyên không âm");
            }
        }
        scanner.close();

        long t = factorial(n);
        System.out.println("T = " + t);
    }
}