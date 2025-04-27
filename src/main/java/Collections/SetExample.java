package Collections;

//      The Set interface in Java represents a collection of unique elements.
//      Unlike a List, a Set does not allow duplicate values, making it ideal when you want to
//      ensure that every item is distinct — like storing unique IDs, tags, or usernames.
//      Sets do not maintain any specific order by default, and they also don’t allow accessing elements by index.
//      This is because Sets are designed to focus on the presence of elements, not their position.
//      Some of the most commonly used implementations of the Set interface include HashSet, LinkedHashSet, and Treeset.

//      HashSet is the most commonly used Set implementation.
//      It doesn’t guarantee any specific order of elements — the items may appear in a different order each time you run your code.
//      However, it offers constant-time performance for basic operations like add, remove, and contains.
//
//      HashSetLinkedHashSet extends HashSet and adds a twist — it maintains the insertion order of elements.
//       This means when you iterate over the set, the elements will appear in the same order in which they were added.
//       It’s slightly slower than HashSet, but useful when you need both uniqueness and order.
//
//       TreeSet implements the NavigableSet interface and stores elements in a sorted (natural) order — alphabetically for strings, numerically for numbers.
//        It uses a Red-Black tree under the hood, making operations a bit slower thanHashSet, but perfect when you want the elements to stay sorted automatically.

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Guava");
        System.out.println("size of the set : " + fruits.size());

        for (String x : fruits) {
            System.out.println(x);
        }

        System.out.println("After Addding : " + fruits);

        fruits.remove("Banana");
        System.out.println("After Removing : " + fruits);
        System.out.println("size of the set : " + fruits.size());
        System.out.println(fruits.contains("Grapes"));
        fruits.clear();

        System.out.println("List after clear : " + fruits);

    }
}
