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
public class LinkedList {

    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public int length() {

        int length = 0;
        Node current = this.head;
        while (current != null) {
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    public void deleteFromHead() {
        this.head = this.head.getNextNode();

    }

    public Node find(int data) {
        Node current = this.head;

        while (current != null) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }

        result += "}";
        return result;

    }

}
