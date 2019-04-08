rm(list=ls())

library(tidyr)
library(dplyr)

getTrust <- function (trust.code)
{
  
  if (trust.code == 1) 
  {
    return (TRUE)
  }
  return (FALSE)
}

getUniversalActs <- function(univ1.code, univ2.code, univ3.code, 
                             univ4.code, univ5.code, univ6.code, 
                             univ7.code, univ8.code, univ9.code)
{
  if ( (univ1.code == 1) | (univ2.code == 1) | (univ3.code == 1) |
       (univ4.code == 1) | (univ5.code == 1) | (univ6.code == 1) |
       (univ7.code == 1) | (univ8.code == 1) | (univ9.code == 1) )
  {
    return (TRUE)
  }
  return (FALSE)
}

getUniversalActs <- function(ideo1.code, ideo2.code, ideo3.code, ideo4.code)
{
  if ( (ideo1.code == 1) | (ideo2.code == 1) | (ideo3.code == 1) | (ideo4.code == 1))
  {
    return (TRUE)
  }
  return (FALSE)
}

getTolerance <- function (tolerant1.code, tolerant2.code)
{
  if ((tolerant1.code == 0) | (tolerant2.code == 0))
  {
    return (TRUE)
  }
  return (FALSE)
}

getSupernaturalWorldView <- function(god.code, hell.code, heaven.code, life.imp.bc.god.code, prsnl.life.frc.code, imp.of.god.code)
{
  if ((god.code == 1) | (hell.code == 1) | (heaven.code == 1) | 
      (life.imp.bc.god.code == 1) | (prsnl.life.frc.code == 1) | (prsnl.life.frc.code == 2) | 
      (imp.of.god.code > 5))
  {
    return (TRUE)
  }
  return (FALSE)
}

getAffiliationWithReligion <- function(attendance.code) {
  if ((attendance.code > 0 ) & (attendance.code < 4 ))
  {
    return (TRUE)
  }
  return (FALSE)
}

getNaturalWorldView <- function(god.code, hell.code, heaven.code, life.imp.bc.god.code, prsnl.life.frc.code, imp.of.god.code)
{
  if ((god.code == 0) & (hell.code == 0) & (heaven.code == 0))
  {
    return (TRUE)
  }
  if (prsnl.life.frc.code == 4)
  {
    return (TRUE)
  }
  if (life.imp.bc.god.code == 2)
  {
    return (TRUE)
  }
  if (imp.of.god.code < 5)
  {
    return(TRUE)
  }
  return (FALSE)
}

long.data = readRDS("F00008390-WVS_Longitudinal_1981_2016_r_v20180912.rds")
keeps = c("S001", "S002", "S002EVS", "S003", "S006", "S007", "S007_01", "A165", "A124_02", "A124_06", "F053", "F054", "F050", "F028", "F004", 
          "F062", "F063","A081", "A083", "A087", "A088", "A088B", "A088C", "A090", "A091", "A092", "A084", "A085", "A086", "A089")
future.colnames = c("Study", "Wave", "EVS-wave", "Country", "OrigRespNum", "UnifiedRespNum", "UnifiedRespNum.2", "Trust", 
                    "Tolerate.1", "Tolerate.2", "Hell", "Heaven", "God", "Attend.Rel.Services", "Life.BC.God", "Prsnl.Lf.Frc", 
                    "Imp.Of.God", "Universal.1", "Universal.2", "Universal.3", "Universal.4", "Universal.5", "Universal.6", 
                    "Universal.7", "Universal.8", "Universal.9", "Ideological.1", "Ideological.2", "Ideological.3", "Ideological.4")
working.data = long.data %>% select(keeps)

names(working.data) = future.colnames
working.data$UnifiedRespNum = as.factor(working.data$UnifiedRespNum)

working.data = subset(working.data, (Attend.Rel.Services >= 0))
working.data = subset(working.data, (Trust >= 0))
working.data = subset(working.data, (Tolerate.1 >= 0 & Tolerate.2 >= 0))
working.data = subset(working.data, (God >= 0 | Hell >= 0 | Heaven >= 0 | Life.BC.God >= 0 | Prsnl.Lf.Frc >=0 | Imp.Of.God >= 0))

number.of.waves.included = working.data %>% group_by(UnifiedRespNum) %>% summarise(number.of.waves = length(Wave))
number.of.waves.included = number.of.waves.included %>% filter(number.of.waves > 1)
list.of.multiple.queries = number.of.waves.included$UnifiedRespNum
working.data = working.data %>% filter(UnifiedRespNum %in% list.of.multiple.queries)

working.data$WVC.Supernaturalist = unlist(lapply(working.data$Attend.Rel.Services, getAffiliationWithReligion))
working.data$SuperNatural.WV = unlist(mapply(getSupernaturalWorldView, 
                                             working.data$God, working.data$Hell, working.data$Heaven,
                                             working.data$Life.BC.God, working.data$Prsnl.Lf.Frc, working.data$Imp.Of.God))
working.data$Natural.WV = unlist(mapply(getNaturalWorldView, working.data$God, working.data$Hell, working.data$Heaven,
                                        working.data$Life.BC.God, working.data$Prsnl.Lf.Frc, working.data$Imp.Of.God))
working.data$Prosocial.Trust.Others = unlist(mapply(getTrust, working.data$Trust))
working.data$Prosocial.Tolerance.Of.Others = unlist(mapply(getTolerance, working.data$Tolerate.1, working.data$Tolerate.2))


only.coherent.cases.snwv.only = subset(working.data, SuperNatural.WV == TRUE & WVC.Supernaturalist == FALSE & Natural.WV == FALSE)
only.coherent.cases.nwv.only = subset(working.data, Natural.WV == TRUE & WVC.Supernaturalist == FALSE & SuperNatural.WV == FALSE)
only.coherent.cases.asn = subset(working.data, WVC.Supernaturalist == TRUE & SuperNatural.WV == TRUE & Natural.WV == FALSE)
only.coherent.cases = rbind.data.frame(only.coherent.cases.snwv.only, only.coherent.cases.nwv.only, only.coherent.cases.asn)
rm(working.data)

number.of.waves.included = only.coherent.cases %>% group_by(UnifiedRespNum) %>% summarise(number.of.waves = length(Wave))
number.of.waves.included = number.of.waves.included %>% filter(number.of.waves > 1)
list.of.multiple.queries = number.of.waves.included$UnifiedRespNum
only.coherent.cases = only.coherent.cases %>% filter(UnifiedRespNum %in% list.of.multiple.queries)

# left off these are cases we can work with.

only.coherent.cases = only.coherent.cases %>% arrange(UnifiedRespNum, Wave)

# determine if move towards sn
towards.sn = only.coherent.cases %>% group_by(UnifiedRespNum) %>% summarise(Towards.SN.Over.Time = 
                                                                            (SuperNatural.WV[1] == FALSE & 
                                                                             SuperNatural.WV[2] ==TRUE))
# determine if move away from sn
from.sn =  only.coherent.cases %>% group_by(UnifiedRespNum) %>% summarise(Away.From.SN.Over.Time = 
                                                                            (SuperNatural.WV[1] == TRUE & 
                                                                               SuperNatural.WV[2] ==FALSE))
# determine if move towards natural
towards.nat = only.coherent.cases %>% group_by(UnifiedRespNum) %>% summarise(Towards.Natural.Over.Time = 
                                                                               (Natural.WV[1] == FALSE & 
                                                                                Natural.WV[2] ==TRUE))

# determine if move away from natural
from.nat = only.coherent.cases %>% group_by(UnifiedRespNum) %>% summarise(Away.From.Natural.Over.Time = 
                                                                               (Natural.WV[1] == FALSE & 
                                                                                  Natural.WV[2] ==TRUE))

# determine if move towards sn and affiliation (can't be affiliated if you aren't sn in this analysis)
towards.sn.affiliation = only.coherent.cases %>% group_by(UnifiedRespNum) %>% summarise(Towards.SN.Affiliation.Over.Time = 
                                                                                       (WVC.Supernaturalist[1] == FALSE & 
                                                                                          WVC.Supernaturalist[2] ==TRUE))

from.sn.affiliation = only.coherent.cases %>% group_by(UnifiedRespNum) %>% summarise(Away.From.SN.Affiliation.Over.Time = 
                                                                                       (WVC.Supernaturalist[1] ==  TRUE & 
                                                                                          WVC.Supernaturalist[2] ==FALSE))

# determine if move towards trust
towards.trust = only.coherent.cases %>% group_by(UnifiedRespNum) %>% summarise(Towards.Trust.Over.Time = 
                                                                                          (Prosocial.Trust.Others[1] == FALSE & 
                                                                                             Prosocial.Trust.Others[2] == TRUE))

# determine if move away from trust
away.from.trust = only.coherent.cases %>% group_by(UnifiedRespNum) %>% summarise(Away.From.Trust.Over.Time = 
                                                                                          (Prosocial.Trust.Others[1] == TRUE & 
                                                                                           Prosocial.Trust.Others[2] == FALSE))

# determine if move towards tolerance
towards.tolerance = only.coherent.cases %>% group_by(UnifiedRespNum) %>% summarise(Towards.Tolerance.Over.Time = 
                                                                                 (Prosocial.Tolerance.Of.Others[1] == FALSE & 
                                                                                  Prosocial.Tolerance.Of.Others[2] == TRUE))

# determine if move away from tolerance
away.from.tolerance = only.coherent.cases %>% group_by(UnifiedRespNum) %>% summarise(From.Tolerance.Over.Time = 
                                                                                     (Prosocial.Tolerance.Of.Others[1] == TRUE & 
                                                                                        Prosocial.Tolerance.Of.Others[2] == FALSE))

# inner join all this stuff
changing.table = inner_join(towards.sn, from.sn) %>% inner_join(towards.nat) %>% 
  inner_join(from.nat) %>% inner_join(towards.sn.affiliation) %>% inner_join(from.sn.affiliation) %>% inner_join(towards.trust) %>% 
  inner_join(away.from.trust) %>% inner_join(towards.tolerance) %>% inner_join(away.from.tolerance)

# grab measures for early and late wave for each participant. see how effective they are in predicting change.
only.coherent.cases = only.coherent.cases %>% arrange(UnifiedRespNum, Wave)
first.wave.data = only.coherent.cases %>% filter(row_number() %% 2 == 1)
second.wave.data = only.coherent.cases %>% filter(row_number() %% 2 == 0)

wave.keeps = c("UnifiedRespNum","SuperNatural.WV", "Natural.WV", "WVC.Supernaturalist", "Prosocial.Trust.Others", "Prosocial.Tolerance.Of.Others", "Country")

first.wave.data = first.wave.data %>% select(wave.keeps)
second.wave.data = second.wave.data %>% select(wave.keeps[1:6])

first.wave.names = names(first.wave.data)
first.wave.names = paste0("First.Wave", first.wave.names)
names(first.wave.data) = first.wave.names
names(first.wave.data)[1] = "UnifiedRespNum"

second.wave.names = names(second.wave.data)
second.wave.names = paste0("Second.Wave", second.wave.names)
names(second.wave.data) = second.wave.names
names(second.wave.data)[1] = "UnifiedRespNum"

changing.table.with.predictors = inner_join(changing.table, first.wave.data) %>% inner_join(second.wave.data)


wv.change.data = changing.table.with.predictors %>% select(c(first.wave.names[4:7], "Towards.Natural.Over.Time", "Towards.SN.Over.Time"))
wv.change.data.orig = wv.change.data
wv.change.data = wv.change.data %>% mutate_all(function(x) as.numeric(as.logical(x)))
wv.change.data$First.WaveCountry = wv.change.data.orig$First.WaveCountry
wv.change.data = wv.change.data %>% 
                      gather(key="Change.Type", "Change.Occurred", c("Towards.Natural.Over.Time", "Towards.SN.Over.Time"))  %>% 
                      filter(Change.Occurred == 1) %>%
                      select(1:5)

tnat.change.all = wv.change.data %>% filter(Change.Type == "Towards.Natural.Over.Time")
tnat.change = tnat.change.all$First.WaveProsocial.Tolerance.Of.Others

tsn.change.all = wv.change.data %>% filter(Change.Type == "Towards.SN.Over.Time")
tsn.change = tsn.change.all$First.WaveProsocial.Tolerance.Of.Others

t.test(tnat.change, tsn.change)

trust.sn.change = tsn.change.all$First.WaveProsocial.Trust.Others
trust.nat.change =  tnat.change.all$First.WaveProsocial.Trust.Others

t.test(trust.nat.change, trust.sn.change)

wv.change.data = wv.change.data %>% mutate_all(function(x) as.factor(x))

# affiliation
aff.change.data = changing.table.with.predictors %>% select(c(first.wave.names[c(2:3,5:7)], "Towards.SN.Affiliation.Over.Time", "Away.From.SN.Affiliation.Over.Time"))
aff.change.data.orig = aff.change.data
aff.change.data = aff.change.data %>% mutate_all(function(x) as.numeric(as.logical(x)))
aff.change.data$First.WaveCountry = aff.change.data.orig$First.WaveCountry
aff.change.data = aff.change.data %>% 
  gather(key="Change.Type", "Change.Occurred", c("Towards.SN.Affiliation.Over.Time", "Away.From.SN.Affiliation.Over.Time"))  %>% 
  filter(Change.Occurred == 1) %>% filter(First.WaveSuperNatural.WV == 1) %>%
  select(1:6)

taff.change.all = aff.change.data %>% filter(Change.Type == "Towards.SN.Affiliation.Over.Time")
taff.change = as.logical(as.numeric(as.character(taff.change.all$First.WaveProsocial.Trust.Others)))

aaff.change.all = aff.change.data %>% filter(Change.Type == "Away.From.SN.Affiliation.Over.Time")
aaff.change = as.logical(as.numeric(as.character(aaff.change.all$First.WaveProsocial.Trust.Others)))

t.test(aaff.change, taff.change) # more trusting of others

tolerance.taff.change = as.logical(as.numeric(as.character(taff.change.all$First.WaveProsocial.Tolerance.Of.Others)))
tolerance.aaff.change = as.logical(as.numeric(as.character(aaff.change.all$First.WaveProsocial.Tolerance.Of.Others)))

t.test(tolerance.aaff.change, tolerance.taff.change) # difference between groups for tolerance of others

aff.change.data = aff.change.data %>% mutate_all(function(x) as.factor(x)) %>% select(3:5)


