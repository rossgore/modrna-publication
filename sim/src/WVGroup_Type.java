package altruistic_atheist_2019;

import com.anylogic.engine.Agent;
import com.anylogic.engine.Experiment;
import java.util.Random;

public enum WVGroup_Type
{
  SECULAR,  RELIGIOUS;
  public static WVGroup_Type random(Agent agent)
  {
    return (WVGroup_Type)agent.randomFrom(WVGroup_Type.class);
  }
  public static WVGroup_Type random(Experiment<?> experiment)
  {
    return (WVGroup_Type)experiment.randomFrom(WVGroup_Type.class);
  }
  public static WVGroup_Type random(Random r)
  {
    return (WVGroup_Type)com.anylogic.engine.Utilities.randomFrom(WVGroup_Type.class, r);
  }
}
