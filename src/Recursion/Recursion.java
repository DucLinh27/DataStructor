package Recursion;

public class Recursion {
    int GT(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * GT(n-1);
        }
    }
    int fibo(int n){
        if ( n <=2){
            return n;
        } else {
            return fibo(n-1) + fibo(n-2);
        }
    }
    void inDayFibo(int n){
        for (int i = 1; i <= n ; i++) {
            System.out.println(fibo(i)+ " ");

        }
    }
    void Convert(int n){
        if(n>0){
            System.out.println(n %2);
            Convert(n/2);
        }
    }
    void MoveDisk(int n, char A, char B, char TG){
        if (n ==1){
            System.out.println("\nMove from "+ A + "to"+ B);

        }else {
            MoveDisk(n-1, A, TG, B);
            System.out.println("\nMove from "+ A + "to"+ B);
            MoveDisk(n-1, TG, B, A);
        }
    }
    int GCD(int a, int b){
        if(b==0){
            return a;
        }else {
            return GCD(b, a%b);
        }

    }

    public static void main(String[] args) {
        Recursion R = new Recursion();
        int a = 12, b= 25;
        System.out.println("GCD "+ a +" "+ b+R.GCD(a,b));
    }
}

