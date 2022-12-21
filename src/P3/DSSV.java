package P3;

import java.util.Scanner;

class SV{
    String ID, Name, Phone, Class;		//data
    SV() {}
    SV(String ID, String Name, String Phone, String Class)
    {
        this.ID = ID;
        this.Name = Name;
        this.Phone = Phone;
        this.Class = Class;
    }
}

class Node{
    SV data;							//phan data la 1 sv
    Node next;
}

public class DSSV {
    Node head = null;
    Node tail = null;

    void AddFirst(SV x)	//Them x vao dau DS
    {
        Node p = new Node();//Tao 1 node moi
        p.data = x;			//dua x vao phan data cua p
        p.next = null;
        if(head == null)	//DS rong
            head = tail = p;
        else				//DS khong rong
        {
            p.next = head;
            head = p;
        }
    }
    void addLast(SV x){
        Node p = new Node();
        p.data = x;
        p.next = null;
        if (head == null){
            head = tail = p;
        }else {
            tail.next = p;
            tail = p;
        }
    }
    void Nhap(){
        Scanner scanner = new Scanner(System.in);
        String id, name, phone, cls;
        int dung = 0;
        while (dung == 0){
            System.out.println("Enter ID: ");
            id = scanner.nextLine();
            System.out.println("Enter Name: ");
            name = scanner.nextLine();
            System.out.println("Enter phone: ");
            phone = scanner.nextLine();
            System.out.println("Enter cls: ");
            cls = scanner.nextLine();
            SV x = new SV(id, name, phone, cls);
            addLast(x);
            System.out.println("Stop ? (1/0)");
            dung = scanner.nextInt();
            scanner.nextLine();

        }
    }
    void TimID(String id)
    {
        Node p = head;
        System.out.println("%ID\t\tName\t\t%Phone\t\tClass");
        while(p !=null)
        {
            if(id.compareToIgnoreCase(p.data.ID)==0)
            {
                System.out.printf("%8s\t%10s\t", p.data.ID, p.data.Name);
                System.out.printf("%10s\t%5s\t", p.data.Phone, p.data.Class);
                System.out.println();		//xuong hang duoi
            }
            p = p.next;
        }
    }

    void InDS()
    {
        Node p = head;
        System.out.println("%ID\t\t%Name\t\t%Phone\t\tClass");
        while(p !=null)
        {
            System.out.printf("%8s\t%10s\t", p.data.ID, p.data.Name);
            System.out.printf("%10s\t%5s\t", p.data.Phone, p.data.Class);
            System.out.println();		//xuong hang duoi
            p = p.next;
        }
    }
    void TimTen(String name){

    }


    public static void main(String[] args) {
        DSSV DS = new DSSV();
        DS.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID you want to find: ");
        String id = sc.nextLine();
        DS.TimID(id);


    }

}
