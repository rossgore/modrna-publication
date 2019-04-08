package altruistic_atheist_2019;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Experiment;
import java.util.Random;

public enum Home_Price
{
  LOW,  MODERATE,  HIGH;
 
  public static Home_Price random(Agent agent)
  {
    return (Home_Price)agent.randomFrom(Home_Price.class);
  }

  public static Home_Price random(Experiment<?> experiment)
  {
    return (Home_Price)experiment.randomFrom(Home_Price.class);
  }

  public static Home_Price random(Random r)
  {
    return (Home_Price)com.anylogic.engine.Utilities.randomFrom(Home_Price.class, r);
  }
}
