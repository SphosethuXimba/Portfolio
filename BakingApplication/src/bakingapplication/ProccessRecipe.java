
package bakingapplication;


public class ProccessRecipe extends Recipes
{
 
public ProccessRecipe(String ingredients,  double cookTime, int difficultyLevel) 
{
super(ingredients, cookTime, difficultyLevel);
}

    // Implementing the print_tickets method
    @Override
    public void PrintRecipes()
    {
        System.out.println("**************************************************************");
        System.out.println("INGREDIENTS: " + ingredients);
        System.out.println("TIME TO MAKE: " + cookTime);
        System.out.println("DIFFICULTY LEVEL: " + difficultyLevel);
        System.out.println("**************************************************************");
      
    }
}

