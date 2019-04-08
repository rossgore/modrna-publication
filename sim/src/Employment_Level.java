package altruistic_atheist_2019;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Experiment;
import java.util.Random;

public enum Employment_Level
{
  EMPLOYED,  NOT_EMPLOYED,  STUDENT;
 
  public static Employment_Level random(Agent agent)
  {
    return (Employment_Level)agent.randomFrom(Employment_Level.class);
  }
  

  public static Employment_Level random(Experiment<?> experiment)
  {
    return (Employment_Level)experiment.randomFrom(Employment_Level.class);
  }

  public static Employment_Level random(Random r)
  {
    return (Employment_Level)com.anylogic.engine.Utilities.randomFrom(Employment_Level.class, r);
  }
}
