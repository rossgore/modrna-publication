package altruistic_atheist_2019;

import java.util.ArrayList;

public class Utils
{
  public Utils() {}
  
  public static int sampleDistribution(double[] array)
  {
    double choice = Math.random();
    int indexWhereChoiceLies = -1;
    double total = 0.0D;
    
    while (total < choice)
    {
      indexWhereChoiceLies++;
      total += array[indexWhereChoiceLies];
    }
    
    return indexWhereChoiceLies;
  }
  
  public static boolean getBooleanMajority(ArrayList<Boolean> array)
  {
    int numTrue = 0;
    int numFalse = 0;
    for (int i = 0; i < array.size(); i++)
    {
      if (((Boolean)array.get(i)).booleanValue())
      {
        numTrue++;
      }
      else
      {
        numFalse++;
      }
    }
    
    if (numTrue > numFalse)
    {
      return true;
    }
    if (numFalse > numTrue)
    {
      return false;
    }
    

    return Math.random() > 0.5D;
  }
  

  public static String toStringForDoubleArray(double[] array)
  {
    String s = "[ ";
    for (int i = 0; i < array.length; i++)
    {
      s = s + array[i] + " ";
    }
    s = s + "]";
    return s;
  }
}
