import java.util.Arrays;
import java.util.Scanner;

class SearchingAlgorithms {
    // The main method is the entry point for all Java programs
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array with the user-defined size
        int[] testItems = new int[n];

        // Ask the user to input each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            testItems[i] = scanner.nextInt();
        }

        System.out.println("### Linear search version 2 (while loop) ###");
        System.out.println(Arrays.toString(testItems));

        // Ask the user for the item to find
        System.out.print("Enter the item to find: ");
        int itemToFind = scanner.nextInt();
        System.out.println("\nThe search item is " + itemToFind + "\n");

        // Search for the value and return the found index
        int index = linearSearchVersion2(testItems, itemToFind);

        if (index == -1) {
            System.out.println("\n" + itemToFind + " was not found in the array");
        } else {
            System.out.println("\n" + itemToFind + " was found at index " + index);
        }

        // Close the scanner
        scanner.close();
    }

    // A linear search algorithm that stops iterating if the item is found
    public static int linearSearchVersion2(int[] items, int searchItem) {
        // Initialise the variables
        int foundIndex = -1;
        int current = 0;
        boolean found = false;

        // Repeat while the end of the array has not been reached
        // and the search item has not been found
        while (!found && current < items.length) {
            System.out.println("Checking index " + current + " with value " + items[current]);

            // Compare the item at the current index to the search item
            if (items[current] == searchItem) {
                // If the item has been found, store the current index 
                foundIndex = current;
                found = true; // Raise the flag to stop the loop
                System.out.println("Item found! Stopping the search");
            }
            current = current + 1; // Go to the next index in the array
        }
        // Return the index of the searchItem or -1 if not found
        return foundIndex;
    }
}