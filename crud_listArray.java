import java.util.ArrayList;
public class crud_listArray {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("ArrayList after adding elements: " + list);

        // Read elements
        System.out.println("Element at index 1: " + list.get(1));

        // Update elements
        list.set(1, "Grape");
        System.out.println("ArrayList after updating element at index 1: " + list);

        // Delete elements
        list.remove(1);
        System.out.println("ArrayList after deleting element at index 1: " + list);
    }

}

