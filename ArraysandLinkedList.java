/* Array: stores a fixed number of elements of the same data type in contiguous memory allocation,
starts from zero, 
queue, dequeue are implemented using array */

/* Linked List: Linked List is a linear data structure where elements (called nodes) are stored in non-contiguous memory locations and each node contains data and a reference (link) to the next node.
it does not have index(numbering).
hash, sets, tree, graph are implemented using Linked List */

import java.util.LinkedList;

public class ArraysandLinkedList {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Array elemetns are :");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Linked List element are :");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}
