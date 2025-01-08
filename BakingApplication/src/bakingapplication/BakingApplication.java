
package bakingapplication;
import java.util.Scanner;
public class BakingApplication 
{

   
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the ingredients: ");
        String ingredients = scanner.nextLine();

        System.out.print("Enter time to make (in minutes): ");
        double cookTime = scanner.nextDouble();

        System.out.print("Enter difficulty level: ");
        int difficultyLevel = scanner.nextInt();
        
           ProccessRecipe recipes = new ProccessRecipe(ingredients, cookTime, difficultyLevel);

        recipes.PrintRecipes();
         scanner.close();
    }
    
}
