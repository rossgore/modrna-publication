package altruistic_atheist_2019;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Experiment;
import java.util.Random;

public enum Gender_List
{
  MALE,  FEMALE;
 
  public static Gender_List random(Agent agent)
  {
    return (Gender_List)agent.randomFrom(Gender_List.class);
  }
 
  public static Gender_List random(Experiment<?> experiment)
  {
    return (Gender_List)experiment.randomFrom(Gender_List.class);
  }
 
  public static Gender_List random(Random r)
  {
    return (Gender_List)com.anylogic.engine.Utilities.randomFrom(Gender_List.class, r);
  }
}
