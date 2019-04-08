library(tidyverse)
library(gridExtra)
rq.1.sn.data = read.csv("figure-8-data.csv", header=T)
rq.1.sn.data$Social.Network.Type <- factor(rq.1.sn.data$Social.Network.Type, 
                                           levels = c("Supernatural Worldview Club", "Family", "Job", "Neighborhood", "Online", "Offline"))
rq.1.plot2 = ggplot(rq.1.sn.data, aes(x=Social.Network.Type, y=Size.Relative.To.Max.Total.Network.Size, fill=Social.Network.Type))+
  geom_bar(stat="identity")+facet_wrap(~ Affiliation.Status,ncol=1)+xlab("Social Network Type")+
  ylab("Size of Network Relative to Maximum Total Size of All Networks")+guides(fill=FALSE)+ylim(0,0.5)+
  coord_flip()