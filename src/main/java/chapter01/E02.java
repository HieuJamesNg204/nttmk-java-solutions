package chapter01;

import java.util.Scanner;

// 02. Tính S(n) = 1 + 4 + 9 … + n^2
public class E02 {
    private static long sum(int n) {
        long sum = 0L;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
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

        long s = sum(n);
        System.out.println("S = " + s);
    }
}