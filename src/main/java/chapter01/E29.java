package chapter01;

import java.util.Scanner;

// 29. Tìm ước số lẻ lớn nhất của số nguyên dương n. Ví dụ n = 100 ước lẻ lớn nhất của 100 là 25.
public class E29 {
    private static int oddDivisorMax(int n) {
        int max = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0 && i > max) {
                max = i;
            }
        }
        return max;
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

        int max = oddDivisorMax(n);
        System.out.println("Ước số lẻ lớn nhất của " + n + " là " + max);
    }
}