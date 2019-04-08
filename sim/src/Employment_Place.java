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
import com.anylogic.engine.Statechart;
import com.anylogic.engine.Transition;
import com.anylogic.engine.TransitionTimeout;
import com.anylogic.engine.elements.IElementDescriptor;
import com.anylogic.engine.presentation.LinkToAgentAnimator;
import com.anylogic.engine.presentation.ModelElementDescriptor;
import com.anylogic.engine.presentation.ShapeGroup;
import com.anylogic.engine.presentation.ShapeLine;
import com.anylogic.engine.presentation.ShapeModelElementsGroup;
import com.anylogic.engine.presentation.ShapePolyLine;
import com.anylogic.engine.presentation.ShapeTopLevelPresentationGroup;
import com.anylogic.engine.presentation.UtilitiesColor;
import com.anylogic.engine.presentation.ViewArea;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Employment_Place
  extends Agent
{
  public Neighbourhood Employment_Neighbourhood;
  public int Current_Employed;
  public int Number_Of_Jobs;
  public double Minority_Friendly;
  
  private static String[] _parameterNames_xjal;
  
  
  public Neighbourhood _Employment_Neighbourhood_DefaultValue_xjal()
  {
    Employment_Place self = this;
    return null;
  }
  
  public void set_Employment_Neighbourhood(Neighbourhood Employment_Neighbourhood) {
    if (Employment_Neighbourhood == this.Employment_Neighbourhood) {
      return;
    }
    Neighbourhood _oldValue_xjal = this.Employment_Neighbourhood;
    this.Employment_Neighbourhood = Employment_Neighbourhood;
    onChange_Employment_Neighbourhood_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_Employment_Neighbourhood()
  {
    onChange_Employment_Neighbourhood_xjal(Employment_Neighbourhood);
  }
  











  
  public int _Current_Employed_DefaultValue_xjal()
  {
    Employment_Place self = this;
    return 0;
  }
  
  public void set_Current_Employed(int Current_Employed) {
    if (Current_Employed == this.Current_Employed) {
      return;
    }
    int _oldValue_xjal = this.Current_Employed;
    this.Current_Employed = Current_Employed;
    onChange_Current_Employed_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_Current_Employed()
  {
    onChange_Current_Employed_xjal(Current_Employed);
  }
  











  
  public int _Number_Of_Jobs_DefaultValue_xjal()
  {
    Employment_Place self = this;
    return 0;
  }
  
  public void set_Number_Of_Jobs(int Number_Of_Jobs) {
    if (Number_Of_Jobs == this.Number_Of_Jobs) {
      return;
    }
    int _oldValue_xjal = this.Number_Of_Jobs;
    this.Number_Of_Jobs = Number_Of_Jobs;
    onChange_Number_Of_Jobs_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_Number_Of_Jobs()
  {
    onChange_Number_Of_Jobs_xjal(Number_Of_Jobs);
  }
  











  
  public double _Minority_Friendly_DefaultValue_xjal()
  {
    Employment_Place self = this;
    return 0.0D;
  }
  
  public void set_Minority_Friendly(double Minority_Friendly) {
    if (Minority_Friendly == this.Minority_Friendly) {
      return;
    }
    double _oldValue_xjal = this.Minority_Friendly;
    this.Minority_Friendly = Minority_Friendly;
    onChange_Minority_Friendly_xjal(_oldValue_xjal);
    onChange();
  }
  





  protected void onChange_Minority_Friendly()
  {
    onChange_Minority_Friendly_xjal(Minority_Friendly);
  }
  





  public void setParametersToDefaultValues()
  {
    super.setParametersToDefaultValues();
    Employment_Neighbourhood = _Employment_Neighbourhood_DefaultValue_xjal();
    Current_Employed = _Current_Employed_DefaultValue_xjal();
    Number_Of_Jobs = _Number_Of_Jobs_DefaultValue_xjal();
    Minority_Friendly = _Minority_Friendly_DefaultValue_xjal();
  }
  
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    String str;
    switch ((str = _name_xjal).hashCode()) {case -359261453:  if (str.equals("Current_Employed")) {} break; case 337680104:  if (str.equals("Number_Of_Jobs")) {} break; case 471777190:  if (str.equals("Employment_Neighbourhood")) break; break; case 1415088465:  if (!str.equals("Minority_Friendly")) {
        break label218;
        if (_callOnChange_xjal) {
          set_Employment_Neighbourhood((Neighbourhood)_value_xjal);
        } else {
          Employment_Neighbourhood = ((Neighbourhood)_value_xjal);
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_Current_Employed(((Number)_value_xjal).intValue());
        } else {
          Current_Employed = ((Number)_value_xjal).intValue();
        }
        return true;
        
        if (_callOnChange_xjal) {
          set_Number_Of_Jobs(((Number)_value_xjal).intValue());
        } else {
          Number_Of_Jobs = ((Number)_value_xjal).intValue();
        }
        return true;
      } else {
        if (_callOnChange_xjal) {
          set_Minority_Friendly(((Number)_value_xjal).doubleValue());
        } else {
          Minority_Friendly = ((Number)_value_xjal).doubleValue();
        }
        return true; }
      break; }
    label218: return super.setParameter(_name_xjal, _value_xjal, _callOnChange_xjal);
  }
  
  public <T> T getParameter(String _name_xjal)
  {
    String str;
    Object _result_xjal;
    switch ((str = _name_xjal).hashCode()) {case -359261453:  if (str.equals("Current_Employed")) {} break; case 337680104:  if (str.equals("Number_Of_Jobs")) {} break; case 471777190:  if (str.equals("Employment_Neighbourhood")) break; break; case 1415088465:  if (!str.equals("Minority_Friendly")) { break label137;
        Object _result_xjal = Employment_Neighbourhood; return _result_xjal;
        Object _result_xjal = Integer.valueOf(Current_Employed); return _result_xjal;
        Object _result_xjal = Integer.valueOf(Number_Of_Jobs); return _result_xjal;
      } else { _result_xjal = Double.valueOf(Minority_Friendly); }
      break; } label137: Object _result_xjal = super.getParameter(_name_xjal);
    
    return _result_xjal;
  }
  



  public String[] getParameterNames()
  {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList(Arrays.asList(super.getParameterNames()));
      list.add("Employment_Neighbourhood");
      list.add("Current_Employed");
      list.add("Number_Of_Jobs");
      list.add("Minority_Friendly");
      result = (String[])list.toArray(new String[list.size()]);
      _parameterNames_xjal = result;
    }
    return result; }
  
  
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors(Employment_Place.class);
  


  
  public Map<String, IElementDescriptor> getElementDesciptors() { return elementDesciptors_xjal; }
  
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale(10.0D);
  
  public Scale getScale()
  {
    return scale;
  }
  






  public Statechart<Employment_Place.statechart_Main_state> statechart_Main = new Statechart(this, (short)1);
  
  
  public String getNameOf(Statechart _s)
  {
    if (_s == statechart_Main) return "statechart_Main";
    return super.getNameOf(_s);
  }
  
  
  public void executeActionOf(Statechart _s)
  {
    if (_s == statechart_Main) {
      enterState(Initialize, true);
      return;
    }
    super.executeActionOf(_s);
  }


  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Employment_Place.statechart_Main_state Initialize = Employment_Place.statechart_Main_state.Initialize;
  @AnyLogicCustomProposalPriority(type=AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Employment_Place.statechart_Main_state Job_Size = Employment_Place.statechart_Main_state.Job_Size;
  
  
  private void enterState(Employment_Place.statechart_Main_state self, boolean _destination)
  {
    switch (self) {
    case Initialize: 
      logToDBEnterState(statechart_Main, self);
      
      statechart_Main.setActiveState_xjal(Initialize);
      transition.start();
      return;
    case Job_Size: 
      logToDBEnterState(statechart_Main, self);
      
      statechart_Main.setActiveState_xjal(Job_Size);
      
      Set_Number_Of_Jobs();
      Set_Minority_Friendly();
      
      return;
    }
    
  }
  
  
  private void exitState(Employment_Place.statechart_Main_state self, Transition _t, boolean _source)
  {
    switch (self) {
    case Initialize: 
      logToDBExitState(statechart_Main, self);
      logToDB(statechart_Main, _t, self);
      
      if ((!_source) || (_t != transition)) transition.cancel();
      return;
    case Job_Size: 
      logToDBExitState(statechart_Main, self);
      logToDB(statechart_Main, _t, self);
      
      return;
    }
    
  }
  
  
  private void exitInnerStates(Employment_Place.statechart_Main_state _destination)
  {
    Employment_Place.statechart_Main_state _state = (Employment_Place.statechart_Main_state)statechart_Main.getActiveSimpleState();
    while (_state != _destination) {
      exitState(_state, null, false);
      _state = (Employment_Place.statechart_Main_state)_state.getContainerState();
    }
  }
  
  public TransitionTimeout transition = new TransitionTimeout(this);
  
  
  public String getNameOf(TransitionTimeout _t)
  {
    if (_t == transition) return "transition";
    return super.getNameOf(_t);
  }
  
  
  public Statechart getStatechartOf(TransitionTimeout _t)
  {
    if (_t == transition) return statechart_Main;
    return super.getStatechartOf(_t);
  }
  
  
  public void executeActionOf(TransitionTimeout self)
  {
    if (self == transition) {
      exitState(Initialize, self, true);
      enterState(Job_Size, true);
      return;
    }
    super.executeActionOf(self);
  }
  
  
  public double evaluateTimeoutOf(TransitionTimeout _t)
  {
    if (_t == transition) {
      double _value = 
        1.0D;
      
      _value = toModelTime(_value, MILLISECOND);
      return _value;
    }
    return super.evaluateTimeoutOf(_t);
  }
  





  void Set_Number_Of_Jobs()
  {
    double empl_size = uniform(1.0D);
    int total_pop = 250 + get_MainNumber_of_Adults;
    if ((empl_size > 0.2D) && (empl_size <= 0.5D))
    {
      Number_Of_Jobs = uniform_discr(1, 19);
    }
    else if (empl_size <= 0.2D)
    {
      Number_Of_Jobs = uniform_discr(20, 45);
    }
    else if ((empl_size > 0.5D) && (empl_size <= 0.75D))
    {
      Number_Of_Jobs = uniform_discr(50, 249);
    }
    else if (empl_size > 0.75D)
    {
      Number_Of_Jobs = uniform_discr(250, total_pop);
    }
  }
  
  void Set_Minority_Friendly()
  {
    Minority_Friendly = triangular(0.0D, 1.0D, main.Accomodation_of_Difference);
  }
  
  public ViewArea _origin_VA = new ViewArea(this, "[Origin]", 0.0D, 0.0D, 1000.0D, 960.0D);
  
  
  public int getViewAreas(Map<String, ViewArea> _output) {
    if (_output != null) {
      _output.put("_origin_VA", _origin_VA);
    }
    return 1 + super.getViewAreas(_output); }
  
  protected static final Color __ps268_Fill_Color = new Color(1342177280, true);
  protected static final Color __ps269_Fill_Color = new Color(-6690304, true);
  protected static final Color __ps270_Fill_Color = new Color(-8140800, true);
  protected static final Color __ps271_Fill_Color = new Color(-9986560, true);
  protected static final Color __ps272_Fill_Color = new Color(-12491776, true);
  protected static final Color __ps273_Line_Color = new Color(-9986560, true);
  protected static final Color __ps274_Line_Color = new Color(-8140800, true);
  protected static final Color __ps275_Line_Color = new Color(-14667264, true);
  
  protected static final int __ps268 = 1;
  
  protected static final int __ps269 = 2;
  
  protected static final int __ps270 = 3;
  
  protected static final int __ps271 = 4;
  
  protected static final int __ps272 = 5;
  
  protected static final int __ps273 = 6;
  
  protected static final int __ps274 = 7;
  
  protected static final int __ps275 = 8;
  
  protected static final int _store = 9;
  
  protected static final int _SHAPE_NEXT_ID_xjal = 10;
  protected ShapePolyLine _ps268;
  
  
  public boolean isPublicPresentationDefined()
  {
    return true;
  }
  
  
  public boolean isEmbeddedAgentPresentationVisible(Agent _a) {
    return super.isEmbeddedAgentPresentationVisible(_a);
  }
  
  
  protected static final double[] __ps268_pointsDX_xjal() { return new double[] { 0.0D, 11.375D, 45.5D, 34.125D }; }
  
  
  protected static final double[] __ps268_pointsDY_xjal() {
    return new double[] { 0.0D, 5.692D, -11.385D, -17.077D };
  }
  
  
  protected static final double[] __ps268_pointsDZ_xjal() { return new double[] { 0.0D, 0.0D, 0.0D, 0.0D }; }
  
  
  protected static final double[] __ps269_pointsDX_xjal() {
    return new double[] { 0.0D, 34.125D, 0.0D, -34.125D };
  }
  
  
  protected static final double[] __ps269_pointsDY_xjal() { return new double[] { 0.0D, -17.077D, -34.154D, -17.077D }; }
  
  
  protected static final double[] __ps269_pointsDZ_xjal() {
    return new double[] { 0.0D, 0.0D, 0.0D, 0.0D };
  }
  
  
  protected static final double[] __ps270_pointsDX_xjal() { return new double[] { 0.0D, 0.0D, 34.125D, 34.125D }; }
  
  
  protected static final double[] __ps270_pointsDY_xjal() {
    return new double[] { 0.0D, -22.769D, -5.692D, 17.077D };
  }
  
  
  protected static final double[] __ps270_pointsDZ_xjal() { return new double[] { 0.0D, 0.0D, 0.0D, 0.0D }; }
  
  
  protected static final double[] __ps271_pointsDX_xjal() {
    return new double[] { 0.0D, 34.125D, 34.125D, 0.0D };
  }
  
  
  protected static final double[] __ps271_pointsDY_xjal() { return new double[] { 0.0D, -17.077D, -39.846D, -22.769D }; }
  
  
  protected static final double[] __ps271_pointsDZ_xjal() {
    return new double[] { 0.0D, 0.0D, 0.0D, 0.0D };
  }
  
  
  protected static final double[] __ps272_pointsDX_xjal() { return new double[] { 0.0D, 28.438D, 56.875D, 56.875D, 28.438D, 0.0D }; }
  
  
  protected static final double[] __ps272_pointsDY_xjal() {
    return new double[] { 0.0D, 14.231D, 0.0D, -14.231D, 0.0D, -14.231D };
  }
  
  
  protected static final double[] __ps272_pointsDZ_xjal() { return new double[] { 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D }; }
  
  
  protected static final double[] __ps275_pointsDX_xjal() {
    return new double[] { 0.0D, 34.125D, 34.125D, 0.0D, -34.125D, -34.125D };
  }
  
  
  protected static final double[] __ps275_pointsDY_xjal() { return new double[] { 0.0D, -17.077D, -39.846D, -56.923D, -39.846D, -17.077D }; }
  
  
  protected static final double[] __ps275_pointsDZ_xjal() {
    return new double[] { 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D };
  }

  
  private void _createPersistentElementsBP0_xjal()
  {
    _ps268 = new ShapePolyLine(
      SHAPE_DRAW_2D, true, 0.0D, 34.154D, 0.0D, null, __ps268_Fill_Color, 
      4, __ps268_pointsDX_xjal(), __ps268_pointsDY_xjal(), __ps268_pointsDZ_xjal(), true, 10.0D, 1.0D, LINE_STYLE_SOLID);
    
    _ps269 = new ShapePolyLine(
      SHAPE_DRAW_2D, true, 0.0D, 11.385D, 0.0D, null, __ps269_Fill_Color, 
      4, __ps269_pointsDX_xjal(), __ps269_pointsDY_xjal(), __ps269_pointsDZ_xjal(), true, 10.0D, 1.0D, LINE_STYLE_SOLID);
    
    _ps270 = new ShapePolyLine(
      SHAPE_DRAW_2D, true, -34.125D, 17.077D, 0.0D, null, __ps270_Fill_Color, 
      4, __ps270_pointsDX_xjal(), __ps270_pointsDY_xjal(), __ps270_pointsDZ_xjal(), true, 10.0D, 1.0D, LINE_STYLE_SOLID);
    
    _ps271 = new ShapePolyLine(
      SHAPE_DRAW_2D, true, 0.0D, 34.154D, 0.0D, null, __ps271_Fill_Color, 
      4, __ps271_pointsDX_xjal(), __ps271_pointsDY_xjal(), __ps271_pointsDZ_xjal(), true, 10.0D, 1.0D, LINE_STYLE_SOLID);
    
    _ps272 = new ShapePolyLine(
      SHAPE_DRAW_2D, true, -28.437D, 19.923D, 0.0D, null, __ps272_Fill_Color, 
      6, __ps272_pointsDX_xjal(), __ps272_pointsDY_xjal(), __ps272_pointsDZ_xjal(), true, 10.0D, 1.0D, LINE_STYLE_SOLID);
    
    _ps273 = new ShapeLine(
      SHAPE_DRAW_2D, true, 5.688D, 31.308D, 0.0D, __ps273_Line_Color, 
      0.0D, -18.0D, 0.0D, 1.0D, 10.0D, LINE_STYLE_SOLID);
    
    _ps274 = new ShapeLine(
      SHAPE_DRAW_2D, true, -5.687D, 31.308D, 0.0D, __ps274_Line_Color, 
      0.0D, -18.0D, 0.0D, 1.0D, 10.0D, LINE_STYLE_SOLID);
    
    _ps275 = new ShapePolyLine(
      SHAPE_DRAW_2D, true, 0.0D, 34.154D, 0.0D, __ps275_Line_Color, null, 
      6, __ps275_pointsDX_xjal(), __ps275_pointsDY_xjal(), __ps275_pointsDZ_xjal(), true, 10.0D, 1.0D, LINE_STYLE_SOLID);
  }
  

  
  private void _createPersistentElementsAP0_xjal()
  {
    store = new ShapeGroup(this, SHAPE_DRAW_2D, true, 0.0D, 0.0D, 0.0D, 0.0D, new Object[] {
    
      _ps268, 
      _ps269, 
      _ps270, 
      _ps271, 
      _ps272, 
      _ps273, 
      _ps274, 
      _ps275 });
  }
  

  protected ShapePolyLine _ps269;
  
  protected ShapePolyLine _ps270;
  protected ShapePolyLine _ps271;
  protected ShapePolyLine _ps272;
  protected ShapeLine _ps273;
  protected ShapeLine _ps274;
  protected ShapePolyLine _ps275;
  protected ShapeGroup store;
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon;
  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient Main main;
  
  public ShapeTopLevelPresentationGroup getPresentationShape()
  {
    return presentation;
  }
  
  
  public ShapeModelElementsGroup getModelElementsShape()
  {
    return icon;
  }
  


  public Employment_Place(Engine engine, Agent owner, AgentList<? extends Employment_Place> ownerPopulation)
  {
    super(engine, owner, ownerPopulation);_createPersistentElementsBP0_xjal();

    connections = new LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);instantiateBaseStructureThis_xjal();
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
  
  public Employment_Place(Neighbourhood Employment_Neighbourhood, int Current_Employed, int Number_Of_Jobs, double Minority_Friendly)
  {
    _createPersistentElementsBP0_xjal();

    connections = new LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);markParametersAreSet();this.Employment_Neighbourhood = Employment_Neighbourhood;this.Current_Employed = Current_Employed;this.Number_Of_Jobs = Number_Of_Jobs;this.Minority_Friendly = Minority_Friendly;
  }
  
  
  public void doCreate()
  {
    super.doCreate();
    
    setupPlainVariables_Employment_Place_xjal();
    
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup(this, true, 0.0D, 0.0D, 0.0D, 0.0D, new Object[] { store });
    icon = new ShapeModelElementsGroup(this, (ModelElementDescriptor[])getElementProperty("altruistic_atheist_2019.Employment_Place.icon", "modelElementDescriptors"), new Object[0]);
    icon.setIconOffsets(0.0D, 0.0D);
    

    setupInitialConditions_xjal(Employment_Place.class);
    
    _createPersistentElementsBS0_xjal();
  }
  
  
  public void doStart()
  {
    super.doStart();
    statechart_Main.start();
  }
  




  
  public void setupPlainVariables_xjal()
  {
    setupPlainVariables_Employment_Place_xjal();
  }
  









  public Main get_Main()
  {
    Agent owner = getOwner();
    if ((owner instanceof Main)) { return (Main)owner;
    }
    return null;
  }

  static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl(false, UtilitiesColor.black, 1.0D, LINE_STYLE_SOLID, ARROW_NONE, 0.0D);
  public LinkToAgentCollection<Agent, Agent> connections;
  
  private static final long serialVersionUID = 587905940445770746L;
  
  public Employment_Place()
  {
    _createPersistentElementsBP0_xjal();

    connections = new LinkToAgentStandardImpl(this, _connections_commonAnimationSettings_xjal);
  }
  
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() { return connections; }
  
  
  public void onReceive(Object _msg_xjal, Agent _sender_xjal)
  {
    super.onReceive(_msg_xjal, _sender_xjal);
    statechart_Main.fireEvent(_msg_xjal);
  }
  

  
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal)
  {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if (_underAgents_xjal) {
      _animator_xjal.drawLink(this, connections, true, true);
    }
  }
  
  public AgentList<? extends Employment_Place> getPopulation() {
    return super.getPopulation();
  }
  
  public List<? extends Employment_Place> agentsInRange(double distance) {
    return super.agentsInRange(distance);
  }
  
  public void onChange()
  {
    super.onChange();
    statechart_Main.onChange();
  }
  
  
  public void onDestroy() {
    statechart_Main.onDestroy();
    super.onDestroy();
  }
  
  
  protected void onChange_Employment_Neighbourhood_xjal(Neighbourhood oldValue) {}
  
  
  protected void onChange_Current_Employed_xjal(int oldValue) {}
  
  
  protected void onChange_Number_Of_Jobs_xjal(int oldValue) {}
  
  
  protected void onChange_Minority_Friendly_xjal(double oldValue) {}
  
  
  private void _createPersistentElementsBS0_xjal() {}
  
  
  private void setupPlainVariables_Employment_Place_xjal() {}
}
