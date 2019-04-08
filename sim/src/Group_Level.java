package altruistic_atheist_2019;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Experiment;
import java.util.Random;

public enum Group_Level
{
  MAJORITY_GROUP,  MINORITY_GROUP;
  

  public static Group_Level random(Agent agent)
  {
    return (Group_Level)agent.randomFrom(Group_Level.class);
  }
 
  public static Group_Level random(Experiment<?> experiment)
  {
    return (Group_Level)experiment.randomFrom(Group_Level.class);
  }

  public static Group_Level random(Random r)
  {
    return (Group_Level)com.anylogic.engine.Utilities.randomFrom(Group_Level.class, r);
  }
}
