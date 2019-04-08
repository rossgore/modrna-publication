package altruistic_atheist_2019;

public class ProsocialActionOppurtunity
{
  ProsocialActionType type;

  boolean actionWasTaken;
 
  WVGroup wvcAssociatedWithAction;
 
  public ProsocialActionOppurtunity(ProsocialActionType pType, WVGroup wvc)
  {
    type = pType;
    actionWasTaken = false;
    wvcAssociatedWithAction = wvc;
  }
  
  public ProsocialActionType getType()
  {
    return type;
  }
  

  public boolean wasActionTaken()
  {
    return actionWasTaken;
  }
  
  public void setWasActionTaken(boolean value) {
    actionWasTaken = value;
  }
  
  public boolean oppurtunityIsAssociatedWithWorldViewClub()
  {
    return wvcAssociatedWithAction != null;
  }
  
  public boolean oppurtunityIsAssociatedWithReligiousWorldViewClub()
  {
    if (wvcAssociatedWithAction.Flag == WVGroup_Type.SECULAR)
    {
      return false;
    }
    
    return true;
  }
}
