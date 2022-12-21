package Asm1;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    int A[] = new int[5];
    int top;
    Stack(){
        top = -1;
    }
    void push(int x){
        top++;
        A[top] = x;
    }
    int pop(){
        int x = A[top];
        top--;
        return x;
    }
    int top(){
        return A[top];
    }
    boolean isEmpty(){
        return top == 1;
    }
    void clear(){
        top = -1;
    }
    void print(){
        for (int i = 0; i <= top ; i++) {
            System.out.println(A[i] + " ");

        }
    }

    public static void main(String[] args) {
        Stack S = new Stack();
        S.push(1);
        S.push(3);
        S.push(5);
        S.push(4);
        System.out.println("Stack: ");
        S.print();
        S.push(2);
        System.out.println("\n Push $ to the top of stack: ");
        S.print();
        System.out.print("\n Pop of stack: "+ S.pop());
        System.out.print("\n Top of stack: " + S.top());
        System.out.print("\n isEmpty of stack: "+ S.isEmpty());
        S.clear();
        System.out.print("\n Clear Stack: ");
        S.print();

    }

}
