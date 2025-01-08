package insertionsort;

//import static insertionsort.InsertionSort.insertionSort;

public class InsertionSort {
    
    
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        
        System.out.println("The original array structure: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        insertionSort(array);
        
        System.out.println("\nSorted array structure: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    
    public static void insertionSort(int[] array) {//Method for Insertion
        int n = array.length;
        //Outer loop
        for (int i = 1; i < n; i++) {// Loop starts fromt he second element (index 1)
                                     // and iterates through the array
            int key = array[i];      // key is the element currently being inserted
                                     // into the sorted portion of the array
            int j = i - 1;           // j is the index of the last element in the sorted
                                     // portion of the array
            
            //Inner loop (shifting elements)              
            while (j >= 0 && array[j] > key) {//Checks two conditions
                //J greater than or equal to 0 and index J should be greater than key
                
            array[j + 1] = array[j];//Element is shifted one position to the right
            j--;//decremented to check the previous element in the next iteration
            }
            
            array[j + 1] = key;// after the loop, key is placed in its correct position
                               // within the sorted portion
        }
    }
  
}

  
    