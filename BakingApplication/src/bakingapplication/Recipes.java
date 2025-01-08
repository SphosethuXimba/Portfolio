
package bakingapplication;


public abstract class Recipes implements iRecipes
{
    protected String ingredients;
    protected int difficultyLevel;
    protected double cookTime;
    
      public Recipes(String ingredients, double cookTime, int difficultyLevel)
      {
        this.ingredients = ingredients;
        this.cookTime = cookTime;
        this.difficultyLevel = difficultyLevel;
    }
      
      public String getIngredients() 
    {
        return ingredients;
    }

    public double getCookTime() 
    {
        return cookTime;
    }

    public int getDifficultyLevel()
    {
        return difficultyLevel;
    }

}
