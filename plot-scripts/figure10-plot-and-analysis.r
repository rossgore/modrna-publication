library(tidyverse)
library(gridExtra)
rq.2.data = read.csv("figure-10-data.csv", header=T)
rq.2.data$Pro.Social.Action.Type <- factor(rq.2.data$Pro.Social.Action.Type, levels = c("Tribal", "Ideological", "Universal"))
rq.2.data$Worldview <- factor(rq.2.data$Worldview, levels = c("Supernatural", "Natural"))
rq.2.data$Measure.Type <- factor(rq.2.data$Measure.Type, levels = c("Opp.Being.Generated", "Accepting.Opp"))
rq.2.plot1.gen = ggplot( (rq.2.data %>% filter(Measure.Type == "Opp.Being.Generated")), 
                         aes(x=Pro.Social.Action.Type, y=Likelihood, fill=Pro.Social.Action.Type))+
                         geom_bar(stat="identity")+facet_grid(Affiliation.Status ~ Worldview)+
                         xlab("Pro-social Action Type Generated")+guides(fill=FALSE)+ylim(0,1)

rq.2.data = read.csv("~/Downloads/plos-modrna/RQ2-AffiliationStats.csv", header=T)
rq.2.data$Pro.Social.Action.Type <- factor(rq.2.data$Pro.Social.Action.Type, levels = c("Tribal", "Ideological", "Universal"))
rq.2.data$Worldview <- factor(rq.2.data$Worldview, levels = c("Supernatural", "Natural"))
rq.2.data$Measure.Type <- factor(rq.2.data$Measure.Type, levels = c("Opp.Being.Generated", "Accepting.Opp"))
rq.2.plot1.acc = ggplot( (rq.2.data %>% filter(Measure.Type == "Accepting.Opp")), 
                         aes(x=Pro.Social.Action.Type, y=Likelihood, fill=Pro.Social.Action.Type))+
  geom_bar(stat="identity")+facet_grid(Affiliation.Status ~ Worldview)+
  xlab("Pro-social Action Type Accepted")+guides(fill=FALSE)+ylim(0,1)

grid.arrange(rq.2.plot1.gen, rq.2.plot1.acc, ncol=2)