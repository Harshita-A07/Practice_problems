package JAVA;

import java.util.*;
import java.util.Scanner;

public class linkedlist1 {
    class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }      }

    private Node head;
    private Node tail;
    private int size;
    public linkedlist1(){
        
        this.size=0;
    }

 
    public void insertatbeginning(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;
        if (tail==null) // if it's empty LL then Head & ail remains in same place
        {
            tail = head;   
        }
        size+=1;
    }
    public void insertatlast(int data){
        if (tail==null)  {
            insertatbeginning(data);
            return;
            
        }
        Node node = new Node(data);
        tail.next=node;
        tail=node;
        size+=1;  // his can be used only when we know/use tail

        // if (head == null) {
        //     head = node;
        // } else {
        //     // Traverse to the end of the list
        //     Node temp = head;
        //     while (temp.next != null) {
        //         temp = temp.next;
        //     }
        //     // Link the new node at the end
        //     temp.next = node;
        // }
    }
    public void insert(int index, int data){

        if (index==0) {
            insertatbeginning(data);
            return;
            
        }
        if (index == size) {
            insertatlast(data);
            return;
            
        }

        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;

        }
        Node node = new Node(data);
        node.next=temp.next;
        temp.next=node;
        size++;
        }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        linkedlist1 list = new linkedlist1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            list.insert(i,data);
        }
        list.insertatbeginning(9);
        list.insertatlast(29);
        list.insert(1, 19);
       // list.insertatlast(69);
        list.display();
        scanner.close();
    }
}
