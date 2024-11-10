package ArrayList;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
       
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Original list: " + colors);
       
        System.out.println("Iterating over the list:");
        for (String color : colors) {
            System.out.println(color);
        }
        colors.add(0, "Yellow");
        System.out.println("After adding element at first position: " + colors);

        String colorAtIndex2 = colors.get(2);
        System.out.println("Element at index 2: " + colorAtIndex2);

        colors.set(1, "Purple");
        System.out.println("After updating element at index 1: " + colors);

        colors.remove(2);
        System.out.println("After removing the third element: " + colors);

        boolean containsBlue = colors.contains("Blue");
        System.out.println("List contains 'Blue': " + containsBlue);

        Collections.sort(colors);
        System.out.println("Sorted list: " + colors);

        ArrayList<String> newColors = new ArrayList<>(colors);
        System.out.println("Copied list: " + newColors);

        Collections.reverse(colors);
        System.out.println("Reversed list: " + colors);

        boolean areListsEqual = colors.equals(newColors);
        System.out.println("Are the original and copied lists equal: " + areListsEqual);

        colors.clear();
        System.out.println("After emptying the list: " + colors);

        boolean isEmpty = colors.isEmpty();
        System.out.println("Is the list empty: " + isEmpty);

        newColors.ensureCapacity(100);
        System.out.println("Increased the capacity of the copied list.");

        newColors.trimToSize();
        System.out.println("Trimmed the capacity of the copied list.");
    }
}

