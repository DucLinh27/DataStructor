package Asm2;

import java.util.Scanner;

public class Queue {
    char Q[];
    int Max = 250;
    int r, f;

    public Queue(int M) {
        Max = M;
        Q = new char[Max];
        this.r = 0;  //rear = 0
        this.f = -1;  // front = -1
        // bắt buộc rear và front
        //khoi dau 2 bang 0 là rong
    }

    int Count() {
        if (f == r) {
            return 0;
        } else {
            return ((Max - f) + r) % Max; //chia ra so luong phan tu
        }
    }

    void Enqueue(char e) {
        if (Count() == Max - 1) {
            System.out.println("Queue is Full");
        } else {
            Q[r] = e;
            r = (r + 1) % Max;
            if (f == -1) {
                f = 0;
            }
        }
    }

    char Dequeue() {
        char e = ' ';
        if (Count() == 0) {
            System.out.println("Queue Empty");
        } else {
            e = Q[f];
            f = (f + 1) % Max;
        }
        return e;
    }

    String Transfer(String S1) {
        String S2;
        int i = 0;
        int count = 0;
        S2 = "";
        char y;
        if (S1.length() == 0) {
            System.out.println("Empty String, Please Again");
            return "";
        } else if (S1.length() > 250) {
            System.out.println();
            System.out.println("String over 250 characters. Please enter again");
            return "";
        } else {
            try {
                while (i < S1.length()) {
                    while (Count() < Max - 1) {
                        y = S1.charAt(i);
                        Enqueue(y);
                        i = i + 1;
                        if (i >= S1.length()) {
                            break;
                        }
                        while (Count() > 0) {
                            y = Dequeue();
                            S2 = S2 + y;
                        }
                        count = count + 1;
                    }
                    while (Count() > 0) {
                        y = Dequeue();
                        S2 = S2 + y;
                    }
                    System.out.println("Number times used Buffer Q: " + count);
                    return S2;
                }
            } catch (Exception e) {
                System.out.println("Error" + e.toString());
                return "";
            }
        }
//        return S1; //Not
        return S2;
    }

    public static void main(String[] args) {
        Queue Q = new Queue(10);
        String S1 = "";
        System.out.println("input the String to to Transfer"+ "\nS1 = ");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        S1 = scanner.nextLine();
        long begin, end , time;
        begin = System.currentTimeMillis();
        String s = Q.Transfer(S1);
        System.out.println("S2: "+ s);
        end = System.currentTimeMillis();
        time = end - begin;
        System.out.println("\nExecuted Time of 1000MB Queue");
        System.out.println("\n"+ time + " millisecond");
    }

}

