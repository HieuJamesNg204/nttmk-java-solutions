package chapter01;

import java.util.Scanner;

// 11. Tính S(n) = 1 + 2 + 6 + ... + n!
public class E11 {
    private static long factorial(int n) {
        long t = 1;
        for (int i = 1; i <= n; i++) {
            t *= i;
        }
        return t;
    }

    private static long sum(int n) {
        long s = 0;
        for (int i = 1; i <= n; i++) {
            s += factorial(i);
        }
        return s;
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

        long s = sum(n);
        System.out.println("S = " + s);
    }
}