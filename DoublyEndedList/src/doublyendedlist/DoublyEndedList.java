/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublyendedlist;

/**
 *
 * @author kibsoft
 */
public class DoublyEndedList {

    private Node head;
    private Node tail;

    public void insertAtTail(int data) {

        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail != null) {
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
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
