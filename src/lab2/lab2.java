package lab2;

import java.util.Scanner;

public class lab2 {
    public static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        int a[] = new int[0];
        int n, k, x;
        System.out.print("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Mang vua nhap la: ");
        show(arr);
        System.out.print("Nhập phần tử x = ");
        x = scanner.nextInt();
        System.out.println(" Nhap so k :");
        k = scanner.nextInt();
        k--;
        for (int i = n; i > k; i--) {
            a[i] = a[i-1];
            a[k] = x;
            n++;
            System.out.println("Mang vua chen la: ");
  
        }
        for (int i = 0; i < k; i++) {
            System.out.println(" %d: " + a[i]);
        }
        
        
        



    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
