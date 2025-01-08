package twodimensionalarrayexample;
public class TwoDimensionalArrayExample 
{
    public static void main(String[] args) 
    {
       int [][] TwoDimensionalArray = { //Array with 3 rows and 4 columns
           {1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
       };
       //Accessing elements in the array
       int ElementAtRow1Column2 = TwoDimensionalArray[1][2];
        System.out.println("The element at position [1][2] is: " + ElementAtRow1Column2);
        
        //Display all elemants within array
        DisplayArray(TwoDimensionalArray);
    }//End of main method

    public static void DisplayArray(int [][] numbers)
    {
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers[i].length; j++)
            {
               
                 System.out.print(numbers[i][j] +" ");
            }
            System.out.println();
        }
    }
}//End of class
