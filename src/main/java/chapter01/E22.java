package chapter01;

import java.util.Scanner;

// 22. Tính tích tất cả “ước số” của số nguyên dương n.
public class E22 {
    private static long divisorProduct(int n) {
        long p = 1L;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                p *= i;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.print("n = ");
                n = Integer.parseInt(scanner.nextLine());

                if (n <= 0) {
                    System.out.println("Số n phải là số nguyên dương.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Số n phải là số nguyên dương.");
            }
        }
        scanner.close();

        long product = divisorProduct(n);
        System.out.println("Tích các ước của " + n + " là " + product);
    }
}