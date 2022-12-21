package Array;

import java.util.Random;
import java.util.Scanner;

public class Array1 {
    int A[] = new int[] {1,2,3,4,5,6,7,8,9,10};
    void Nhap(int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("A[%d] = ", i);
            A[i] = sc.nextInt();
        }
    }
    void NhapNN(int n){
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            System.out.printf("A[%d] = ", i);
            A[i] = rd.nextInt(1, 100);
        }
    }
    void In(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(A[i] + " ");

        }
    }
    //Tinh tong cac pt
    int Tong(int n){
        int s = 0;
        for (int i = 0; i < n; i++) {
            s= s + A[i];
        }
        return s;
    }

    //Tinh tong cac so le
    int TongSoLe(int n){
        int s = 0;
        for (int i = 0; i < n; i++) {
            if(A[i] % 2 == 1){
                s= s + A[i];
            }
        }
        return s;
    }
    int TongSoChan(int n){
        int s = 0;
        for (int i = 0; i < n; i++) {
            if(A[i] % 2 == 0){
                s= s + A[i];
            }
        }
        return s;
    }
    //Dem so chan
    int Demsochan(int n){
        int s = 0;
        for (int i = 0; i < n; i++) {
            if(A[i] % 2 == 0){
                s= s + 1;
            }
        }
        return s;
    }
    int TBCsoChan(int n){
        int s = 0, d=0;
        for (int i = 0; i < n; i++) {
            if(A[i] % 2 == 0){
                s= s + A[i];
                d++;
            }
        }
        if(d==0){
            return 0;
        }else {
            return s/d;
        }

    }
    int TBCsoLe(int n){
        int s = 0, d=0;
        for (int i = 0; i < n; i++) {
            if(A[i] % 2 == 1){
                s= s + A[i];
                d++;
            }
        }
        if(d==0){
            return 0;
        }else {
            return s/d;
        }
    }
    //Chen array --> Create
    void Insert(int x, int y, int n){
        n++; //tang Array de keo cac pt lui
        for (int i = n-1; i < y; i--) { // keo cac pt lui
            A[i] = A[i-1];
        }
        A[y] =x; //insert vao
    }
    //Delete
    void Delele(int y, int n){
        for (int i = y; i < n-1; i++) { // keo cac pt lui
            A[i] = A[i+1];
        }
        n--;
    }
    //Update
    void Update(int n){
        for (int i = 0; i < n; i++) {
            A[2] = 3;
        }
    }
    void Sapxep(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                if(A[j] < A[j-1])
                {
                    int t = A[j];
                    A[j] = A[j-1];
                    A[j-1] = t;
                }
            }
        }
    }
    //Search
    void Search(int x, int n){
        int search = -1;
        for (int i = 0; i < n; i++) {
            if(A[i] == x){
                search = i;
            }
        }
        if(search == -1 ){
            System.out.println("Khong tim thay x = "+ x);
        }else
            System.out.println("\nTim thay : " + x + search);
    }
    void SXBubble(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i ; j--) {
                if (A[j] < A[j-1]){
                    int t = A[j];
                    A[j] = A[j-1];
                    A[j-1] = t;
                }
            }

        }
    }
    void Selection(int n){
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = 0; j < n; j++) {
                if (A[j] < A[min]){
                    min =j;
                }
            }
            int t = A[i]; A[i] = A[min]; A[min]= t;
        }
    }


    public static void main(String[] args) {
        Array1 arr = new  Array1();
        int n =5;
        arr.NhapNN(n);
        arr.In(n);
        arr.SXBubble(n);
//        System.out.println("Sau khi sxnb: ");
//        arr.In(n);
        arr.Selection(n);
        System.out.println("Sau khi selection: ");
        arr.In(n);
//        System.out.println("\nTong cac PT: " + arr.Tong(5));
//        System.out.println("\nTinh tong so le: " + arr.TongSoLe(5));
//        System.out.println("\nTinh tong so chan " + arr.TongSoChan(5));
//        System.out.println("\nSo chan " + arr.Demsochan(5));
//        System.out.println("\nTBCsochan:" + arr.TBCsoChan(5));
//        System.out.println("\nTBCsole:" + arr.TBCsoLe(5));
        //Insert
//        arr.Insert(5,2,n);
//        System.out.println("Sau khi chen x :");
//        arr.In(n+1);
        //Delete
//        arr.Delele(1, n);
//        System.out.println("sau khi xoa y");
//        arr.In(n-1);
        //UPdate
//        arr.Update(n);
//        System.out.println("sau khi update y");
//        arr.In(n);
        //Sapwxep
//        arr.Sapxep(n);
//        System.out.println("sau khi sapxep");
//        arr.In(n);
        //Search
//        arr.Search(27,n);




    }
}
