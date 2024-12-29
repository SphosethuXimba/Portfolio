
package arrayrecap;

public class ArrayRecap 
{

  
    public static void main(String[] args) 
    {
      //Declare and initialise your array
       // int [] ExamScore = {55, 78, 80, 65, 80, 50};
        //OR
        
//        int [] ExamScore;
//        ExamScore = new int[] {55,78,80,65,80,50};
        //OR
        
        int [] ExamScore = new int[6];
        ExamScore[0]=55;
        ExamScore[1]=78;
        ExamScore[2]=80;
        ExamScore[3]=65;
        ExamScore[4]=80;
        ExamScore[5]=50;
        
        //Calculate average
        //Pass array to method
        double Average = GetAverage(ExamScore);
        
        //Display the exam score
        System.out.println("The average scores ------> "+ Average);
    }
    
    //Create method for average
//    public static double GetAverage(int [] scores)
//    {
//    int sum = 0;
//    for (int score: scores)
//    {
//        sum += score;
//    }
//    return (double) sum/scores.length;
//    }
    //OR
     
//    public static double GetAverage(int [] scores)
//     {
//         int sum=0;
//         for (int i=0; i<scores.length;i++)
//         {
//               sum += scores[i];
//         }
//          return (double) sum/scores.length;
//     }
    //OR
     public static double GetAverage(int [] scores)
    {
         int sum=0;
         int i=0;
         while (i<scores.length)
         {
               sum += scores[i];
               i++;
         }
          return (double) sum/scores.length;
     }
}
