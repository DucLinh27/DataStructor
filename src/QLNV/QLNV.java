package QLNV;

import P3.DSSV;

import java.util.Scanner;

class NV {
    String id, name;
    int age;
    float salary, commision;

    public NV() {
    }

    public NV(String id, String name, int age, float salary, float commision) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.commision = commision;
    }
}
public class QLNV{
    NV DSNV[] = new NV[100]; //Tao ds 100 nv
    // Cac thao tac viet o day
    int soluong = 0;

    void Nhap(){
        Scanner scanner = new Scanner(System.in);
        String id, name;
        int age;
        float salary, commision;
        int i = 0;
        int kt = 1;
        do{
            System.out.println("Nhap id: ");
            id = scanner.nextLine();
            System.out.println("Nhap name: ");
            name = scanner.nextLine();
            System.out.println("Nhap age: ");
//            scanner.next(); // xoa bo dem
            age = scanner.nextInt();
            System.out.println("Nhap salary: ");
            salary = scanner.nextInt();
            System.out.println("Nhap phu cap: ");
            commision = scanner.nextInt();
            NV x = new NV(id, name, age , salary, commision);
            DSNV[i] = x; // Dua NV vao ds
            i = i+1;
            System.out.println("Tiep tuc (0/1) : ");
            kt = scanner.nextInt();

        }while (kt == 1);
    }
    void InDs(){
        System.out.println("------Danh Sach Nhan Vien-------");
        System.out.println("ID\tFullName\tAge\tSalary\tCommision");
        for (int i =0; i< soluong; i++) {
            NV x = DSNV[i];
            System.out.println(x.id+" "+  x.name+" "+ x.age+" "+ x.salary+" "+ x.commision);


        }
    }
    void TimKiem(String name){
        for (int i = 0; i < soluong; i++) {
            NV x = DSNV[i];
            System.out.println("------Danh Sach Nhan Vien-------");
            System.out.println("ID\tFullName\tAge\tSalary\tCommision");
            if (name.compareToIgnoreCase(x.name) ==0){
                System.out.println(x.id+" "+  x.name+" "+ x.age+" "+ x.salary+" "+ x.commision);

            }
        }
    }
    void SapXep(){
        for (int i = 0; i < soluong; i++) {
            int min = i;
            for (int j = 0; j < soluong; j++) {
                if (DSNV[j].name.compareToIgnoreCase(DSNV[min].name) < 0){
                    min = j;
                }

            }
            NV x = DSNV[i];
            DSNV[i] = DSNV[min];
            DSNV[min] = x;

        }
    }
//    void UpdatePC(String id, float pcmoi){
//        for (int i = 0; i < soluong; i++) {
//            if ()
//
//        }
//    }
    public static void main(String[] args) {
        // GOi thuc hien cac thao tac
        QLNV L = new QLNV();
        L.Nhap();
        L.InDs();
    }
}
