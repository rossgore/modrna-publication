package altruistic_atheist_2019;

public enum ProsocialActionType
{
  TRIBAL, 
  IDEOLOGICAL, 
  UNIVERSAL;
  
  public static int TRIBAL_INDEX = 0;
  public static int IDEOLOGICAL_INDEX = 1;
  public static int UNIVERSAL_INDEX = 2;
  
  private static double LOW_COST_MIN = 0.0D;
  private static double LOW_COST_MAX = 0.2D;
  
  private static double MODERATE_COST_MIN = LOW_COST_MAX;
  private static double MODERATE_COST_MAX = 0.8D;
  
  private static double HIGH_COST_MIN = MODERATE_COST_MAX;
  private static double HIGH_COST_MAX = 1.0D;
  

  public static double[] HIGH_COST_WVC_RATE = { 0.66D, 0.33D, 0.01D };
  public static double[] MODERATE_COST_WVC_RATE = { 0.4D, 0.4D, 0.2D };
  public static double[] LOW_COST_WVC_RATE = { 0.1D, 0.4D, 0.5D };
  
  public static double[] OUTSIDE_WVC_UNBIASED = { 0.0D, 0.5D, 0.5D };
  public static double[] OUTSIDE_WVC_IDEOLOGICAL_HEAVY = { 0.0D, 0.8D, 0.2D };
  public static double[] OUTSIDE_WVC_UNIVERSAL_HEAVY = { 0.0D, 0.2D, 0.8D };
  
  public static double POLAR_SUPERNATURAL_CUTOFF = 0.9D;
  public static double POLAR_NATURAL_CUTOFF = 0.1D;
  
  public static double[] getWVCRate(double cost)
  {
    if ((cost > HIGH_COST_MIN) && (cost <= HIGH_COST_MAX))
    {
      return HIGH_COST_WVC_RATE;
    }
    if ((cost > MODERATE_COST_MIN) && (cost <= MODERATE_COST_MAX))
    {
      return MODERATE_COST_WVC_RATE;
    }
    if ((cost >= LOW_COST_MIN) && (cost <= LOW_COST_MAX))
    {
      return LOW_COST_WVC_RATE;
    }
    


    return new double[] { 0.0D, 0.0D, 0.0D };
  }
  





  public static double[] getOutsideWVCRate(Person agent)
  {
    if ((prosocialActionHistory[IDEOLOGICAL_INDEX] & (prosocialActionHistory[UNIVERSAL_INDEX] != 0 ? 0 : 1)) != 0)
    {
      return OUTSIDE_WVC_IDEOLOGICAL_HEAVY;
    }
    


    if (((prosocialActionHistory[IDEOLOGICAL_INDEX] != 0 ? 0 : 1) & prosocialActionHistory[UNIVERSAL_INDEX]) != 0)
    {
      return OUTSIDE_WVC_UNIVERSAL_HEAVY;
    }
    



    if ((WorldView > POLAR_SUPERNATURAL_CUTOFF) || 
      (WorldView < POLAR_NATURAL_CUTOFF))
    {
      return OUTSIDE_WVC_IDEOLOGICAL_HEAVY;
    }
    


    if (((prosocialActionHistory[IDEOLOGICAL_INDEX] != 0 ? 0 : 1) & (prosocialActionHistory[UNIVERSAL_INDEX] != 0 ? 0 : 1)) != 0)
    {





      return OUTSIDE_WVC_UNIVERSAL_HEAVY;
    }
    

    return OUTSIDE_WVC_UNBIASED;
  }
  

  public static ProsocialActionType getFromIndex(int indexOfProsocialActionType)
  {
    if (indexOfProsocialActionType == TRIBAL_INDEX)
    {
      return TRIBAL;
    }
    if (indexOfProsocialActionType == IDEOLOGICAL_INDEX)
    {
      return IDEOLOGICAL;
    }
    

    return UNIVERSAL;
  }
}
