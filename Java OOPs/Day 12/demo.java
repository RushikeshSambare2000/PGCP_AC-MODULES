import java.util.*;

class demo{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original List: " + list);

        ListIterator<Integer> it = list.listIterator();

        // 👉 Forward traversal using hasNext() and next()
        System.out.println("\nForward Traversal:");
        while (it.hasNext()) {
            int val = it.next();
            System.out.println(val);

            // 👉 set() → replace element
            if (val == 20) {
                it.set(25); // replace 20 with 25
            }

            // 👉 add() → add element during iteration
            if (val == 30) {
                it.add(35); // add after 30
            }
        }

        System.out.println("\nList after set() and add(): " + list);

        // 👉 Backward traversal using hasPrevious() and previous()
        System.out.println("\nBackward Traversal:");
        while (it.hasPrevious()) {
            int val = it.previous();
            System.out.println(val);

            // 👉 remove() → remove element
            if (val == 25) {
                it.remove(); // remove 25
            }
        }

        System.out.println("\nFinal List after remove(): " + list);
    }
}