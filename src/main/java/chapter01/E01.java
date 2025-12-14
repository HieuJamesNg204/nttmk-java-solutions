package chapter01;

import java.util.Scanner;

// 01. Tính S(n) = 1 + 2 + 3 + ... + n
public class E01 {
    private static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
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

        int s = sum(n);
        System.out.println("S = " + s);
    }
}