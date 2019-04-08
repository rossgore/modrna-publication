package altruistic_atheist_2019;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Experiment;
import java.util.Random;

public enum Safety_Level
{
  LOW,  MODERATE,  HIGH;
 
  public static Safety_Level random(Agent agent)
  {
    return (Safety_Level)agent.randomFrom(Safety_Level.class);
  }
   public static Safety_Level random(Experiment<?> experiment)
  {
    return (Safety_Level)experiment.randomFrom(Safety_Level.class);
  }
   public static Safety_Level random(Random r)
  {
    return (Safety_Level)com.anylogic.engine.Utilities.randomFrom(Safety_Level.class, r);
  }
}
