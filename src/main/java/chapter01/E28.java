package chapter01;

import java.util.Scanner;

// 28. Cho số nguyên dương n. Tính tổng các ước số nhỏ hơn chính nó.
public class E28 {
    private static int divisorLessThanNSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
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

        int sum = divisorLessThanNSum(n);
        System.out.println("Tổng các ước của " + n + " nhỏ hơn " + n + " là " + sum);
    }
}