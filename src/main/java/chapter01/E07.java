package chapter01;

import java.util.Scanner;

// 07. Tính S(n) = 1/2 + 2/3 + 3/4 + ... + n/(n+1)
public class E07 {
    private static double sum(int n) {
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            s += i / (i + 1.0);
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