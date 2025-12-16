package chapter01;

import java.util.Scanner;

// Cho số nguyên dương n. Kiểm tra số dương n có phải là số hoàn thiện hay không?
public class E30 {
    private static boolean isPerfect(int n) {
        int exclusiveDivisorSum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                exclusiveDivisorSum += i;
            }
        }
        return exclusiveDivisorSum == n;
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

        System.out.println(isPerfect(n)
                ? "Số " + n + " là số hoàn thiện"
                : "Số " + n + " không phải là số hoàn thiện"
        );
    }
}