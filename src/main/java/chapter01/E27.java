package chapter01;

import java.util.Scanner;

// 27. Đếm số lượng “ước số chẵn” của số nguyên dương n.
public class E27 {
    private static int evenDivisorCount(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                count++;
            }
        }
        return count;
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

        int count = evenDivisorCount(n);
        System.out.println("Số " + n + " có tất cả " + count + " ước số chẵn");
    }
}