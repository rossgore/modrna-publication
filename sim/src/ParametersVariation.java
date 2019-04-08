package altruistic_atheist_2019;

import com.anylogic.engine.AnyLogicInternalCodegenAPI;
import com.anylogic.engine.Engine;
import com.anylogic.engine.ExperimentParamVariation;
import com.anylogic.engine.elements.IElementDescriptor;
import com.anylogic.engine.gui.ExperimentHost;
import com.anylogic.engine.gui.IExperimentHost;
import com.anylogic.engine.presentation.ModelElementDescriptor;
import com.anylogic.engine.presentation.ShapeButton;
import com.anylogic.engine.presentation.ShapeModelElementsGroup;
import com.anylogic.engine.presentation.ShapeTopLevelPresentationGroup;
import com.anylogic.engine.presentation.UtilitiesColor;
import java.awt.Font;
import java.util.Map;
import java.util.Random;

public class ParametersVariation
  extends ExperimentParamVariation<Main>
{
  
  public static String[] COMMAND_LINE_ARGUMENTS_xjal = new String[0];
  
  public ParametersVariation() { setCommandLineArguments_xjal(COMMAND_LINE_ARGUMENTS_xjal); }
  
  
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors(ParametersVariation.class);
  
  
  public Map<String, IElementDescriptor> getElementDesciptors()
  {
    return elementDesciptors_xjal;
  }
  
  
  protected static final Font _button_Font = new Font("Dialog", 0, 11);
  
  
  protected static final int _button = 1;
  
  protected static final int _SHAPE_NEXT_ID_xjal = 2;
  protected ShapeButton button;
  protected ShapeTopLevelPresentationGroup presentation;
  
  
  public void executeShapeControlAction(int _shape, int index)
  {
    switch (_shape) {
    case 1: 
      ShapeButton self = button;
      run();
      
      break;
    default: 
      super.executeShapeControlAction(_shape, index); }
  }
  
  protected ShapeModelElementsGroup icon;
  
  private static final long serialVersionUID = -8493083277635847343L;
  public double Majority_Minority_Split;
  public double Gender_Percentage_Female;
  public int Number_of_Children;
  
  
  private void _button_SetDynamicParams_xjal(ShapeButton shape) { shape.setEnabled(
      getState() == IDLE);
  }
  
  public int Number_of_Adults;
  public double Marriage_Rate;
  
  
  private void _createPersistentElementsBP0_xjal() { button = new ParametersVariation.1(this, 
      this, true, 50.0D, 70.0D, 
      100.0D, 30.0D, 
      UtilitiesColor.controlDefault, true, 
      _button_Font, 
      "Run");
  }
  

  public int Interaction_Radius;
  public double Minimum_Age_Marriage_Minority;
  public double Minimum_Age_Marriage_Majority;
  public int Marriage_Age_Tolerance;
  public int Marriage_Education_Tolerance;
  public int Age_Kink_Majority;
  public int Age_Cutoff_Majority;
  public double Percent_Minority_Male_Employed;
  public double Percent_Majority_Male_Employed;
  public double Percent_Minority_Female_Employed;
  public double Percent_Majority_Female_Employed;
  public int Education_Kink_Majority;
  public int Education_Cutoff_Majority;
  public int Age_Cutoff_Minority;
  public int Age_Kink_Minority;
  public int Education_Kink_Minority;
  public int Education_Cutoff_Minority;
  public int Nativity_Cutoff;
  public double Income_Median_In_Hundred_Thousands;
  public double Income_Skew_In_Hundred_Thousands;
  public double Income_Min_In_Hundred_Thousands;
  public double Religion_Shift_Marriage;
  
  
  private void _createPersistentElementsAP0_xjal() {}
  
  
  private void _createPersistentElementsBS0_xjal() {}
  
  
  public ShapeTopLevelPresentationGroup getPresentationShape()
  {
    return presentation;
  }
  
  
  public ShapeModelElementsGroup getModelElementsShape()
  {
    return icon;
  }
  
  public int getWindowWidth()
  {
    return 1000;
  }
  
  public int getWindowHeight()
  {
    return 960;
  }
  
  
  public void onDestroy_xjal()
  {
    super.onDestroy_xjal();
  }
  

  
  public static void main(String[] args)
  {
    COMMAND_LINE_ARGUMENTS_xjal = args;
    prepareBeforeExperimentStart_xjal(ParametersVariation.class);
    ParametersVariation ex = new ParametersVariation();
    ex.setCommandLineArguments_xjal(args);
    
    IExperimentHost host = new ExperimentHost(ex);
    
    ex.setup(host);
    
    host.launch();
  }
  





  
  public void initDefaultRandomNumberGenerator(Engine _e)
  {
    _e.setDefaultRandomGenerator(new Random());
  }
  

  public double Religion_Shift_Marriage_To_Majority;
  
  public double Endogamy_Degree;
  
  public double Majority_Suspicion_Of_Minorty_Mean;
  
  public double Majority_Suspicion_Of_Minorty_Std_Dev;
  
  public double Minority_Suspicion_Of_Majority_Mean;
  
  public double Minority_Suspicion_Of_Majority_Std_Dev;
  
  public double Ingroup_Support_Majority_Mean;
  
  public double Ingroup_Support_Majority_Std_Dev;
  
  public double Ingroup_Support_Minority_Mean;
  
  public double Ingroup_Support_Minority_Std_Dev;
  
  public double Marriage_Conversion_Rate;
  
  public double Death_Probability_Prior_To_Kink;
  
  public int Number_Of_Employers;
  
  public double Accomodation_of_Difference;
  
  public double Minority_Friendly;
  
  public double Enforced_Antidiscrimination;
  
  public double Shared_Norms_Mean;
  
  public double Shared_Norms_Std_Dev;
  
  public int Impersonal_Radius;
  
  public double Employment_Change_Pct_Majority;
  
  public int LHS_Experiment_Number;
  
  public boolean LHS_Exp_Running;
  
  public String[] OutPutFilesNames;
  
  public double Authority_Impact;
  
  public double Minimum_Group_Cost;
  
  public double Perc_Pop_No_Group;
  
  public double Perc_Min_Religious;
  
  public double Perc_Maj_Religious;
  
  public double Honesty_Mean;
  
  public double Agreeableness_Mean;
  
  public double Extraversion_Mean;
  
  public double Frustation_Mode;
  public double Openness_Mean;
  public double Conscientiousness_Mean;
  public double Emotionality_Mean;
  public double Honesty_SD;
  public double Agreeableness_SD;
  public double Extraversion_SD;
  public double Frustation_Min_Max;
  public double Openness_SD;
  public double Conscientiousness_SD;
  public double Emotionality_SD;
  public double Hus_Joins_Wife_WVGr_Maj;
  public double H_J_W_NoGr_NoCh_Maj;
  public double Wif_Joins_Hus_WVGrMaj;
  public double W_J_H_NoGr_NoCh_Maj;
  public double NoGr_Change_Maj;
  public double Hus_Joins_Wife_WVGr_Min;
  public double H_J_W_NoGr_NoCh_Min;
  public double Wif_Joins_Hus_WVGrMin;
  public double W_J_H_NoGr_NoCh_Min;
  public double NoGr_Change_Min;
  public double Hus_Joins_Wife_WVGr_MajMin;
  public double H_J_W_NoGr_NoCh_MajMin;
  public double Wif_Joins_Hus_WVGrMajMin;
  public double W_J_H_NoGr_NoCh_MajMin;
  public double NoGr_Change_MajMin;
  public double Honest_Heritability;
  public double Agreeableness_Heritability;
  public double Extraversion_Heritability;
  public double Conscientiousness_Heritability;
  public double Emotionality_Heritability;
  public double Openness_Heritability;
  public double Prob_WVGroup_From_Mother;
  public double CRED_Impact_MyLeader;
  public double CRED_Impact_OtherLeader;
  public double CRED_Impact_SharedWVOrGroupType;
  public double CRED_Impact_SharedRel_But_Diff_Type;
  public double CRED_DisplayConsistency_Error;
  public double CRED_Update_WV;
  public double CRED_ProbMeetingLeader;
  public int Min_Leader_Age;
  public double CRED_Memory_Decay_Rate;
  public double Charisma_Threshold;
  public double Threat_Threshold;
  public double Secular_Group_Tolerance_Range;
  public double Initial_Percentage_Sec_Affiliated;
  public double Prob_Coeff_Joining_Opposit_WVClub;
  public double CRED_Prob_Curve_Consciousness;
  public double CRED_Prob_Curve_Frustation;
  public double CRED_Prob_Curve_Club_Consistency;
  public double CRED_Limit_Curve_Club_Consistency;
  public int Number_Of_Sec_Groups;
  public int Number_Of_Rel_Maj_Groups;
  public int Number_Of_Rel_Min_Groups;
  public double CRED_Rel_Exemplar_Impact;
  public double CRED_Sec_Exemplar_Impact;
  public double CRED_Rel_Group_Cost;
  public double CRED_Sec_Group_Cost;
  public double CRED_Prob_Curve_CredToCrud;
  public double PC_WV_dist_Threshold;
  public double Mother_WV_Importance;
  public double ThreatEnhancer_DueTo_PCWV_dist;
  public double CRED_Update_Fr_Inc;
  public double CRED_Update_Fr_Dec;
  public double Min_Hypoc_Th;
  public double Min_Join_Th;
  public boolean SUPERNATURAL_BIAS_ON_PERSONAL_LOSS;
  public int MAX_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS;
  public int MIN_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS;
  public int MAX_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS;
  public int MIN_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS;
  public double chanceWVCMemberWouldAct;
  public double chanceOfHistoryOfRespectiveProSocialAction;
  public double MIN_RELIGIOUS_WORLD_VIEW;
  public double MAX_RELIGIOUS_WORLD_VIEW;
  public double MIN_NON_RELIGIOUS_WORLD_VIEW;
  public double MAX_NON_RELIGIOUS_WORLD_VIEW;
  
  public void setupEngine(Engine engine)
  {
    engine.setATOL(1.0E-5D);
    engine.setRTOL(1.0E-5D);
    engine.setTTOL(1.0E-5D);
    engine.setHTOL(0.001D);
    engine.setSolverODE(Engine.SOLVER_ODE_EULER);
    engine.setSolverNAE(Engine.SOLVER_NAE_MODIFIED_NEWTON);
    engine.setSolverDAE(Engine.SOLVER_DAE_RK45_NEWTON);
    engine.setVMethods(Integer.valueOf(427313));
    engine.setSimultaneousEventsSelectionMode(Engine.EVENT_SELECTION_LIFO);
    
    engine.setStartTime(0.0D);
    engine.setTimeUnit(WEEK);
    engine.setStartDate(toDate(2017, 4, 13, 0, 0, 0));
    engine.setStopTime(521.0D);
  }
  



  
  public void setup(IExperimentHost _e)
  {
    setName("Acculturation_ABM4_GIS21 Debugging 2018 Feb 2 : ParametersVariation");
    

    _createPersistentElementsBP0_xjal();
    

    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup(this, true, 0.0D, 0.0D, 0.0D, 0.0D, new Object[] { button });
    
    _createPersistentElementsBS0_xjal();
    icon = new ShapeModelElementsGroup(this, (ModelElementDescriptor[])getElementProperty("altruistic_atheist_2019.ParametersVariation.icon", "modelElementDescriptors"), new Object[0]);
    _e.setZoomAndPanningEnabled(true);
    _e.setDeveloperPanelEnabled(true);
    _e.setDeveloperPanelVisibleOnStart(false);
  }
  

  
  public Main createRoot(Engine engine)
  {
    return new Main(engine, null, null);
  }
  
  
  public void onBeforeSimulationRun(Main root)
  {
    Majority_Minority_Split = Majority_Minority_Split;
    Gender_Percentage_Female = Gender_Percentage_Female;
    Number_of_Children = Number_of_Children;
    Number_of_Adults = Number_of_Adults;
    Marriage_Rate = Marriage_Rate;
    Interaction_Radius = Interaction_Radius;
    Minimum_Age_Marriage_Minority = Minimum_Age_Marriage_Minority;
    Minimum_Age_Marriage_Majority = Minimum_Age_Marriage_Majority;
    Marriage_Age_Tolerance = Marriage_Age_Tolerance;
    Marriage_Education_Tolerance = Marriage_Education_Tolerance;
    Age_Kink_Majority = Age_Kink_Majority;
    Age_Cutoff_Majority = Age_Cutoff_Majority;
    Percent_Minority_Male_Employed = Percent_Minority_Male_Employed;
    Percent_Majority_Male_Employed = Percent_Majority_Male_Employed;
    Percent_Minority_Female_Employed = Percent_Minority_Female_Employed;
    Percent_Majority_Female_Employed = Percent_Majority_Female_Employed;
    Education_Kink_Majority = Education_Kink_Majority;
    Education_Cutoff_Majority = Education_Cutoff_Majority;
    Age_Cutoff_Minority = Age_Cutoff_Minority;
    Age_Kink_Minority = Age_Kink_Minority;
    Education_Kink_Minority = Education_Kink_Minority;
    Education_Cutoff_Minority = Education_Cutoff_Minority;
    Nativity_Cutoff = Nativity_Cutoff;
    Income_Median_In_Hundred_Thousands = Income_Median_In_Hundred_Thousands;
    Income_Skew_In_Hundred_Thousands = Income_Skew_In_Hundred_Thousands;
    Income_Min_In_Hundred_Thousands = Income_Min_In_Hundred_Thousands;
    Religion_Shift_Marriage = Religion_Shift_Marriage;
    Religion_Shift_Marriage_To_Majority = Religion_Shift_Marriage_To_Majority;
    Endogamy_Degree = Endogamy_Degree;
    Majority_Suspicion_Of_Minorty_Mean = Majority_Suspicion_Of_Minorty_Mean;
    Majority_Suspicion_Of_Minorty_Std_Dev = Majority_Suspicion_Of_Minorty_Std_Dev;
    Minority_Suspicion_Of_Majority_Mean = Minority_Suspicion_Of_Majority_Mean;
    Minority_Suspicion_Of_Majority_Std_Dev = Minority_Suspicion_Of_Majority_Std_Dev;
    Ingroup_Support_Majority_Mean = Ingroup_Support_Majority_Mean;
    Ingroup_Support_Majority_Std_Dev = Ingroup_Support_Majority_Std_Dev;
    Ingroup_Support_Minority_Mean = Ingroup_Support_Minority_Mean;
    Ingroup_Support_Minority_Std_Dev = Ingroup_Support_Minority_Std_Dev;
    Marriage_Conversion_Rate = Marriage_Conversion_Rate;
    Death_Probability_Prior_To_Kink = Death_Probability_Prior_To_Kink;
    Number_Of_Employers = Number_Of_Employers;
    Accomodation_of_Difference = Accomodation_of_Difference;
    Minority_Friendly = Minority_Friendly;
    Enforced_Antidiscrimination = Enforced_Antidiscrimination;
    Shared_Norms_Mean = Shared_Norms_Mean;
    Shared_Norms_Std_Dev = Shared_Norms_Std_Dev;
    Impersonal_Radius = Impersonal_Radius;
    Employment_Change_Pct_Majority = Employment_Change_Pct_Majority;
    LHS_Experiment_Number = LHS_Experiment_Number;
    LHS_Exp_Running = LHS_Exp_Running;
    OutPutFilesNames = OutPutFilesNames;
    Authority_Impact = Authority_Impact;
    Minimum_Group_Cost = Minimum_Group_Cost;
    Perc_Pop_No_Group = Perc_Pop_No_Group;
    Perc_Min_Religious = Perc_Min_Religious;
    Perc_Maj_Religious = Perc_Maj_Religious;
    Honesty_Mean = Honesty_Mean;
    Agreeableness_Mean = Agreeableness_Mean;
    Extraversion_Mean = Extraversion_Mean;
    Frustation_Mode = Frustation_Mode;
    Openness_Mean = Openness_Mean;
    Conscientiousness_Mean = Conscientiousness_Mean;
    Emotionality_Mean = Emotionality_Mean;
    Honesty_SD = Honesty_SD;
    Agreeableness_SD = Agreeableness_SD;
    Extraversion_SD = Extraversion_SD;
    Frustation_Min_Max = Frustation_Min_Max;
    Openness_SD = Openness_SD;
    Conscientiousness_SD = Conscientiousness_SD;
    Emotionality_SD = Emotionality_SD;
    Hus_Joins_Wife_WVGr_Maj = Hus_Joins_Wife_WVGr_Maj;
    H_J_W_NoGr_NoCh_Maj = H_J_W_NoGr_NoCh_Maj;
    Wif_Joins_Hus_WVGrMaj = Wif_Joins_Hus_WVGrMaj;
    W_J_H_NoGr_NoCh_Maj = W_J_H_NoGr_NoCh_Maj;
    NoGr_Change_Maj = NoGr_Change_Maj;
    Hus_Joins_Wife_WVGr_Min = Hus_Joins_Wife_WVGr_Min;
    H_J_W_NoGr_NoCh_Min = H_J_W_NoGr_NoCh_Min;
    Wif_Joins_Hus_WVGrMin = Wif_Joins_Hus_WVGrMin;
    W_J_H_NoGr_NoCh_Min = W_J_H_NoGr_NoCh_Min;
    NoGr_Change_Min = NoGr_Change_Min;
    Hus_Joins_Wife_WVGr_MajMin = Hus_Joins_Wife_WVGr_MajMin;
    H_J_W_NoGr_NoCh_MajMin = H_J_W_NoGr_NoCh_MajMin;
    Wif_Joins_Hus_WVGrMajMin = Wif_Joins_Hus_WVGrMajMin;
    W_J_H_NoGr_NoCh_MajMin = W_J_H_NoGr_NoCh_MajMin;
    NoGr_Change_MajMin = NoGr_Change_MajMin;
    Honest_Heritability = Honest_Heritability;
    Agreeableness_Heritability = Agreeableness_Heritability;
    Extraversion_Heritability = Extraversion_Heritability;
    Conscientiousness_Heritability = Conscientiousness_Heritability;
    Emotionality_Heritability = Emotionality_Heritability;
    Openness_Heritability = Openness_Heritability;
    Prob_WVGroup_From_Mother = Prob_WVGroup_From_Mother;
    CRED_Impact_MyLeader = CRED_Impact_MyLeader;
    CRED_Impact_OtherLeader = CRED_Impact_OtherLeader;
    CRED_Impact_SharedWVOrGroupType = CRED_Impact_SharedWVOrGroupType;
    CRED_Impact_SharedRel_But_Diff_Type = CRED_Impact_SharedRel_But_Diff_Type;
    CRED_DisplayConsistency_Error = CRED_DisplayConsistency_Error;
    CRED_Update_WV = CRED_Update_WV;
    CRED_ProbMeetingLeader = CRED_ProbMeetingLeader;
    Min_Leader_Age = Min_Leader_Age;
    CRED_Memory_Decay_Rate = CRED_Memory_Decay_Rate;
    Charisma_Threshold = Charisma_Threshold;
    Threat_Threshold = Threat_Threshold;
    Secular_Group_Tolerance_Range = Secular_Group_Tolerance_Range;
    Initial_Percentage_Sec_Affiliated = Initial_Percentage_Sec_Affiliated;
    Prob_Coeff_Joining_Opposit_WVClub = Prob_Coeff_Joining_Opposit_WVClub;
    CRED_Prob_Curve_Consciousness = CRED_Prob_Curve_Consciousness;
    CRED_Prob_Curve_Frustation = CRED_Prob_Curve_Frustation;
    CRED_Prob_Curve_Club_Consistency = CRED_Prob_Curve_Club_Consistency;
    CRED_Limit_Curve_Club_Consistency = CRED_Limit_Curve_Club_Consistency;
    Number_Of_Sec_Groups = Number_Of_Sec_Groups;
    Number_Of_Rel_Maj_Groups = Number_Of_Rel_Maj_Groups;
    Number_Of_Rel_Min_Groups = Number_Of_Rel_Min_Groups;
    CRED_Rel_Exemplar_Impact = CRED_Rel_Exemplar_Impact;
    CRED_Sec_Exemplar_Impact = CRED_Sec_Exemplar_Impact;
    CRED_Rel_Group_Cost = CRED_Rel_Group_Cost;
    CRED_Sec_Group_Cost = CRED_Sec_Group_Cost;
    CRED_Prob_Curve_CredToCrud = CRED_Prob_Curve_CredToCrud;
    PC_WV_dist_Threshold = PC_WV_dist_Threshold;
    Mother_WV_Importance = Mother_WV_Importance;
    ThreatEnhancer_DueTo_PCWV_dist = ThreatEnhancer_DueTo_PCWV_dist;
    CRED_Update_Fr_Inc = CRED_Update_Fr_Inc;
    CRED_Update_Fr_Dec = CRED_Update_Fr_Dec;
    Min_Hypoc_Th = Min_Hypoc_Th;
    Min_Join_Th = Min_Join_Th;
    SUPERNATURAL_BIAS_ON_PERSONAL_LOSS = SUPERNATURAL_BIAS_ON_PERSONAL_LOSS;
    MAX_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS = MAX_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS;
    MIN_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS = MIN_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS;
    MAX_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS = MAX_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS;
    MIN_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS = MIN_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS;
    chanceWVCMemberWouldAct = chanceWVCMemberWouldAct;
    chanceOfHistoryOfRespectiveProSocialAction = chanceOfHistoryOfRespectiveProSocialAction;
    MIN_RELIGIOUS_WORLD_VIEW = MIN_RELIGIOUS_WORLD_VIEW;
    MAX_RELIGIOUS_WORLD_VIEW = MAX_RELIGIOUS_WORLD_VIEW;
    MIN_NON_RELIGIOUS_WORLD_VIEW = MIN_NON_RELIGIOUS_WORLD_VIEW;
    MAX_NON_RELIGIOUS_WORLD_VIEW = MAX_NON_RELIGIOUS_WORLD_VIEW;
  }
  



  
  public void reset()
  {
    setUseReplications(true);
    setFixedReplicationsNumber(30);
  }
  
  public int getRangeParametersNumber()
  {
    return 1;
  }
  
  
  private int _LHS_Experiment_Number_From()
  {
    int _value = 
      0;
    
    return _value;
  }
  
  
  private int _LHS_Experiment_Number_To() {
    int _value = 
      100;
    
    return _value;
  }
  
  
  private int _LHS_Experiment_Number_Step() {
    int _value = 
      1;
    
    return _value;
  }
  
  
  public int[] calculateRangeParameterValuesNumbers()
  {
    int[] res = new int[1];
    res[0] = ((_LHS_Experiment_Number_To() - _LHS_Experiment_Number_From()) / _LHS_Experiment_Number_Step() + 1);
    return res;
  }
  
  
  public void setupRangeVariedParameter(Main root, int paramIndex, int valueIndex, boolean callOnChangeActions)
  {
    switch (paramIndex) {
    case 0: 
      int LHS_Experiment_Number_xjal = _LHS_Experiment_Number_From() + valueIndex * _LHS_Experiment_Number_Step();
      if (callOnChangeActions) {
        root.set_LHS_Experiment_Number(LHS_Experiment_Number_xjal);
      } else {
        LHS_Experiment_Number = LHS_Experiment_Number_xjal;
      }
      break;
    default: 
      super.setupRangeVariedParameter(root, paramIndex, valueIndex, callOnChangeActions);
    }
    
  }
  
  
  public void setupRootParameters(Main self, int index, boolean callOnChangeActions)
  {
    Main root = self;
    super.setupRootParameters(self, index, callOnChangeActions);
    
    double Accomodation_of_Difference_xjal = self._Accomodation_of_Difference_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Accomodation_of_Difference(Accomodation_of_Difference_xjal);
    } else {
      Accomodation_of_Difference = Accomodation_of_Difference_xjal;
    }
    
    int Age_Cutoff_Majority_xjal = self._Age_Cutoff_Majority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Age_Cutoff_Majority(Age_Cutoff_Majority_xjal);
    } else {
      Age_Cutoff_Majority = Age_Cutoff_Majority_xjal;
    }
    
    int Age_Cutoff_Minority_xjal = self._Age_Cutoff_Minority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Age_Cutoff_Minority(Age_Cutoff_Minority_xjal);
    } else {
      Age_Cutoff_Minority = Age_Cutoff_Minority_xjal;
    }
    
    int Age_Kink_Majority_xjal = self._Age_Kink_Majority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Age_Kink_Majority(Age_Kink_Majority_xjal);
    } else {
      Age_Kink_Majority = Age_Kink_Majority_xjal;
    }
    
    int Age_Kink_Minority_xjal = self._Age_Kink_Minority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Age_Kink_Minority(Age_Kink_Minority_xjal);
    } else {
      Age_Kink_Minority = Age_Kink_Minority_xjal;
    }
    
    double Agreeableness_Heritability_xjal = self._Agreeableness_Heritability_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Agreeableness_Heritability(Agreeableness_Heritability_xjal);
    } else {
      Agreeableness_Heritability = Agreeableness_Heritability_xjal;
    }
    
    double Agreeableness_Mean_xjal = self._Agreeableness_Mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Agreeableness_Mean(Agreeableness_Mean_xjal);
    } else {
      Agreeableness_Mean = Agreeableness_Mean_xjal;
    }
    
    double Agreeableness_SD_xjal = self._Agreeableness_SD_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Agreeableness_SD(Agreeableness_SD_xjal);
    } else {
      Agreeableness_SD = Agreeableness_SD_xjal;
    }
    
    double Authority_Impact_xjal = self._Authority_Impact_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Authority_Impact(Authority_Impact_xjal);
    } else {
      Authority_Impact = Authority_Impact_xjal;
    }
    
    double CRED_DisplayConsistency_Error_xjal = self._CRED_DisplayConsistency_Error_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_DisplayConsistency_Error(CRED_DisplayConsistency_Error_xjal);
    } else {
      CRED_DisplayConsistency_Error = CRED_DisplayConsistency_Error_xjal;
    }
    
    double CRED_Impact_MyLeader_xjal = self._CRED_Impact_MyLeader_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Impact_MyLeader(CRED_Impact_MyLeader_xjal);
    } else {
      CRED_Impact_MyLeader = CRED_Impact_MyLeader_xjal;
    }
    
    double CRED_Impact_OtherLeader_xjal = self._CRED_Impact_OtherLeader_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Impact_OtherLeader(CRED_Impact_OtherLeader_xjal);
    } else {
      CRED_Impact_OtherLeader = CRED_Impact_OtherLeader_xjal;
    }
    
    double CRED_Impact_SharedRel_But_Diff_Type_xjal = self._CRED_Impact_SharedRel_But_Diff_Type_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Impact_SharedRel_But_Diff_Type(CRED_Impact_SharedRel_But_Diff_Type_xjal);
    } else {
      CRED_Impact_SharedRel_But_Diff_Type = CRED_Impact_SharedRel_But_Diff_Type_xjal;
    }
    
    double CRED_Impact_SharedWVOrGroupType_xjal = self._CRED_Impact_SharedWVOrGroupType_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Impact_SharedWVOrGroupType(CRED_Impact_SharedWVOrGroupType_xjal);
    } else {
      CRED_Impact_SharedWVOrGroupType = CRED_Impact_SharedWVOrGroupType_xjal;
    }
    
    double CRED_Limit_Curve_Club_Consistency_xjal = self._CRED_Limit_Curve_Club_Consistency_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Limit_Curve_Club_Consistency(CRED_Limit_Curve_Club_Consistency_xjal);
    } else {
      CRED_Limit_Curve_Club_Consistency = CRED_Limit_Curve_Club_Consistency_xjal;
    }
    
    double CRED_Memory_Decay_Rate_xjal = self._CRED_Memory_Decay_Rate_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Memory_Decay_Rate(CRED_Memory_Decay_Rate_xjal);
    } else {
      CRED_Memory_Decay_Rate = CRED_Memory_Decay_Rate_xjal;
    }
    
    double CRED_ProbMeetingLeader_xjal = self._CRED_ProbMeetingLeader_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_ProbMeetingLeader(CRED_ProbMeetingLeader_xjal);
    } else {
      CRED_ProbMeetingLeader = CRED_ProbMeetingLeader_xjal;
    }
    
    double CRED_Prob_Curve_Club_Consistency_xjal = self._CRED_Prob_Curve_Club_Consistency_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Prob_Curve_Club_Consistency(CRED_Prob_Curve_Club_Consistency_xjal);
    } else {
      CRED_Prob_Curve_Club_Consistency = CRED_Prob_Curve_Club_Consistency_xjal;
    }
    
    double CRED_Prob_Curve_Consciousness_xjal = self._CRED_Prob_Curve_Consciousness_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Prob_Curve_Consciousness(CRED_Prob_Curve_Consciousness_xjal);
    } else {
      CRED_Prob_Curve_Consciousness = CRED_Prob_Curve_Consciousness_xjal;
    }
    
    double CRED_Prob_Curve_CredToCrud_xjal = self._CRED_Prob_Curve_CredToCrud_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Prob_Curve_CredToCrud(CRED_Prob_Curve_CredToCrud_xjal);
    } else {
      CRED_Prob_Curve_CredToCrud = CRED_Prob_Curve_CredToCrud_xjal;
    }
    
    double CRED_Prob_Curve_Frustation_xjal = self._CRED_Prob_Curve_Frustation_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Prob_Curve_Frustation(CRED_Prob_Curve_Frustation_xjal);
    } else {
      CRED_Prob_Curve_Frustation = CRED_Prob_Curve_Frustation_xjal;
    }
    
    double CRED_Rel_Exemplar_Impact_xjal = self._CRED_Rel_Exemplar_Impact_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Rel_Exemplar_Impact(CRED_Rel_Exemplar_Impact_xjal);
    } else {
      CRED_Rel_Exemplar_Impact = CRED_Rel_Exemplar_Impact_xjal;
    }
    
    double CRED_Rel_Group_Cost_xjal = self._CRED_Rel_Group_Cost_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Rel_Group_Cost(CRED_Rel_Group_Cost_xjal);
    } else {
      CRED_Rel_Group_Cost = CRED_Rel_Group_Cost_xjal;
    }
    
    double CRED_Sec_Exemplar_Impact_xjal = self._CRED_Sec_Exemplar_Impact_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Sec_Exemplar_Impact(CRED_Sec_Exemplar_Impact_xjal);
    } else {
      CRED_Sec_Exemplar_Impact = CRED_Sec_Exemplar_Impact_xjal;
    }
    
    double CRED_Sec_Group_Cost_xjal = self._CRED_Sec_Group_Cost_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Sec_Group_Cost(CRED_Sec_Group_Cost_xjal);
    } else {
      CRED_Sec_Group_Cost = CRED_Sec_Group_Cost_xjal;
    }
    
    double CRED_Update_Fr_Dec_xjal = self._CRED_Update_Fr_Dec_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Update_Fr_Dec(CRED_Update_Fr_Dec_xjal);
    } else {
      CRED_Update_Fr_Dec = CRED_Update_Fr_Dec_xjal;
    }
    
    double CRED_Update_Fr_Inc_xjal = self._CRED_Update_Fr_Inc_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Update_Fr_Inc(CRED_Update_Fr_Inc_xjal);
    } else {
      CRED_Update_Fr_Inc = CRED_Update_Fr_Inc_xjal;
    }
    
    double CRED_Update_WV_xjal = self._CRED_Update_WV_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CRED_Update_WV(CRED_Update_WV_xjal);
    } else {
      CRED_Update_WV = CRED_Update_WV_xjal;
    }
    
    double Charisma_Threshold_xjal = self._Charisma_Threshold_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Charisma_Threshold(Charisma_Threshold_xjal);
    } else {
      Charisma_Threshold = Charisma_Threshold_xjal;
    }
    
    double Conscientiousness_Heritability_xjal = self._Conscientiousness_Heritability_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Conscientiousness_Heritability(Conscientiousness_Heritability_xjal);
    } else {
      Conscientiousness_Heritability = Conscientiousness_Heritability_xjal;
    }
    
    double Conscientiousness_Mean_xjal = self._Conscientiousness_Mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Conscientiousness_Mean(Conscientiousness_Mean_xjal);
    } else {
      Conscientiousness_Mean = Conscientiousness_Mean_xjal;
    }
    
    double Conscientiousness_SD_xjal = self._Conscientiousness_SD_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Conscientiousness_SD(Conscientiousness_SD_xjal);
    } else {
      Conscientiousness_SD = Conscientiousness_SD_xjal;
    }
    
    double Death_Probability_Prior_To_Kink_xjal = self._Death_Probability_Prior_To_Kink_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Death_Probability_Prior_To_Kink(Death_Probability_Prior_To_Kink_xjal);
    } else {
      Death_Probability_Prior_To_Kink = Death_Probability_Prior_To_Kink_xjal;
    }
    
    int Education_Cutoff_Majority_xjal = self._Education_Cutoff_Majority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Education_Cutoff_Majority(Education_Cutoff_Majority_xjal);
    } else {
      Education_Cutoff_Majority = Education_Cutoff_Majority_xjal;
    }
    
    int Education_Cutoff_Minority_xjal = self._Education_Cutoff_Minority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Education_Cutoff_Minority(Education_Cutoff_Minority_xjal);
    } else {
      Education_Cutoff_Minority = Education_Cutoff_Minority_xjal;
    }
    
    int Education_Kink_Majority_xjal = self._Education_Kink_Majority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Education_Kink_Majority(Education_Kink_Majority_xjal);
    } else {
      Education_Kink_Majority = Education_Kink_Majority_xjal;
    }
    
    int Education_Kink_Minority_xjal = self._Education_Kink_Minority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Education_Kink_Minority(Education_Kink_Minority_xjal);
    } else {
      Education_Kink_Minority = Education_Kink_Minority_xjal;
    }
    
    double Emotionality_Heritability_xjal = self._Emotionality_Heritability_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Emotionality_Heritability(Emotionality_Heritability_xjal);
    } else {
      Emotionality_Heritability = Emotionality_Heritability_xjal;
    }
    
    double Emotionality_Mean_xjal = self._Emotionality_Mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Emotionality_Mean(Emotionality_Mean_xjal);
    } else {
      Emotionality_Mean = Emotionality_Mean_xjal;
    }
    
    double Emotionality_SD_xjal = self._Emotionality_SD_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Emotionality_SD(Emotionality_SD_xjal);
    } else {
      Emotionality_SD = Emotionality_SD_xjal;
    }
    
    double Employment_Change_Pct_Majority_xjal = self._Employment_Change_Pct_Majority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Employment_Change_Pct_Majority(Employment_Change_Pct_Majority_xjal);
    } else {
      Employment_Change_Pct_Majority = Employment_Change_Pct_Majority_xjal;
    }
    
    double Endogamy_Degree_xjal = self._Endogamy_Degree_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Endogamy_Degree(Endogamy_Degree_xjal);
    } else {
      Endogamy_Degree = Endogamy_Degree_xjal;
    }
    
    double Enforced_Antidiscrimination_xjal = self._Enforced_Antidiscrimination_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Enforced_Antidiscrimination(Enforced_Antidiscrimination_xjal);
    } else {
      Enforced_Antidiscrimination = Enforced_Antidiscrimination_xjal;
    }
    
    double Extraversion_Heritability_xjal = self._Extraversion_Heritability_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Extraversion_Heritability(Extraversion_Heritability_xjal);
    } else {
      Extraversion_Heritability = Extraversion_Heritability_xjal;
    }
    
    double Extraversion_Mean_xjal = self._Extraversion_Mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Extraversion_Mean(Extraversion_Mean_xjal);
    } else {
      Extraversion_Mean = Extraversion_Mean_xjal;
    }
    
    double Extraversion_SD_xjal = self._Extraversion_SD_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Extraversion_SD(Extraversion_SD_xjal);
    } else {
      Extraversion_SD = Extraversion_SD_xjal;
    }
    
    double Frustation_Min_Max_xjal = self._Frustation_Min_Max_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Frustation_Min_Max(Frustation_Min_Max_xjal);
    } else {
      Frustation_Min_Max = Frustation_Min_Max_xjal;
    }
    
    double Frustation_Mode_xjal = self._Frustation_Mode_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Frustation_Mode(Frustation_Mode_xjal);
    } else {
      Frustation_Mode = Frustation_Mode_xjal;
    }
    
    double Gender_Percentage_Female_xjal = self._Gender_Percentage_Female_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Gender_Percentage_Female(Gender_Percentage_Female_xjal);
    } else {
      Gender_Percentage_Female = Gender_Percentage_Female_xjal;
    }
    
    double H_J_W_NoGr_NoCh_Maj_xjal = self._H_J_W_NoGr_NoCh_Maj_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_H_J_W_NoGr_NoCh_Maj(H_J_W_NoGr_NoCh_Maj_xjal);
    } else {
      H_J_W_NoGr_NoCh_Maj = H_J_W_NoGr_NoCh_Maj_xjal;
    }
    
    double H_J_W_NoGr_NoCh_MajMin_xjal = self._H_J_W_NoGr_NoCh_MajMin_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_H_J_W_NoGr_NoCh_MajMin(H_J_W_NoGr_NoCh_MajMin_xjal);
    } else {
      H_J_W_NoGr_NoCh_MajMin = H_J_W_NoGr_NoCh_MajMin_xjal;
    }
    
    double H_J_W_NoGr_NoCh_Min_xjal = self._H_J_W_NoGr_NoCh_Min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_H_J_W_NoGr_NoCh_Min(H_J_W_NoGr_NoCh_Min_xjal);
    } else {
      H_J_W_NoGr_NoCh_Min = H_J_W_NoGr_NoCh_Min_xjal;
    }
    
    double Honest_Heritability_xjal = self._Honest_Heritability_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Honest_Heritability(Honest_Heritability_xjal);
    } else {
      Honest_Heritability = Honest_Heritability_xjal;
    }
    
    double Honesty_Mean_xjal = self._Honesty_Mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Honesty_Mean(Honesty_Mean_xjal);
    } else {
      Honesty_Mean = Honesty_Mean_xjal;
    }
    
    double Honesty_SD_xjal = self._Honesty_SD_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Honesty_SD(Honesty_SD_xjal);
    } else {
      Honesty_SD = Honesty_SD_xjal;
    }
    
    double Hus_Joins_Wife_WVGr_Maj_xjal = self._Hus_Joins_Wife_WVGr_Maj_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Hus_Joins_Wife_WVGr_Maj(Hus_Joins_Wife_WVGr_Maj_xjal);
    } else {
      Hus_Joins_Wife_WVGr_Maj = Hus_Joins_Wife_WVGr_Maj_xjal;
    }
    
    double Hus_Joins_Wife_WVGr_MajMin_xjal = self._Hus_Joins_Wife_WVGr_MajMin_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Hus_Joins_Wife_WVGr_MajMin(Hus_Joins_Wife_WVGr_MajMin_xjal);
    } else {
      Hus_Joins_Wife_WVGr_MajMin = Hus_Joins_Wife_WVGr_MajMin_xjal;
    }
    
    double Hus_Joins_Wife_WVGr_Min_xjal = self._Hus_Joins_Wife_WVGr_Min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Hus_Joins_Wife_WVGr_Min(Hus_Joins_Wife_WVGr_Min_xjal);
    } else {
      Hus_Joins_Wife_WVGr_Min = Hus_Joins_Wife_WVGr_Min_xjal;
    }
    
    int Impersonal_Radius_xjal = self._Impersonal_Radius_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Impersonal_Radius(Impersonal_Radius_xjal);
    } else {
      Impersonal_Radius = Impersonal_Radius_xjal;
    }
    
    double Income_Median_In_Hundred_Thousands_xjal = self._Income_Median_In_Hundred_Thousands_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Income_Median_In_Hundred_Thousands(Income_Median_In_Hundred_Thousands_xjal);
    } else {
      Income_Median_In_Hundred_Thousands = Income_Median_In_Hundred_Thousands_xjal;
    }
    
    double Income_Min_In_Hundred_Thousands_xjal = self._Income_Min_In_Hundred_Thousands_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Income_Min_In_Hundred_Thousands(Income_Min_In_Hundred_Thousands_xjal);
    } else {
      Income_Min_In_Hundred_Thousands = Income_Min_In_Hundred_Thousands_xjal;
    }
    
    double Income_Skew_In_Hundred_Thousands_xjal = self._Income_Skew_In_Hundred_Thousands_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Income_Skew_In_Hundred_Thousands(Income_Skew_In_Hundred_Thousands_xjal);
    } else {
      Income_Skew_In_Hundred_Thousands = Income_Skew_In_Hundred_Thousands_xjal;
    }
    
    double Ingroup_Support_Majority_Mean_xjal = self._Ingroup_Support_Majority_Mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Ingroup_Support_Majority_Mean(Ingroup_Support_Majority_Mean_xjal);
    } else {
      Ingroup_Support_Majority_Mean = Ingroup_Support_Majority_Mean_xjal;
    }
    
    double Ingroup_Support_Majority_Std_Dev_xjal = self._Ingroup_Support_Majority_Std_Dev_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Ingroup_Support_Majority_Std_Dev(Ingroup_Support_Majority_Std_Dev_xjal);
    } else {
      Ingroup_Support_Majority_Std_Dev = Ingroup_Support_Majority_Std_Dev_xjal;
    }
    
    double Ingroup_Support_Minority_Mean_xjal = self._Ingroup_Support_Minority_Mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Ingroup_Support_Minority_Mean(Ingroup_Support_Minority_Mean_xjal);
    } else {
      Ingroup_Support_Minority_Mean = Ingroup_Support_Minority_Mean_xjal;
    }
    
    double Ingroup_Support_Minority_Std_Dev_xjal = self._Ingroup_Support_Minority_Std_Dev_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Ingroup_Support_Minority_Std_Dev(Ingroup_Support_Minority_Std_Dev_xjal);
    } else {
      Ingroup_Support_Minority_Std_Dev = Ingroup_Support_Minority_Std_Dev_xjal;
    }
    
    double Initial_Percentage_Sec_Affiliated_xjal = self._Initial_Percentage_Sec_Affiliated_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Initial_Percentage_Sec_Affiliated(Initial_Percentage_Sec_Affiliated_xjal);
    } else {
      Initial_Percentage_Sec_Affiliated = Initial_Percentage_Sec_Affiliated_xjal;
    }
    
    int Interaction_Radius_xjal = self._Interaction_Radius_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Interaction_Radius(Interaction_Radius_xjal);
    } else {
      Interaction_Radius = Interaction_Radius_xjal;
    }
    
    boolean LHS_Exp_Running_xjal = 
      true;
    
    if (callOnChangeActions) {
      self.set_LHS_Exp_Running(LHS_Exp_Running_xjal);
    } else {
      LHS_Exp_Running = LHS_Exp_Running_xjal;
    }
    
    double MAX_NON_RELIGIOUS_WORLD_VIEW_xjal = self._MAX_NON_RELIGIOUS_WORLD_VIEW_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_MAX_NON_RELIGIOUS_WORLD_VIEW(MAX_NON_RELIGIOUS_WORLD_VIEW_xjal);
    } else {
      MAX_NON_RELIGIOUS_WORLD_VIEW = MAX_NON_RELIGIOUS_WORLD_VIEW_xjal;
    }
    
    int MAX_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal = self._MAX_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_MAX_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS(MAX_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal);
    } else {
      MAX_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS = MAX_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal;
    }
    
    int MAX_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal = self._MAX_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_MAX_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS(MAX_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal);
    } else {
      MAX_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS = MAX_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal;
    }
    
    double MAX_RELIGIOUS_WORLD_VIEW_xjal = self._MAX_RELIGIOUS_WORLD_VIEW_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_MAX_RELIGIOUS_WORLD_VIEW(MAX_RELIGIOUS_WORLD_VIEW_xjal);
    } else {
      MAX_RELIGIOUS_WORLD_VIEW = MAX_RELIGIOUS_WORLD_VIEW_xjal;
    }
    
    double MIN_NON_RELIGIOUS_WORLD_VIEW_xjal = self._MIN_NON_RELIGIOUS_WORLD_VIEW_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_MIN_NON_RELIGIOUS_WORLD_VIEW(MIN_NON_RELIGIOUS_WORLD_VIEW_xjal);
    } else {
      MIN_NON_RELIGIOUS_WORLD_VIEW = MIN_NON_RELIGIOUS_WORLD_VIEW_xjal;
    }
    
    int MIN_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal = self._MIN_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_MIN_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS(MIN_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal);
    } else {
      MIN_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS = MIN_NUMBER_OF_NON_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal;
    }
    
    int MIN_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal = self._MIN_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_MIN_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS(MIN_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal);
    } else {
      MIN_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS = MIN_NUMBER_OF_RELIGIOUS_WVC_PROSOCIAL_OPPS_xjal;
    }
    
    double MIN_RELIGIOUS_WORLD_VIEW_xjal = self._MIN_RELIGIOUS_WORLD_VIEW_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_MIN_RELIGIOUS_WORLD_VIEW(MIN_RELIGIOUS_WORLD_VIEW_xjal);
    } else {
      MIN_RELIGIOUS_WORLD_VIEW = MIN_RELIGIOUS_WORLD_VIEW_xjal;
    }
    
    double Majority_Minority_Split_xjal = self._Majority_Minority_Split_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Majority_Minority_Split(Majority_Minority_Split_xjal);
    } else {
      Majority_Minority_Split = Majority_Minority_Split_xjal;
    }
    
    double Majority_Suspicion_Of_Minorty_Mean_xjal = self._Majority_Suspicion_Of_Minorty_Mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Majority_Suspicion_Of_Minorty_Mean(Majority_Suspicion_Of_Minorty_Mean_xjal);
    } else {
      Majority_Suspicion_Of_Minorty_Mean = Majority_Suspicion_Of_Minorty_Mean_xjal;
    }
    
    double Majority_Suspicion_Of_Minorty_Std_Dev_xjal = self._Majority_Suspicion_Of_Minorty_Std_Dev_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Majority_Suspicion_Of_Minorty_Std_Dev(Majority_Suspicion_Of_Minorty_Std_Dev_xjal);
    } else {
      Majority_Suspicion_Of_Minorty_Std_Dev = Majority_Suspicion_Of_Minorty_Std_Dev_xjal;
    }
    
    int Marriage_Age_Tolerance_xjal = self._Marriage_Age_Tolerance_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Marriage_Age_Tolerance(Marriage_Age_Tolerance_xjal);
    } else {
      Marriage_Age_Tolerance = Marriage_Age_Tolerance_xjal;
    }
    
    double Marriage_Conversion_Rate_xjal = self._Marriage_Conversion_Rate_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Marriage_Conversion_Rate(Marriage_Conversion_Rate_xjal);
    } else {
      Marriage_Conversion_Rate = Marriage_Conversion_Rate_xjal;
    }
    
    int Marriage_Education_Tolerance_xjal = self._Marriage_Education_Tolerance_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Marriage_Education_Tolerance(Marriage_Education_Tolerance_xjal);
    } else {
      Marriage_Education_Tolerance = Marriage_Education_Tolerance_xjal;
    }
    
    double Marriage_Rate_xjal = self._Marriage_Rate_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Marriage_Rate(Marriage_Rate_xjal);
    } else {
      Marriage_Rate = Marriage_Rate_xjal;
    }
    
    double Min_Hypoc_Th_xjal = self._Min_Hypoc_Th_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Min_Hypoc_Th(Min_Hypoc_Th_xjal);
    } else {
      Min_Hypoc_Th = Min_Hypoc_Th_xjal;
    }
    
    double Min_Join_Th_xjal = self._Min_Join_Th_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Min_Join_Th(Min_Join_Th_xjal);
    } else {
      Min_Join_Th = Min_Join_Th_xjal;
    }
    
    int Min_Leader_Age_xjal = self._Min_Leader_Age_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Min_Leader_Age(Min_Leader_Age_xjal);
    } else {
      Min_Leader_Age = Min_Leader_Age_xjal;
    }
    
    double Minimum_Age_Marriage_Majority_xjal = self._Minimum_Age_Marriage_Majority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Minimum_Age_Marriage_Majority(Minimum_Age_Marriage_Majority_xjal);
    } else {
      Minimum_Age_Marriage_Majority = Minimum_Age_Marriage_Majority_xjal;
    }
    
    double Minimum_Age_Marriage_Minority_xjal = self._Minimum_Age_Marriage_Minority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Minimum_Age_Marriage_Minority(Minimum_Age_Marriage_Minority_xjal);
    } else {
      Minimum_Age_Marriage_Minority = Minimum_Age_Marriage_Minority_xjal;
    }
    
    double Minimum_Group_Cost_xjal = self._Minimum_Group_Cost_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Minimum_Group_Cost(Minimum_Group_Cost_xjal);
    } else {
      Minimum_Group_Cost = Minimum_Group_Cost_xjal;
    }
    
    double Minority_Friendly_xjal = self._Minority_Friendly_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Minority_Friendly(Minority_Friendly_xjal);
    } else {
      Minority_Friendly = Minority_Friendly_xjal;
    }
    
    double Minority_Suspicion_Of_Majority_Mean_xjal = self._Minority_Suspicion_Of_Majority_Mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Minority_Suspicion_Of_Majority_Mean(Minority_Suspicion_Of_Majority_Mean_xjal);
    } else {
      Minority_Suspicion_Of_Majority_Mean = Minority_Suspicion_Of_Majority_Mean_xjal;
    }
    
    double Minority_Suspicion_Of_Majority_Std_Dev_xjal = self._Minority_Suspicion_Of_Majority_Std_Dev_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Minority_Suspicion_Of_Majority_Std_Dev(Minority_Suspicion_Of_Majority_Std_Dev_xjal);
    } else {
      Minority_Suspicion_Of_Majority_Std_Dev = Minority_Suspicion_Of_Majority_Std_Dev_xjal;
    }
    
    double Mother_WV_Importance_xjal = self._Mother_WV_Importance_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Mother_WV_Importance(Mother_WV_Importance_xjal);
    } else {
      Mother_WV_Importance = Mother_WV_Importance_xjal;
    }
    
    int Nativity_Cutoff_xjal = self._Nativity_Cutoff_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Nativity_Cutoff(Nativity_Cutoff_xjal);
    } else {
      Nativity_Cutoff = Nativity_Cutoff_xjal;
    }
    
    double NoGr_Change_Maj_xjal = self._NoGr_Change_Maj_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_NoGr_Change_Maj(NoGr_Change_Maj_xjal);
    } else {
      NoGr_Change_Maj = NoGr_Change_Maj_xjal;
    }
    
    double NoGr_Change_MajMin_xjal = self._NoGr_Change_MajMin_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_NoGr_Change_MajMin(NoGr_Change_MajMin_xjal);
    } else {
      NoGr_Change_MajMin = NoGr_Change_MajMin_xjal;
    }
    
    double NoGr_Change_Min_xjal = self._NoGr_Change_Min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_NoGr_Change_Min(NoGr_Change_Min_xjal);
    } else {
      NoGr_Change_Min = NoGr_Change_Min_xjal;
    }
    
    int Number_Of_Employers_xjal = self._Number_Of_Employers_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Number_Of_Employers(Number_Of_Employers_xjal);
    } else {
      Number_Of_Employers = Number_Of_Employers_xjal;
    }
    
    int Number_Of_Rel_Maj_Groups_xjal = self._Number_Of_Rel_Maj_Groups_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Number_Of_Rel_Maj_Groups(Number_Of_Rel_Maj_Groups_xjal);
    } else {
      Number_Of_Rel_Maj_Groups = Number_Of_Rel_Maj_Groups_xjal;
    }
    
    int Number_Of_Rel_Min_Groups_xjal = self._Number_Of_Rel_Min_Groups_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Number_Of_Rel_Min_Groups(Number_Of_Rel_Min_Groups_xjal);
    } else {
      Number_Of_Rel_Min_Groups = Number_Of_Rel_Min_Groups_xjal;
    }
    
    int Number_Of_Sec_Groups_xjal = self._Number_Of_Sec_Groups_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Number_Of_Sec_Groups(Number_Of_Sec_Groups_xjal);
    } else {
      Number_Of_Sec_Groups = Number_Of_Sec_Groups_xjal;
    }
    
    int Number_of_Adults_xjal = self._Number_of_Adults_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Number_of_Adults(Number_of_Adults_xjal);
    } else {
      Number_of_Adults = Number_of_Adults_xjal;
    }
    
    int Number_of_Children_xjal = self._Number_of_Children_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Number_of_Children(Number_of_Children_xjal);
    } else {
      Number_of_Children = Number_of_Children_xjal;
    }
    
    double Openness_Heritability_xjal = self._Openness_Heritability_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Openness_Heritability(Openness_Heritability_xjal);
    } else {
      Openness_Heritability = Openness_Heritability_xjal;
    }
    
    double Openness_Mean_xjal = self._Openness_Mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Openness_Mean(Openness_Mean_xjal);
    } else {
      Openness_Mean = Openness_Mean_xjal;
    }
    
    double Openness_SD_xjal = self._Openness_SD_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Openness_SD(Openness_SD_xjal);
    } else {
      Openness_SD = Openness_SD_xjal;
    }
    
    String[] OutPutFilesNames_xjal = self._OutPutFilesNames_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_OutPutFilesNames(OutPutFilesNames_xjal);
    } else {
      OutPutFilesNames = OutPutFilesNames_xjal;
    }
    
    double PC_WV_dist_Threshold_xjal = self._PC_WV_dist_Threshold_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_PC_WV_dist_Threshold(PC_WV_dist_Threshold_xjal);
    } else {
      PC_WV_dist_Threshold = PC_WV_dist_Threshold_xjal;
    }
    
    double Perc_Maj_Religious_xjal = self._Perc_Maj_Religious_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Perc_Maj_Religious(Perc_Maj_Religious_xjal);
    } else {
      Perc_Maj_Religious = Perc_Maj_Religious_xjal;
    }
    
    double Perc_Min_Religious_xjal = self._Perc_Min_Religious_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Perc_Min_Religious(Perc_Min_Religious_xjal);
    } else {
      Perc_Min_Religious = Perc_Min_Religious_xjal;
    }
    
    double Perc_Pop_No_Group_xjal = self._Perc_Pop_No_Group_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Perc_Pop_No_Group(Perc_Pop_No_Group_xjal);
    } else {
      Perc_Pop_No_Group = Perc_Pop_No_Group_xjal;
    }
    
    double Percent_Majority_Female_Employed_xjal = self._Percent_Majority_Female_Employed_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Percent_Majority_Female_Employed(Percent_Majority_Female_Employed_xjal);
    } else {
      Percent_Majority_Female_Employed = Percent_Majority_Female_Employed_xjal;
    }
    
    double Percent_Majority_Male_Employed_xjal = self._Percent_Majority_Male_Employed_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Percent_Majority_Male_Employed(Percent_Majority_Male_Employed_xjal);
    } else {
      Percent_Majority_Male_Employed = Percent_Majority_Male_Employed_xjal;
    }
    
    double Percent_Minority_Female_Employed_xjal = self._Percent_Minority_Female_Employed_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Percent_Minority_Female_Employed(Percent_Minority_Female_Employed_xjal);
    } else {
      Percent_Minority_Female_Employed = Percent_Minority_Female_Employed_xjal;
    }
    
    double Percent_Minority_Male_Employed_xjal = self._Percent_Minority_Male_Employed_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Percent_Minority_Male_Employed(Percent_Minority_Male_Employed_xjal);
    } else {
      Percent_Minority_Male_Employed = Percent_Minority_Male_Employed_xjal;
    }
    
    double Prob_Coeff_Joining_Opposit_WVClub_xjal = self._Prob_Coeff_Joining_Opposit_WVClub_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Prob_Coeff_Joining_Opposit_WVClub(Prob_Coeff_Joining_Opposit_WVClub_xjal);
    } else {
      Prob_Coeff_Joining_Opposit_WVClub = Prob_Coeff_Joining_Opposit_WVClub_xjal;
    }
    
    double Prob_WVGroup_From_Mother_xjal = self._Prob_WVGroup_From_Mother_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Prob_WVGroup_From_Mother(Prob_WVGroup_From_Mother_xjal);
    } else {
      Prob_WVGroup_From_Mother = Prob_WVGroup_From_Mother_xjal;
    }
    
    double Religion_Shift_Marriage_xjal = self._Religion_Shift_Marriage_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Religion_Shift_Marriage(Religion_Shift_Marriage_xjal);
    } else {
      Religion_Shift_Marriage = Religion_Shift_Marriage_xjal;
    }
    
    double Religion_Shift_Marriage_To_Majority_xjal = self._Religion_Shift_Marriage_To_Majority_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Religion_Shift_Marriage_To_Majority(Religion_Shift_Marriage_To_Majority_xjal);
    } else {
      Religion_Shift_Marriage_To_Majority = Religion_Shift_Marriage_To_Majority_xjal;
    }
    
    boolean SUPERNATURAL_BIAS_ON_PERSONAL_LOSS_xjal = self._SUPERNATURAL_BIAS_ON_PERSONAL_LOSS_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_SUPERNATURAL_BIAS_ON_PERSONAL_LOSS(SUPERNATURAL_BIAS_ON_PERSONAL_LOSS_xjal);
    } else {
      SUPERNATURAL_BIAS_ON_PERSONAL_LOSS = SUPERNATURAL_BIAS_ON_PERSONAL_LOSS_xjal;
    }
    
    double Secular_Group_Tolerance_Range_xjal = self._Secular_Group_Tolerance_Range_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Secular_Group_Tolerance_Range(Secular_Group_Tolerance_Range_xjal);
    } else {
      Secular_Group_Tolerance_Range = Secular_Group_Tolerance_Range_xjal;
    }
    
    double Shared_Norms_Mean_xjal = self._Shared_Norms_Mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Shared_Norms_Mean(Shared_Norms_Mean_xjal);
    } else {
      Shared_Norms_Mean = Shared_Norms_Mean_xjal;
    }
    
    double Shared_Norms_Std_Dev_xjal = self._Shared_Norms_Std_Dev_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Shared_Norms_Std_Dev(Shared_Norms_Std_Dev_xjal);
    } else {
      Shared_Norms_Std_Dev = Shared_Norms_Std_Dev_xjal;
    }
    
    double ThreatEnhancer_DueTo_PCWV_dist_xjal = self._ThreatEnhancer_DueTo_PCWV_dist_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_ThreatEnhancer_DueTo_PCWV_dist(ThreatEnhancer_DueTo_PCWV_dist_xjal);
    } else {
      ThreatEnhancer_DueTo_PCWV_dist = ThreatEnhancer_DueTo_PCWV_dist_xjal;
    }
    
    double Threat_Threshold_xjal = self._Threat_Threshold_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Threat_Threshold(Threat_Threshold_xjal);
    } else {
      Threat_Threshold = Threat_Threshold_xjal;
    }
    
    double W_J_H_NoGr_NoCh_Maj_xjal = self._W_J_H_NoGr_NoCh_Maj_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_W_J_H_NoGr_NoCh_Maj(W_J_H_NoGr_NoCh_Maj_xjal);
    } else {
      W_J_H_NoGr_NoCh_Maj = W_J_H_NoGr_NoCh_Maj_xjal;
    }
    
    double W_J_H_NoGr_NoCh_MajMin_xjal = self._W_J_H_NoGr_NoCh_MajMin_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_W_J_H_NoGr_NoCh_MajMin(W_J_H_NoGr_NoCh_MajMin_xjal);
    } else {
      W_J_H_NoGr_NoCh_MajMin = W_J_H_NoGr_NoCh_MajMin_xjal;
    }
    
    double W_J_H_NoGr_NoCh_Min_xjal = self._W_J_H_NoGr_NoCh_Min_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_W_J_H_NoGr_NoCh_Min(W_J_H_NoGr_NoCh_Min_xjal);
    } else {
      W_J_H_NoGr_NoCh_Min = W_J_H_NoGr_NoCh_Min_xjal;
    }
    
    double Wif_Joins_Hus_WVGrMaj_xjal = self._Wif_Joins_Hus_WVGrMaj_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Wif_Joins_Hus_WVGrMaj(Wif_Joins_Hus_WVGrMaj_xjal);
    } else {
      Wif_Joins_Hus_WVGrMaj = Wif_Joins_Hus_WVGrMaj_xjal;
    }
    
    double Wif_Joins_Hus_WVGrMajMin_xjal = self._Wif_Joins_Hus_WVGrMajMin_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Wif_Joins_Hus_WVGrMajMin(Wif_Joins_Hus_WVGrMajMin_xjal);
    } else {
      Wif_Joins_Hus_WVGrMajMin = Wif_Joins_Hus_WVGrMajMin_xjal;
    }
    
    double Wif_Joins_Hus_WVGrMin_xjal = self._Wif_Joins_Hus_WVGrMin_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Wif_Joins_Hus_WVGrMin(Wif_Joins_Hus_WVGrMin_xjal);
    } else {
      Wif_Joins_Hus_WVGrMin = Wif_Joins_Hus_WVGrMin_xjal;
    }
    
    double chanceOfHistoryOfRespectiveProSocialAction_xjal = self._chanceOfHistoryOfRespectiveProSocialAction_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_chanceOfHistoryOfRespectiveProSocialAction(chanceOfHistoryOfRespectiveProSocialAction_xjal);
    } else {
      chanceOfHistoryOfRespectiveProSocialAction = chanceOfHistoryOfRespectiveProSocialAction_xjal;
    }
    
    double chanceWVCMemberWouldAct_xjal = self._chanceWVCMemberWouldAct_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_chanceWVCMemberWouldAct(chanceWVCMemberWouldAct_xjal);
    } else {
      chanceWVCMemberWouldAct = chanceWVCMemberWouldAct_xjal;
    }
  }
}
