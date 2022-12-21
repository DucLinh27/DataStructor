package LinkedList;

class Node { //tao cac node
    int data;       // Phan chua du lieu
    Node next;      // Chua dia chi node tiep theo
}


public class LList{
    Node head = null; //Dau Ds
    Node tail = null; // Cuoi Ds
    void AddFirst(int x){
        Node p = new Node();
        p.data = x;
        p.next = null;
        if (head == null){
            head = tail = p;

        }else {
            p.next = head;
            head = p;
        }
    }
    void InDs(){
        Node p = head;
        while (p != null){
            System.out.println(p.data + " ");
            p = p.next;
        }
    }
    void AddLast(int x){
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
    int getSize(){
        return 0;
    }
    int Search(){
        return 0;
    }
    void delFirst(){
        head = head.next;
    }
    void delLast(){

    }

    public static void main(String[] args) {
        LList L = new LList();
        L.AddFirst(1);
        L.AddFirst(2);
        L.AddFirst(3);
        L.InDs();
        L.AddLast(9);
        System.out.println("Ds sau khi add Last: ");
        L.InDs();
        L.delFirst();
        System.out.println("Ds sau khi del Last: ");
        L.InDs();

    }
}