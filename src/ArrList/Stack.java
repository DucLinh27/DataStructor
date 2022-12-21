package ArrList;

public class Stack {
    int S[] = new int[10];  //Kb stack S co 10 PT
    int top= -1;            // danh tinh stack(top = -1 la S rong)
    void push(int x){       // dua x vao dinh stack
        top= top+1;
        S[top] = x;
    }
    int pop(){              // Lay pop tren dinh nhung ko xoa
        int x = S[top];
        top--;
        return x;
    }
    int peak(){
        return S[top];

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);;
        System.out.println("push : "+ st.top);
        st.pop();
        System.out.println("pop: "+ st.pop());
        st.peak();
        System.out.println("peak: "+ st.pop());


    }

}
