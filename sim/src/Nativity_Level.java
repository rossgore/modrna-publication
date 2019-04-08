package altruistic_atheist_2019;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Experiment;
import java.util.Random;

public enum Nativity_Level
{
  NATIVE,  SEMI_NATIVE,  NON_NATIVE;
   public static Nativity_Level random(Agent agent)
  {
    return (Nativity_Level)agent.randomFrom(Nativity_Level.class);
  }
 
  public static Nativity_Level random(Experiment<?> experiment)
  {
    return (Nativity_Level)experiment.randomFrom(Nativity_Level.class);
  }
 
  public static Nativity_Level random(Random r)
  {
    return (Nativity_Level)com.anylogic.engine.Utilities.randomFrom(Nativity_Level.class, r);
  }
}
