library(tidyverse)
library(gridExtra)
delta.data = read.csv("figure-9-data.csv", header=T)
rq.1.delta.plot = ggplot(delta.data, aes(x=Change.In.Outgroup.Suspicion.During.Affiliation))+geom_density(fill="#0868ac", alpha=0.67)+
  xlab("Change In Outgroup Suspicion During Agent's Time Affiliated")+
  ylab("% of Agent Data")