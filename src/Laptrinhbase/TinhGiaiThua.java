package Laptrinhbase;

import java.util.Scanner;

public class TinhGiaiThua {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap a = ");
        int a = scanner.nextInt();
        System.out.println("Giai thua cua " + a + " la: "
                + tinhGiaithua(a));
    }
    public static long tinhGiaithua(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }
}
