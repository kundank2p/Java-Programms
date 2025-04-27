package Collections;

//      The List interface in Java represents an ordered collection that allows duplicate elements.
//      The elements are stored in the order that they were added; hence, it maintains the insertion order.
//      List also provides indexed access, allowing developers to retrieve or modify elements by their position in the list.
//      Some of the most commonly used implementations of the List interface include ArrayList, LinkedList,and Vector.

//      ArrayList is a dynamic array-based implementation.
//      It is fast for get and set operations but slower for insertion and deletion in the middle of the list.
//
//      ArrayListLinkedList is an implementation of a doubly linked list.
//      It excels in insertions and deletions but may be slower for access due to its non-contiguous memory structure,meaning that the elements are not stored next to each other.
//      Instead, each element, called a node, contains actual data and a reference (pointer) to both the previous and the next node on the list.
//
//      LinkedListVector is a class in Java that implements the List interface and works like an ArrayList, but with one key difference—it is synchronized.
//      This means it is thread-safe and can be safely used in multithreaded environments.
//      However, because of this synchronization,Vector is usually slower than ArrayList in single threaded situations.

//      Stack is a class in Java that represents a Last-In, First-Out (LIFO) data structure.
//      It extends the Vector class and provides methods like push() to add elements, pop() to remove the top element, and peek() to look at the top element without removing it.
//      Since it inherits fromVector, it's also synchronized by default.


import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println("size of the list : " + fruits.size());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("After Addding : " + fruits);

        fruits.remove("Banana");
        System.out.println("After Removing : " + fruits);
        System.out.println("Element at Index 1 : " + fruits.get(1));
        System.out.println("size of the list : " + fruits.size());
        fruits.set(1, "Grapes");
        System.out.println("Element at Index 1 : " + fruits.get(1));
        System.out.println(fruits.contains("Grapes"));
        System.out.println(fruits.indexOf("Grapes"));
        fruits.clear();

        System.out.println("List after clear : " + fruits);


    }
}
