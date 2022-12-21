package asm1649;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Messager P1 = new Messager("P1");
        Messager P2 = new Messager("P2");

        try{
            P1.connect(P2);
            System.out.println("Input message: ");
            while (true){
                String sentence = scanner.nextLine();
                if (sentence.isEmpty()){
                    break;
                } else if(sentence.length() > 250){
                    System.out.println("\n Max limit can't send the message. Please delete and input again");
                } else {
                    P1.send(sentence);
                }
            }
            P2.receiver();
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
        scanner.close();
        P2.printAll();
        time();
        space();

    }
    public static void space(){
        Runtime runtime = Runtime.getRuntime();
        long memoryMax = runtime.maxMemory();
        long memoryUsed = runtime.totalMemory();
        double memoryUsedPercent = (memoryUsed * 100.0) / memoryMax;
        System.out.println("Memory Used: "+ memoryUsedPercent);
        if (memoryUsedPercent > 90.0) System.gc();
    }
    public static void time(){
        System.out.println();
        long start = System.nanoTime();
        long end = System.nanoTime();
        //execution time
        long execution = end - start;
        System.out.println("Execution time:"+ execution + " Nanoseconds");
        System.out.println();
    }
}
