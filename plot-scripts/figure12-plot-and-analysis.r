library(tidyverse)
library(gridExtra)

rq2.post.affiliated.data = read.csv("~/Downloads/plos-modrna/RQ2-Change.In.Outgroup.Susp.After.Leaving.csv", header=T)
rq2.post.affiliated.plot = ggplot(rq2.post.affiliated.data, aes(x=Time.Steps.After.Leaving, y=Change.In.Outgroup.Suspicion))+ geom_point()+geom_smooth(se=FALSE)