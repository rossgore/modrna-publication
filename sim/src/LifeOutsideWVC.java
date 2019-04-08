package altruistic_atheist_2019;

public class LifeOutsideWVC
{
  private int proSocialActionOppFrequency;
 
  private double[] proSocialActionDistribution;
 
  public static int FIRST_AGE_CUTOFF = 30;
  
  public static double MIN_OPP_AMOUNT = 1.0D;
  
  public static double EMPLOYMENT_AMOUNT = 2.0D;
  
  public static double FIRST_AGE_CUTOFF_AMOUNT = 1.0D;
  public static double SECOND_AGE_CUTOFF_AMOUNT = 1.0D;
  public static double THIRD_AGE_CUTOFF_AMOUNT = 2.0D;
  
  public static double MARRIED_AMOUNT = 2.0D;
  public static double NUMBER_OF_KIDS_AMOUNT = 3.0D;
  
  public static double WV_POLAR_AMOUNT = 1.0D;
  public static double PAST_HISTORICAL_ACTION_AMOUNT = 1.0D;
  
  public LifeOutsideWVC(Person pAgent)
  {
    setProSocialActionDistribution(ProsocialActionType.getOutsideWVCRate(pAgent));
    
    double numberOfOpps = MIN_OPP_AMOUNT;

    if (Marital_Status == Legal_Status.MARRIED)
    {
      numberOfOpps += MARRIED_AMOUNT;
    }
    


    if (Employment == Employment_Level.EMPLOYED)
    {
      numberOfOpps += EMPLOYMENT_AMOUNT;
    }
    


    for (int i = 0; i < My_Children; i++)
    {
      numberOfOpps += NUMBER_OF_KIDS_AMOUNT;
    }
    


    if ((WorldView > 0.8D) || (WorldView < 0.2D))
    {
      numberOfOpps += WV_POLAR_AMOUNT;
    }
    

    for (int i = 0; i < prosocialActionHistory.length; i++)
    {
      if (prosocialActionHistory[i] != 0)
      {
        numberOfOpps += PAST_HISTORICAL_ACTION_AMOUNT;
      }
    }
    
    proSocialActionOppFrequency = ((int)numberOfOpps);
  }
  
  public int getNumberOfProsocialActionOppsPerWeek() {
    return proSocialActionOppFrequency;
  }
  
  public void setProSocialActionOppFrequency(int proSocialActionOppFrequency)
  {
    this.proSocialActionOppFrequency = proSocialActionOppFrequency;
  }
  
  public double[] getProSocialActionDistribution() {
    return proSocialActionDistribution;
  }
  
  public void setProSocialActionDistribution(double[] proSocialActionDistribution) {
    this.proSocialActionDistribution = proSocialActionDistribution;
  }
}
