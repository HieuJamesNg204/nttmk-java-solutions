package chapter01;

import java.util.Scanner;

// 25. Tính tổng tất cả “ước số chẵn” của số nguyên dương n
public class E25 {
    private static int evenDivisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
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

        int sum = evenDivisorSum(n);
        System.out.println("Tổng các ước số chẵn của " + n + " là " + sum);
    }
}