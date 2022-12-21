package Asm1;




public class Node {
    int data;
    Node next;


    public Node() {
    }

    public Node(int x) {
        this.data = data;
        this.next = next;
    }
    Node head, tail;
    public void Queue(){
        head = tail = null;
    }
    void enqueue(int x){
        Node P = new Node(x);
        if (head == null){
            head = tail = P;
        }else {
            tail.next = P;
            tail = P;
        }
    }
    int dequeue(){
        if (!isEmpty()){
            int x = head.data;
            head = head.next;
            return x;
        } else {
            System.out.println("Q null");
            return -1;
        }
    }
    int top(){
        return head.data;
    }
    boolean isEmpty(){
        return head == null;
    }
    void clear(){
        head = null;
    }
    void print(){
        Node n = head;
        while (n != null)
        {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        Node Q = new Node();
        Q.enqueue(4);
        Q.enqueue(1);
        Q.enqueue(7);
        Q.enqueue(3);
        Q.enqueue(5);
        System.out.println("Queue: ");
        Q.print();


    }


}