package Asm1;

import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private String description;

    public Product(int id, String name, int quantity, String description) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
    }

    public Product() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList<Product> products = new SinglyLinkedList<>();
        System.out.println("Welcom to GreenMart inventory management system ");
        System.out.println();
        System.out.println("1. Add products to the Head of the inventory list");
        System.out.println("2. Add products to the Tail of the inventory list");
        System.out.println("3. View products in stock");
        System.out.println("4. Delete the Head of product from  the inventory list");
        System.out.println("5. Delete the Head of product from  the inventory list");
        System.out.println("6. Exit");
        
//        switch (\){
//            case 1:
//                Product product1 = new Product(1, "Banh", 10, "good product");
//
//        }

    }


}


