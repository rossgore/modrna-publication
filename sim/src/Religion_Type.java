package altruistic_atheist_2019;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Experiment;
import java.util.Random;

public enum Religion_Type
{
  MINORITY,  MAJORITY;
 
  public static Religion_Type random(Agent agent)
  {
    return (Religion_Type)agent.randomFrom(Religion_Type.class);
  }
   public static Religion_Type random(Experiment<?> experiment)
  {
    return (Religion_Type)experiment.randomFrom(Religion_Type.class);
  }
   public static Religion_Type random(Random r)
  {
    return (Religion_Type)com.anylogic.engine.Utilities.randomFrom(Religion_Type.class, r);
  }
}
