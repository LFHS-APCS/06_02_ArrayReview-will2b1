public class ArrayReview
{

    /**
     * Write a method that will return a String with the name 
     * of each employee from a given array (separated by a space) 
     * who has been with the company for over 20 years.   
     * Assume there are no null employees in the array.
     * IMPORTANT:  Use a regular for loop. 
     */
    public static String getNames(Employee[] employees)
    {
      String longTerm = "";
      for (Employee e : employees){
        if (e.getYears() > 20)
          longTerm += e.getName() + " ";
      }
      return longTerm;
    }

    /**
     * Suppose that nums is an array of doubles.  
     * Write a method that will find the average of 
     * only the positive numbers in the array.   
     * IMPORTANT:  Use an enhanced for loop.
     */
    public static double average(double[] nums)
    {
      double sum = 0;
      int count = 0;
      for (double n : nums){
        if (n > 0){
          sum += n;
          count++;
        }
      }
      if (count > 0){
        return sum/count;
      } else {
        return 0.0;
      }
    }
}
