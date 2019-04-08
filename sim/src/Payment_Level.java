package altruistic_atheist_2019;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Experiment;
import java.util.Random;

public enum Payment_Level
{
  LOW,  MODERATE,  HIGH,  VERY_HIGH,  EXTREME;
 
  public static Payment_Level random(Agent agent)
  {
    return (Payment_Level)agent.randomFrom(Payment_Level.class);
  }
  
  public static Payment_Level random(Experiment<?> experiment)
  {
    return (Payment_Level)experiment.randomFrom(Payment_Level.class);
  }
  
  public static Payment_Level random(Random r)
  {
    return (Payment_Level)com.anylogic.engine.Utilities.randomFrom(Payment_Level.class, r);
  }
}
