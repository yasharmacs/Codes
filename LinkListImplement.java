import java.util.*;
import java.io.*;

public class LinkedListImplementation{
private static class Node{
    private int data;
    private Node next;
}

    public Node(int d){
        this.data=d;
    }
    
    public Node(int d, Node next){
        this.data=d;
        this.next=next;
    }

    private Node head;
    private Node tail;
    private int size;

    LinkedListImplementation(int size){
        this.size=0;
    }

    public static void main(String args[]){
        LinkedListImplementation ll=new LinkedListImplementation();
    }
}


