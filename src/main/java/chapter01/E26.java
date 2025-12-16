package chapter01;

import java.util.Scanner;

// 26. Tính tích tất cả “ước số lẻ” của số nguyên dương n.
public class E26 {
    private static long oddDivisorProduct(int n) {
        long product = 1L;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                product *= i;
            }
        }
        return product;
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

        long product = oddDivisorProduct(n);
        System.out.println("Tích các ước số lẻ của " + n + " là " + product);
    }
}