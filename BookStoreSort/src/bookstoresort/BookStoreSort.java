package bookstoresort;
import java.util.Scanner;

public class BookStoreSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        // Array of book titles
        String[] books = {"Harry Potter", "The Great Gatsby", "To Kill a Mockingbird", "Pride and Prejudice", "Othello"};
       
        // Prompt the user to choose sorting order
        System.out.println("In which order would you like the books to be sorted (select the number 1 or 2):\n1. Ascending Order\n2. Descending Order");
        int option = scanner.nextInt();
       
        while (true)
        { 
        if (option == 1) {
            // Sort books in ascending order if user chooses option 1
            InsertionAscendingSort(books);
            System.out.println("\nBooks sorted in ascending order: ");
            for (String name : books) {
                System.out.println(name);
               
            } break;
        } 
        else if (option == 2) {
            // Sort books in descending order if user chooses option 2
            InsertionDescendingSort(books);
            System.out.println("\nBooks sorted in descending order: ");
            for (String name : books) {
                System.out.println(name);
               
            } break;
        } 
        else {
            // Handle invalid input
            System.out.println("\nINVALID INPUT!!! Please enter the number 1 or 2.");
             System.out.println("In which order would you like the books to be sorted (select the number 1 or 2):\n1. Ascending Order\n2. Descending Order");
        }
         }
        // Close the scanner
      // scanner.close();
    }

    // Method to sort books in ascending order using insertion sort
    public static void InsertionAscendingSort(String[] books) {
        int n = books.length;
        // Outer loop for traversing through each element
        for (int i = 1; i < n; i++) {
            String key = books[i];    // Current element to be compared
            int j = i - 1;            // Index of the previous element

            // Inner loop for shifting elements to the right
            while (j >= 0 && books[j].compareTo(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            
            // Place the current element at the correct position
            books[j + 1] = key;
        }
    }
    
    // Method to sort books in descending order using insertion sort
    public static void InsertionDescendingSort(String[] books) {
        int n = books.length;
        // Outer loop for traversing through each element
        for (int i = 1; i < n; i++) {
            String key = books[i];    // Current element to be compared
            int j = i - 1;            // Index of the previous element

            // Inner loop for shifting elements to the right
            while (j >= 0 && books[j].compareTo(key) < 0) {
                books[j + 1] = books[j];
                j--;
            }
            
            // Place the current element at the correct position
            books[j + 1] = key;
        }
    }
}
//Title: Insertion Sort Algorithm
//Author: Rajat Mishra
//Date: 28 june 2024
//Version: 1
//Availabilty: geeksforgeeks.org/insertion-sort-algorithm/ 
       