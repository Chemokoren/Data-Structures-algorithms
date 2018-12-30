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
public class DoublyEndedListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyEndedList dList = new DoublyEndedList();
        dList.insertAtTail(19);
        dList.insertAtTail(18);
        dList.insertAtTail(17);
        System.out.println(dList);
    }

}
