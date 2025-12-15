package chapter01;

import java.util.Scanner;

// 15. Tính S(n) = 1 + 1/3 + 1/6 + ... + 1/(1+2+3+...+n)
public class E15 {
    private static int sumSeq(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }

    private static double sum(int n) {
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / sumSeq(i);
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

                if (n <= 0) {
                    System.out.println("Số n phải là số nguyên dương");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Số n phải là số nguyên dương");
            }
        }
        scanner.close();

        double s = sum(n);
        System.out.println("S = " + s);
    }
}