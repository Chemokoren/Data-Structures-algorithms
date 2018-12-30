/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author kibsoft
 */
public class LinkedListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList  list =new LinkedList();
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(19);
        list.insertAtHead(20);
        
//        list.deleteFromHead();
//        System.out.println(list);
//         System.out.println("Length: "+list.length());

System.out.println("Found: "+list.find(15));
    }
    
    
    
}
