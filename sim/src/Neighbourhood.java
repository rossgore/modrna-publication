package altruistic_atheist_2019;

import com.anylogic.engine.Agent;
import com.anylogic.engine.AgentList;
import com.anylogic.engine.AnyLogicCustomProposalPriority;
import com.anylogic.engine.AnyLogicCustomProposalPriority.Type;
import com.anylogic.engine.AnyLogicCustomSerialization;
import com.anylogic.engine.AnyLogicCustomSerializationMode;
import com.anylogic.engine.AnyLogicInternalCodegenAPI;
import com.anylogic.engine.Engine;
import com.anylogic.engine.LinkToAgentAnimationSettings;
import com.anylogic.engine.LinkToAgentAnimationSettingsImpl;
import com.anylogic.engine.LinkToAgentCollection;
import com.anylogic.engine.LinkToAgentStandardImpl;
import com.anylogic.engine.Scale;
import com.anylogic.engine.elements.IElementDescriptor;
import com.anylogic.engine.presentation.LinkToAgentAnimator;
import com.anylogic.engine.presentation.ModelElementDescriptor;
import com.anylogic.engine.presentation.ShapeModelElementsGroup;
import com.anylogic.engine.presentation.ShapeTopLevelPresentationGroup;
import com.anylogic.engine.presentation.UtilitiesColor;
import com.anylogic.engine.presentation.ViewArea;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Neighbourhood
  extends Agent
{
  public double Number_Of_Employment_Places;
  public Safety_Level Safety;
  public double Average_Price_Of_Home;
  public double Number_Of_MinorityReligion_Centers;
  public double Number_Of_MajorityReligion_Centers;
  
  private static String[] _parameterNames_xjal;
  
  
  public double _Number_Of_Employment_Places_DefaultValue_xjal()
  {
    Neighbourhood self = this;
    return 0.0D;
  }
  
  public void set_Number_Of_Employment_Places(double Number_Of_Employment_Places) {
    if (Number_Of_Employment_Places == this.Number_Of_Employment_Places) {
      return;
    }
    double _oldValue_xjal = this.Number_Of_Employment_Places;
    this.Number_Of_Employment_Places = Number_Of_Employment_Places;
    onChange_Number_Of_Employment_Places_xjal(_oldValue_xjal);
    onChange();
  }
  protected void onChange_Number_Of_Employment_Places()
  {
    onChange_Number_Of_Employment_Places_xjal(Number_Of_Employment_Places);
  }

  
  protected void onChange_Number_Of_Employment_Places_xjal(double oldValue) {}

  
  public Safety_Level _Safety_DefaultValue_xjal()
  {
    Neighbourhood self = this;
    return null;
  }
  
  public void set_Safety(Safety_Level Safety) {
    if (Safety == this.Safety) {
      return;
    }
    Safety_Level _oldValue_xjal = this.Safety;
    this.Safety = Safety;
    onChange_Safety_xjal(_oldValue_xjal);
    onChange();
  }

  protected void onChange_Safety()
  {
    onChange_Safety_xjal(Safety);
  }

  
  protected void onChange_Safety_xjal(Safety_Level oldValue) {}

  
  public double _Average_Price_Of_Home_DefaultValue_xjal()
  {
    Neighbourhood self = this;
    return 0.0D;
  }
  
  public void set_Average_Price_Of_Home(double Average_Price_Of_Home) {
    if (Average_Price_Of_Home == this.Average_Price_Of_Home) {
      return;
    }
    double _oldValue_xjal = this.Average_Price_Of_Home;
    this.Average_Price_Of_Home = Average_Price_Of_Home;
    onChange_Average_Price_Of_Home_xjal(_oldValue_xjal);
    onChange();
  }

  protected void onChange_Average_Price_Of_Home()
  {
    onChange_Average_Price_Of_Home_xjal(Average_Price_Of_Home);
  }

  
  protected void onChange_Average_Price_Of_Home_xjal(double oldValue) {}

  
  public double _Number_Of_MinorityReligion_Centers_DefaultValue_xjal()
  {
    Neighbourhood self = this;
    return 0.0D;
  }
  
  public void set_Number_Of_MinorityReligion_Centers(double Number_Of_MinorityReligion_Centers) {
    if (Number_Of_MinorityReligion_Centers == this.Number_Of_MinorityReligion_Centers) {
      return;
    }
    double _oldValue_xjal = this.Number_Of_MinorityReligion_Centers;
    this.Number_Of_MinorityReligion_Centers = Number_Of_MinorityReligion_Centers;
    onChange_Number_Of_MinorityReligion_Centers_xjal(_oldValue_xjal);
    onChange();
  }

  protected void onChange_Number_Of_MinorityReligion_Centers()
  {
    onChange_Number_Of_MinorityReligion_Centers_xjal(Number_Of_MinorityReligion_Centers);
  }

  
  protected void onChange_Number_Of_MinorityReligion_Centers_xjal(double oldValue) {}

  
  public double _Number_Of_MajorityReligion_Centers_DefaultValue_xjal()
  {
    Neighbourhood self = this;
    return 0.0D;
  }
  
  public void set_Number_Of_MajorityReligion_Centers(double Number_Of_MajorityReligion_Centers) {
    if (Number_Of_MajorityReligion_Centers == this.Number_Of_MajorityReligion_Centers) {
      return;
    }
    double _oldValue_xjal = this.Number_Of_MajorityReligion_Centers;
    this.Number_Of_MajorityReligion_Centers = Number_Of_MajorityReligion_Centers;
    onChange_Number_Of_MajorityReligion_Centers_xjal(_oldValue_xjal);
    onChange();
  }

  protected void onChange_Number_Of_MajorityReligion_Centers()
  {
    onChange_Number_Of_MajorityReligion_Centers_xjal(Number_Of_MajorityReligion_Centers);
  }

  protected void onChange_Number_Of_MajorityReligion_Centers_xjal(double oldValue) {}
  
  public void setParametersToDefaultValues()
  {
    super.setParametersToDefaultValues();
    Number_Of_Employment_Places = _Number_Of_Employment_Places_DefaultValue_xjal();
    Safety = _Safety_DefaultValue_xjal();
    Average_Price_Of_Home = _Average_Price_Of_Home_DefaultValue_xjal();
    Number_Of_MinorityReligion_Centers = _Number_Of_MinorityReligion_Centers_DefaultValue_xjal();
    Number_Of_MajorityReligion_Centers = _Number_Of_MajorityReligion_Centers_DefaultValue_xjal();
  }
  
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    String str;
    switch ((str = _name_xjal).hashCode()) {case -1992666597:  if (str.equals("Number_Of_MinorityReligion_Centers")) {} break; case -1826026766:  if (str.equals("Safety")) break; break; case -841780625:  if (str.equals("Average_Price_Of_Home")) {} break; case 496410007:  if (str.equals("Number_Of_MajorityReligion_Centers")) {} case 1998589645:  if ((goto 270) && (str.equals("Number_Of_Employment_Places")))
      {
        if (_callOnChange_xjal) {
          set_Number_Of_Employment_Places(((Number)_value_xjal).doubleValue());
        } else {
          Number_Of_Employment_Places = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_Safety((Safety_Level)_value_xjal);
        } else {
          Safety = ((Safety_Level)_value_xjal);
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_Average_Price_Of_Home(((Number)_value_xjal).doubleValue());
        } else {
          Average_Price_Of_Home = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_Number_Of_MinorityReligion_Centers(((Number)_value_xjal).doubleValue());
        } else {
          Number_Of_MinorityReligion_Centers = ((Number)_value_xjal).doubleValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_Number_Of_MajorityReligion_Centers(((Number)_value_xjal).doubleValue());
        } else {
          Number_Of_MajorityReligion_Centers = ((Number)_value_xjal).doubleValue();
        }
        return true; }
      break; }
    return super.setParameter(_name_xjal, _value_xjal, _callOnChange_xjal);
  }
  
  public <T> T getParameter(String _name_xjal)
  {
    String str;
    Object _result_xjal;
    switch ((str = _name_xjal).hashCode()) {case -1992666597:  if (str.equals("Number_Of_MinorityReligion_Centers")) {} break; case -1826026766:  if (str.equals("Safety")) break; break; case -841780625:  if (str.equals("Average_Price_Of_Home")) {} break; case 496410007:  if (str.equals("Number_Of_MajorityReligion_Centers")) {} case 1998589645:  if ((goto 168) && (str.equals("Number_Of_Employment_Places"))) {
        Object _result_xjal = Double.valueOf(Number_Of_Employment_Places); return _result_xjal;
        Object _result_xjal = Safety; return _result_xjal;
        Object _result_xjal = Double.valueOf(Average_Price_Of_Home); return _result_xjal;
        Object _result_xjal = Double.valueOf(Number_Of_MinorityReligion_Centers); return _result_xjal;
        _result_xjal = Double.valueOf(Number_Of_MajorityReligion_Centers); }
      break; } Object _result_xjal = super.getParameter(_name_xjal);
    
    return _result_xjal;
  }

  public String[] getParameterNames()
  {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList(Arrays.asList(super.getParameterNames()));
      list.add("Number_Of_Employment_Places");
      list.add("Safety");
      list.add("Average_Price_Of_Home");
      list.add("Number_Of_MinorityReligion_Centers");
      list.add("Number_Of_MajorityReligion_Centers");
      result = (String[])list.toArray(new String[list.size()]);
      _parameterNames_xjal = result;
    }
    return result; }

  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors(Neighbourhood.class);

  public Map<String, IElementDescriptor> getElementDesciptors() { return elementDesciptors_xjal; }
  
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale(10.0D);
  
  public Scale getScale()
  {
    return scale;
  }
  public ViewArea _origin_VA = new ViewArea(this, "[Origin]", 0.0D, 0.0D, 1000.0D, 960.0D);
  
  
  public int getViewAreas(Map<String, ViewArea> _output) {
    if (_output != null) {
      _output.put("_origin_VA", _origin_VA);
    }
    return 1 + super.getViewAreas(_output);
  }

  public boolean isPublicPresentationDefined()
  {
    return false;
  }

  public boolean isEmbeddedAgentPresentationVisible(Agent _a) {
    return super.isEmbeddedAgentPresentationVisible(_a);
  }

  protected static final int _SHAPE_NEXT_ID_xjal = 1;
  
  public ShapeTopLevelPresentationGroup getPresentationShape()
  {
    return presentation;
  }

  public ShapeModelElementsGroup getModelElementsShape()
  {
    return icon;
  }

  public Neighbourhood(Engine engine, Agent owner, AgentList<? extends Neighbourhood> ownerPopulation)
  {
    super(engine, owner, ownerPopulation);
    instantiateBaseStructureThis_xjal();
  }

  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }

  private void instantiateBaseStructureThis_xjal() {
    setupReferences_xjal();
  }

  private void setupReferences_xjal() {
    main = get_Main();
  }

  protected ShapeTopLevelPresentationGroup presentation;

  public Neighbourhood() {}

  public Neighbourhood(double Number_Of_Employment_Places, Safety_Level Safety, double Average_Price_Of_Home, double Number_Of_MinorityReligion_Centers, double Number_Of_MajorityReligion_Centers)
  {
    markParametersAreSet();
    this.Number_Of_Employment_Places = Number_Of_Employment_Places;
    this.Safety = Safety;
    this.Average_Price_Of_Home = Average_Price_Of_Home;
    this.Number_Of_MinorityReligion_Centers = Number_Of_MinorityReligion_Centers;
    this.Number_Of_MajorityReligion_Centers = Number_Of_MajorityReligion_Centers;
  }

  public void doCreate()
  {
    super.doCreate();
    
    setupPlainVariables_Neighbourhood_xjal();
    
    presentation = new ShapeTopLevelPresentationGroup(this, true, 0.0D, 0.0D, 0.0D, 0.0D, new Object[0]);
    icon = new ShapeModelElementsGroup(this, (ModelElementDescriptor[])getElementProperty("altruistic_atheist_2019.Neighbourhood.icon", "modelElementDescriptors"), new Object[0]);
    icon.setIconOffsets(0.0D, 0.0D);
    

    setupInitialConditions_xjal(Neighbourhood.class);
  }

  public void doStart()
  {
    super.doStart();
  }

  public void setupPlainVariables_xjal()
  {
    setupPlainVariables_Neighbourhood_xjal();
  }

  private void setupPlainVariables_Neighbourhood_xjal() {}

  public Main get_Main()
  {
    Agent owner = getOwner();
    if ((owner instanceof Main)) { return (Main)owner;
    }
    return null;
  }
  
  protected ShapeModelElementsGroup icon;
  
  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient Main main;
  
  static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl(false, UtilitiesColor.black, 1.0D, LINE_STYLE_SOLID, ARROW_NONE, 0.0D);
  
  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);
  

  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() { return connections; }
  
  
  private static final long serialVersionUID = -6773409993092341065L;
  
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if (_underAgents_xjal) {
      _animator_xjal.drawLink(this, connections, true, true);
    }
  }
  
  public AgentList<? extends Neighbourhood> getPopulation() {
    return super.getPopulation();
  }
  
  public List<? extends Neighbourhood> agentsInRange(double distance) {
    return super.agentsInRange(distance);
  }
}
