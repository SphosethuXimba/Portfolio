package grocerylist;
import java.util.Arrays;
public class GroceryList
{

   
    public static void main(String[] args) 
    {
       String [] GroceryList = {"Eggs", "Milk", "Bread", "Cereal", "Toilet Paper", "Butter"};
       
       //Sort Array
       Arrays.sort(GroceryList);
       
       //Print array
       System.out.println("Sorted rocery items: " + Arrays.toString(GroceryList));
       System.out.println("______________________________");
       
       //Prompt the user to search
       //Lets assume the user gave you the following value
       String SearchItem = "Milk" ;
       int Index = Arrays.binarySearch(GroceryList, SearchItem);
       
       if (Index >= 0)
       {
           System.out.println("The item: "+SearchItem+" is found.");
       }
       else
       {
           System.out.println("Sorry, item not found.");
       }
    }
    
    
    
//    // Method to sort books in ascending order using insertion sort
//    public static void SortItems(String[] GroceryList) 
//    {
//        int n = GroceryList.length;
//        // Outer loop for traversing through each element
//        for (int i = 1; i < n; i++) {
//            String key = GroceryList[i];    // Current element to be compared
//            int j = i - 1;            // Index of the previous element
//
//            // Inner loop for shifting elements to the right
//            while (j >= 0 && GroceryList[j].compareTo(key) > 0) {
//                GroceryList[j + 1] = GroceryList[j];
//                j--;
//            }
//            
//            // Place the current element at the correct position
//            GroceryList[j + 1] = key;
//        }
//    }
}
