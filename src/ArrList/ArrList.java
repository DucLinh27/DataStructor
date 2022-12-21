package ArrList;

import java.util.ArrayList;
import java.util.Random;

public class ArrList {
    ArrayList <Integer> A = new ArrayList();
    ArrayList <String> SDSV = new ArrayList();

    void Input(){
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            int x = rd.nextInt(1,5);
            A.add(x);
        }
    }
    void Output(){
        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i));
        }
    }



    public static void main(String[] args) {
        ArrList L = new ArrList();
        /*L.Input();
        L.Output();
        System.out.print("\nsize of A:" + L.A.size());
        System.out.print("\nisEmpty of A:" + L.A.isEmpty());
        System.out.print("\ncontains of 5:" + L.A.contains(5));
        System.out.print("\nindexOf of 5:" + L.A.indexOf(5));*/
        /*L.A.add(9);
        L.Output();
        System.out.println("xxxxx");*/
//        L.A.add(2,9);
//        L.Output();
      /*  System.out.println("xxxxx");
        *//*L.A.remove(2);
        L.Output();*//*
//        L.A.set(1,5);
//        L.Output();
        System.out.println("Get: "+ L.A.get(4));*/





    }
}
