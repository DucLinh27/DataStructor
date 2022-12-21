package ASM21649;

import java.util.Scanner;

public class Queue {
    char Q[];
    int MAX = 250;
    int front, rear;

    // init QUEUE
    Queue(int M) {
        MAX = M;
        Q = new char[MAX];
        rear = 0;
        front = -1;
    }

    int Count() {
        if (front == rear)
            return 0;
        else
            return ((MAX - front) + rear) % MAX;
    }
    void Enqueue(char e) {
        if (Count() == MAX -1)
            System.out.println("Queue is Full!");
        else {
            Q[rear] = e;
            rear = (rear + 1) % MAX;
            if (front == -1)
                front = 0;
        }
    }
    char Dequeue() {
        char e = ' ';
        if (Count() == 0)
            System.out.println("Queue is Empty!");
        else {
            e = Q[front];
            front = (front + 1) % MAX;
        }
        return e;
    }

    String Transfer(String S1) {
        String S2 = "";
        int i = 0;
        int count = 0;
        char y;
        if (S1.length() == 0) {
            System.out.println("Empty string! Please input again!");
            return "";
        }
        else if (S1.length() > 250)
        {
            System.out.println();
            System.out.println("String over 250 characters. Please enter again");
            return "";
        }
        else {
            try {
                while(i < S1.length()) {
                    while(Count() < MAX -1) {
                        y = S1.charAt(i);
                        Enqueue(y);
                        i = i + 1;
                        if (i >= S1.length())
                            break;
                    }
                    //Đua phần tử Enqueue vào S2
                    while(Count() > 0) {
                        y = Dequeue();
                        S2 = S2 + y;
                    }

                    count = count + 1;
                }
                System.out.println("Number times used buffer Q:" + count);
                return S2;
            } catch (Exception e) {
                System.out.println("Error" + e.toString());
                return "";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue Q = new Queue(11);
        String S1 = "";
        System.out.println("Enter string to transfer:" + "\nS1 = ");
        S1 = sc.nextLine();
        long start, end, time;
        start = System.currentTimeMillis();
        String S2 = Q.Transfer(S1);
        System.out.println("S2: " + S2);
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("Executed time: " + time + " millisecond");
    }
}
