library(tidyverse)
library(gridExtra)

rq.2.sn.data = read.csv("figure-11-data.csv", header=T)
rq.2.sn.data$Social.Network.Type <- factor(rq.2.sn.data$Social.Network.Type, 
                                           levels = c("Supernatural Worldview Club", "Family", "Job", "Neighborhood", "Online", "Offline"))
rq.2.sn.data$Worldview <- factor(rq.2.sn.data$Worldview, levels = c("Supernatural", "Natural"))
rq.2.plot2 = ggplot(rq.2.sn.data, aes(x=Social.Network.Type, y=Size.Relative.To.Max.Total.Network.Size, fill=Social.Network.Type))+
  geom_bar(stat="identity")+facet_grid(Affiliation.Status~Worldview)+xlab("Social Network Type")+
  ylab("Size of Network Relative to Maximum Total Size of All Networks")+guides(fill=FALSE)+ylim(0,0.5)+
  coord_flip()