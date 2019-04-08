package altruistic_atheist_2019;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Experiment;
import java.util.Random;

public enum Legal_Status
{
  SINGLE,  MARRIED;
 
  public static Legal_Status random(Agent agent)
  {
    return (Legal_Status)agent.randomFrom(Legal_Status.class);
  }

  public static Legal_Status random(Experiment<?> experiment)
  {
    return (Legal_Status)experiment.randomFrom(Legal_Status.class);
  }

  public static Legal_Status random(Random r)
  {
    return (Legal_Status)com.anylogic.engine.Utilities.randomFrom(Legal_Status.class, r);
  }
}
