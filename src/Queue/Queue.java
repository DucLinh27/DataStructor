//package Queue;
//
//public class Queue {
//    int MAX =5;
//    int Q[] = new int[5];       //KB queue co 10 pt
//    int front = 0, rear = 0;    // queue rong
//    public void enqueue(int x){   // Them x vao cuoi queue
//        Q[rear] = x;         // Dua x vao vi tri rear
//        rear = (rear + 1) % MAX;        // Tang rear
//    }
//    int dequeue(){            // Lay PT dau queue
//        int x = Q[front];      // Lay PT dau queue
//        front = (front +1) % MAX;       // Tang front
//        return x;
//    }
//    int countEle(){
//        return (MAX + rear + front) % MAX;
//    }
//    boolean isEmpty(){
//        return (front == rear);
//    }
//    int peak(){
//        return Q[front];
//    }
//    public static void main(String[] args) {
//        Queue Qe = new Queue();
//        Qe.enqueue(1);
//        Qe.enqueue(2);
//        Qe.enqueue(3);
//        System.out.println("Front ="+ Qe.front+ " "+ "rear ="  + Qe.rear);
//        int x=  Qe.dequeue();
//        System.out.println("Front ="+ Qe.front+ " "+ "rear ="  + Qe.rear);
//        System.out.println("So luong pt:"  + Qe.countEle());
//        x = Qe.peak();
//        System.out.println("Front ="+ Qe.front+ " "+ "rear ="  + Qe.rear);
//        System.out.println("So luong pt:"  + Qe.countEle());
//
//
//
//    }
//
//
//
//}
