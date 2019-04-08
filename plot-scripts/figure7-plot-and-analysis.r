library(tidyverse)
library(gridExtra)
rq.1.data = read.csv("figure-7-data.csv", header=T)
rq.1.data$Pro.Social.Action.Type <- factor(rq.1.data$Pro.Social.Action.Type, levels = c("Tribal", "Ideological", "Universal"))
rq.1.data$Measure.Type <- factor(rq.1.data$Measure.Type, levels = c("Opp.Being.Generated", "Accepting.Opp"))
rq.1.plot1 = ggplot(rq.1.data, aes(x=Pro.Social.Action.Type, y=Likelihood, fill=Pro.Social.Action.Type))+geom_bar(stat="identity")+facet_grid(Measure.Type ~ Affiliation.Status)+xlab("Pro-social Action Type")+guides(fill=FALSE)+ylim(0,1)