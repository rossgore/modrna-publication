library(GGally)
getCountryW4 <- function(country.code) {
	if (country.code == 8)
	{
		return ("Albania")
	}
	if (country.code == 12)
	{
		return ("Algeria")
	}
	if (country.code == 32)
	{
		return ("Argentina")
	}
	if (country.code == 50)
	{
		return ("Bangladesh")
	}
	if (country.code == 70)
	{
		return ("Bosnia Herzegovina")
	}
	if (country.code == 124)
	{
		return ("Canada")
	}
	if (country.code == 152)
	{
		return ("Chile")
	}
	if (country.code == 156)
	{
		return ("China")
	}
	if (country.code == 356)
	{
		return ("India")
	}
	if (country.code == 360)
	{
		return ("Indonesia")
	}
	if (country.code == 364)
	{
		return ("Iran")
	}
	if (country.code == 368)
	{
		return ("Iraq")
	}
	if (country.code == 376)
	{
		return ("Israel")
	}
	if (country.code == 392)
	{
		return ("Japan")
	}
	if (country.code == 400)
	{
		return ("Jordan")
	}
	if (country.code == 410)
	{
		return ("South Korea")
	}
	if (country.code == 417)
	{
		return ("Kyrgyzstan")
	}
	if (country.code == 484)
	{
		return ("Mexico")
	}
	if (country.code == 498)
	{
		return ("Moldova")
	}
	if (country.code == 504)
	{
		return ("Morocco")
	}
	if (country.code == 566)
	{
		return ("Nigeria")
	}
	if (country.code == 586)
	{
		return ("Pakistan")
	}
	if (country.code == 604)
	{
		return ("Peru")
	}
	if (country.code == 608)
	{
		return ("Philippines")
	}
	if (country.code == 630)
	{
		return ("Puerto Rico")
	}
	if (country.code == 682)
	{
		return ("Saudi Arabia")
	}
	if (country.code == 702)
	{
		return ("Singapore")
	}
	if (country.code == 704)
	{
		return ("Vietnam")
	}
	if (country.code == 710)
	{
		return ("South Africa")
	}
	if (country.code == 716)
	{
		return ("Zimbabwe")
	}
	if (country.code == 724)
	{
		return ("Spain")
	}
	if (country.code == 752)
	{
		return ("Sweden")
	}
	if (country.code == 792)
	{
		return ("Turkey")
	}
	if (country.code == 800)
	{
		return ("Uganda")
	}
	if (country.code == 807)
	{
		return ("Macedonia")
	}
	if (country.code == 818)
	{
		return ("Egypt")
	}
	if (country.code == 834)
	{
		return ("Tanzania")
	}
	if (country.code == 840)
	{
		return ("United States")
	}
	if (country.code == 862)
	{
		return ("Venezuela")
	}
	if (country.code == 911)
	{
		return ("Serbia")
	}
	if (country.code == 912)
	{
		return ("Montenegro")
	}
}
getCountryW2 <- function(country.code) {
	if (country.code == 32)
	{
		return ("Argentina")
	}
	if (country.code == 76)
	{
		return ("Brazil")
	}
	if (country.code == 112)
	{
		return ("Belarus")
	}
	if (country.code == 152)
	{
		return ("Chile")
	}
	if (country.code == 156)
	{
		return ("China")
	}
	if (country.code == 203)
	{
		return ("Czech Rep.")
	}
	if (country.code == 356)
	{
		return ("India")
	}
	if (country.code == 392)
	{
		return ("Japan")
	}
	if (country.code == 410)
	{
		return ("South Korea")
	}
	if (country.code == 484)
	{
		return ("Mexico")
	}
	if (country.code == 566)
	{
		return ("Nigeria")
	}
	if (country.code == 616)
	{
		return ("Poland")
	}
	if (country.code == 643)
	{
		return ("Russia")
	}
	if (country.code == 703)
	{
		return ("Slovakia")
	}
	if (country.code == 710)
	{
		return ("South Africa")
	}
	if (country.code == 724)
	{
		return ("Spain")
	}
	if (country.code == 756)
	{
		return ("Switzerland")
	}
	if (country.code == 792)
	{
		return ("Turkey")
	}
}

getAffiliationWithReligion <- function(v147.code) {
	if ((v147.code > 0 ) & (v147.code < 4 ))
	{
		return (TRUE)
	}
	return (FALSE)
}

getSupernaturalWorldView <- function(v166.code, v170.code, v171.code)
{
	if ((v166.code == 1) | (v170.code == 1) | (v171.code == 1))
	{
		return (TRUE)
	}
	return (FALSE)
}

getAffiliationWithNonReligion <- function(v34.code, v151.code)
{
	return (FALSE)
}

getNaturalWorldView <- function(v166.code, v170.code, v171.code)
{
	if ((v170.code == 2) & (v171.code == 2) & (v166.code == 2))
	{
		return (TRUE)
	}
	return (FALSE)
}

isProSocialTribal <- function (v38.code, isAffiliatedSupernaturalist, v52.code, isAffiliatedNaturalist)
{
	if ((isAffiliatedSupernaturalist == TRUE) & (v38.code == 1))
	{
		return (TRUE)
	}
	return (FALSE)
}

isProSocialIdeological <- function (v40.code, v41.code, v42.code, v45.code)
{
	if (v40.code == 1)
	{
		return (TRUE)
	}
	if (v41.code == 1)
	{
		return (TRUE)
	}
	if (v42.code == 1)
	{
		return (TRUE)
	}
	if (v45.code == 1)
	{
		return (TRUE)
	}
	return (FALSE)
}

isProSocialUniversal <- function (v37.code, v39.code, v43.code, v44.code, v46.code, v47.code, v48.code, v49.code, v50.code, v51.code)
{
	if (v37.code == 1)
	{
		return (TRUE)
	}
	if (v39.code == 1)
	{
		return (TRUE)
	}
	if (v43.code == 1)
	{
		return (TRUE)
	}
	if (v44.code == 1)
	{
		return (TRUE)
	}
	if (v46.code == 1)
	{
		return (TRUE)
	}
	if (v47.code == 1)
	{
		return (TRUE)
	}
	if (v48.code == 1)
	{
		return (TRUE)
	}
	if (v49.code == 1)
	{
		return (TRUE)
	}
	if (v50.code == 1)
	{
		return (TRUE)
	}
	if (v51.code == 1)
	{
		return (TRUE)
	}
	return (FALSE)
}

getTrust <- function (v94.code)
{
	if (v94.code == 1)
	{
		return (TRUE)
	}
	return (FALSE)
}

getTolerance <- function (v70.code, v77.code)
{
	#if ((v70.code == 2) & (v77.code == 2))
	if ((v70.code == 2) | (v77.code == 2))
	{
		return (TRUE)
	}
	return (FALSE)
}

wave.2.data = readRDS("F00008311-WV2_Data_R_v20180912.rds")
wave.4.data = readRDS("F00008071-WV4_Data_R_v20180912.rds")
wave.2.keeps = c("V2", "V34", "V37", "V38", "V39", "V40", "V41", "V42", "V43", "V44",  "V45", "V46", "V47", "V48", "V49", "V50", "V51", "V52", "V70", "V77", "V94", "V147", "V151", "V166", "V170", "V171")
wave.4.keeps = c("V2", "V53", "V54", "V55", "V56", "V57", "V58", "V59", "V60", "V61", "V62", "V63", "V64", "V65", "V66", "V61", "V67", "V67B", "V69", "V73", "V25", "V185", "V186", "V191", "V194", "V195")

wave.2.data = wave.2.data[,wave.2.keeps]
wave.4.data = wave.4.data[,wave.4.keeps]
colnames(wave.4.data) = wave.2.keeps

wave.2.data$Country = unlist(lapply(wave.2.data$V2, getCountryW2))
wave.2.data$Wave = 2

wave.4.data$Country = unlist(lapply(wave.4.data$V2, getCountryW4))
wave.4.data$Wave = 4

waves.data = rbind.data.frame(wave.2.data, wave.4.data)

waves.data$WVC.Supernaturalist = unlist(lapply(waves.data$V147, getAffiliationWithReligion))
waves.data$SuperNatural.WV = unlist(mapply(getSupernaturalWorldView, waves.data$V166, waves.data$V170, waves.data$V171))
waves.data$Natural.WV = unlist(mapply(getNaturalWorldView, waves.data$V166, waves.data$V170, waves.data$V171))

only.coherent.cases.snwv.only = subset(waves.data, SuperNatural.WV == TRUE & WVC.Supernaturalist == FALSE & Natural.WV == FALSE)
only.coherent.cases.nwv.only = subset(waves.data, Natural.WV == TRUE & WVC.Supernaturalist == FALSE & SuperNatural.WV == FALSE)

only.coherent.cases.asn = subset(waves.data, WVC.Supernaturalist == TRUE & SuperNatural.WV == TRUE & Natural.WV == FALSE)

only.coherent.cases = rbind.data.frame(only.coherent.cases.snwv.only, only.coherent.cases.nwv.only, only.coherent.cases.asn)

# now filter for only concrete responses for tribal: V38 and V52
only.coherent.cases = subset(only.coherent.cases, (V38 == 1 | V38 == 2) & (V52 == 1 | V52 == 2))
only.coherent.cases$Prosocial.Action.Tribal = unlist(mapply(isProSocialTribal, only.coherent.cases$V38, only.coherent.cases$WVC.Supernaturalist))

# now filter for only concrete responses for ideological: V40, V41, V42 and V45
only.coherent.cases = subset(only.coherent.cases, (V40 == 1 | V40 == 2) & (V41 == 1 | V41 == 2) & (V42 == 1 | V42 == 2) & (V45 == 1 | V45 == 2))
only.coherent.cases$Prosocial.Action.Ideological = unlist(mapply(isProSocialIdeological, only.coherent.cases$V40, only.coherent.cases$V41, only.coherent.cases$V42, only.coherent.cases$V45))

# now filter for only concrete responses for universal: V37, V39, V43, V44, V46, V47, V48, V49, V50, V51
only.coherent.cases = subset(only.coherent.cases, (V37 == 1 | V37 == 2) & (V39 == 1 | V39 == 2) & (V43 == 1 | V43 == 2) & (V44 == 1 | V44 == 2) & (V46 == 1 | V46 == 2) & (V47 == 1 | V47 == 2) & (V48 == 1 | V48 == 2) & (V49 == 1 | V49 == 2) & (V50 == 1 | V50 == 2) & (V51 == 1 | V51 == 2))
only.coherent.cases$Prosocial.Action.Universal = unlist(mapply(isProSocialUniversal, only.coherent.cases$V37, only.coherent.cases$V39, only.coherent.cases$V43, only.coherent.cases$V44, only.coherent.cases$V46, only.coherent.cases$V47, only.coherent.cases$V48, only.coherent.cases$V49, only.coherent.cases$V50, only.coherent.cases$V51))

only.coherent.cases$Prosocial.Action.Any.Type = (only.coherent.cases$Prosocial.Action.Tribal | only.coherent.cases$Prosocial.Action.Ideological | only.coherent.cases$Prosocial.Action.Universal)
only.coherent.cases$Prosocial.Action.Any.Type.Non.Tribal = (only.coherent.cases$Prosocial.Action.Ideological | only.coherent.cases$Prosocial.Action.Universal)
# now filter for only concrete responses for trusting of others: V94

only.coherent.cases = subset(only.coherent.cases, (V94 == 1 | V94 == 2))
only.coherent.cases$Prosocial.Trust.Others = unlist(mapply(getTrust, only.coherent.cases$V94))

# now filter for only concrete responses for tolerating of others: V70, V77
only.coherent.cases = subset(only.coherent.cases, (V70 == 1 | V70 == 2) & (V77 == 1 | V77 == 2))
only.coherent.cases$Prosocial.Tolerance.Of.Others = unlist(mapply(getTolerance, only.coherent.cases$V70, only.coherent.cases$V77))

print(nrow(only.coherent.cases))

only.coherent.cases.snwv.only = subset(only.coherent.cases, SuperNatural.WV == TRUE & WVC.Supernaturalist == FALSE & Natural.WV == FALSE)
only.coherent.cases.nwv.only = subset(only.coherent.cases, Natural.WV == TRUE & WVC.Supernaturalist == FALSE & SuperNatural.WV == FALSE)
only.coherent.cases.asn = subset(only.coherent.cases, WVC.Supernaturalist == TRUE & SuperNatural.WV == TRUE & Natural.WV == FALSE)


print("Population Breakdown")
print(paste("Unaffiliated Supernatural Worldview", nrow(only.coherent.cases.snwv.only)))
print(paste("Unaffiliated Natural Worldview", nrow(only.coherent.cases.nwv.only)))
print(paste("Affiliated Supernatural Worldview", nrow(only.coherent.cases.asn)))

print("Tribal Breakdown")
print(paste("Affiliated Supernatural Worldview", nrow(subset(only.coherent.cases.asn, Prosocial.Action.Tribal==TRUE))))


print("Ideological Breakdown")
print(paste("Unaffiliated Supernatural Worldview", nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Ideological==TRUE))))
print(paste("Unaffiliated Natural Worldview", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Ideological==TRUE))))
print(paste("Affiliated Supernatural Worldview", nrow(subset(only.coherent.cases.asn, Prosocial.Action.Ideological==TRUE))))

print("Universal Breakdown")
print(paste("Unaffiliated Supernatural Worldview", nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Universal==TRUE))))
print(paste("Unaffiliated Natural Worldview", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Universal==TRUE))))
print(paste("Affiliated Supernatural Worldview", nrow(subset(only.coherent.cases.asn, Prosocial.Action.Universal==TRUE))))

print("Any Type Non-Tribal Breakdown")
print(paste("Unaffiliated Supernatural Worldview", nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Any.Type.Non.Tribal==TRUE))))
print(paste("Unaffiliated Natural Worldview", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Any.Type.Non.Tribal==TRUE))))
print(paste("Affiliated Supernatural Worldview", nrow(subset(only.coherent.cases.asn, Prosocial.Action.Any.Type.Non.Tribal==TRUE))))

print("Any Type Breakdown")
print(paste("Unaffiliated Supernatural Worldview", nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Any.Type==TRUE))))
print(paste("Unaffiliated Natural Worldview", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Any.Type==TRUE))))
print(paste("Affiliated Supernatural Worldview", nrow(subset(only.coherent.cases.asn, Prosocial.Action.Any.Type==TRUE))))

print("Trust Breakdown")
print(paste("Unaffiliated Supernatural Worldview", nrow(subset(only.coherent.cases.snwv.only, Prosocial.Trust.Others==TRUE))))
print(paste("Unaffiliated Natural Worldview", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Trust.Others==TRUE))))
print(paste("Affiliated Supernatural Worldview", nrow(subset(only.coherent.cases.asn, Prosocial.Trust.Others==TRUE))))

print("Tolerance")
print(paste("Unaffiliated Supernatural Worldview", nrow(subset(only.coherent.cases.snwv.only, Prosocial.Tolerance.Of.Others==TRUE))))
print(paste("Unaffiliated Natural Worldview", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Tolerance.Of.Others==TRUE))))
print(paste("Affiliated Supernatural Worldview", nrow(subset(only.coherent.cases.asn, Prosocial.Tolerance.Of.Others==TRUE))))

print("Control for Affiliation, Test Worldview")


print("t-test: Ideological")
print("Unaffiliated")
ideological.snwv = as.numeric(only.coherent.cases.snwv.only$Prosocial.Action.Ideological)
ideological.nwv = as.numeric(only.coherent.cases.nwv.only$Prosocial.Action.Ideological)
t.test(ideological.snwv,ideological.nwv,alternative="greater")

print("t-test: Universal")
print("Unaffiliated")
universal.snwv = as.numeric(only.coherent.cases.snwv.only$Prosocial.Action.Universal)
universal.nwv = as.numeric(only.coherent.cases.nwv.only$Prosocial.Action.Universal)
t.test(universal.snwv,universal.nwv,alternative="greater")

print("t-test: Non-Tribal Type - here it is either ideological or universal")
print("Unaffiliated")
anytype.non.tribal.snwv = as.numeric(only.coherent.cases.snwv.only$Prosocial.Action.Any.Type.Non.Tribal)
anytype.non.tribal.nwv = as.numeric(only.coherent.cases.nwv.only$Prosocial.Action.Any.Type.Non.Tribal)

t.test(anytype.non.tribal.snwv,anytype.non.tribal.nwv,alternative="greater")

print("t-test: Trust")

print("Unaffiliated")
trust.snwv = as.numeric(only.coherent.cases.snwv.only$Prosocial.Trust.Others)
trust.nwv = as.numeric(only.coherent.cases.nwv.only$Prosocial.Trust.Others)
t.test(trust.snwv,trust.nwv,alternative="greater")

print("t-test: Tolerance")
print("Unaffiliated")
tolerance.snwv = as.numeric(only.coherent.cases.snwv.only$Prosocial.Tolerance.Of.Others)
tolerance.nwv = as.numeric(only.coherent.cases.nwv.only$Prosocial.Tolerance.Of.Others)
print("supernatural worldview greater?")
t.test(tolerance.snwv,tolerance.nwv,alternative="greater")

print("Control for Worldview, Test Affiliation")
print("t-test: Ideological")
print("Supernatural")
ideological.snwv = as.numeric(only.coherent.cases.snwv.only$Prosocial.Action.Ideological)
ideological.snwvc = as.numeric(only.coherent.cases.asn$Prosocial.Action.Ideological)
t.test(ideological.snwvc,ideological.snwv,alternative="greater")

print("t-test: Universal")
print("Supernatural")
universal.snwv = as.numeric(only.coherent.cases.snwv.only$Prosocial.Action.Universal)
universal.snwvc = as.numeric(only.coherent.cases.asn$Prosocial.Action.Universal)
t.test(universal.snwvc,universal.snwv,alternative="greater")

print("t-test: Non-Tribal Type")
print("Supernatural")
anytype.non.tribal.snwv = as.numeric(only.coherent.cases.snwv.only$Prosocial.Action.Any.Type.Non.Tribal)
anytype.non.tribal.snwvc = as.numeric(only.coherent.cases.asn$Prosocial.Action.Any.Type.Non.Tribal)
t.test(anytype.non.tribal.snwvc,anytype.non.tribal.snwv,alternative="greater")

print("t-test: Any Type")
print("Supernatural")
anytype.snwv = as.numeric(only.coherent.cases.snwv.only$Prosocial.Action.Any.Type)
anytype.snwvc = as.numeric(only.coherent.cases.asn$Prosocial.Action.Any.Type)
t.test(anytype.snwvc,anytype.snwv,alternative="greater")

print("t-test: Trust")
print("Supernatural")
trust.snwv = as.numeric(only.coherent.cases.snwv.only$Prosocial.Trust.Others)
trust.snwvc = as.numeric(only.coherent.cases.asn$Prosocial.Trust.Others)
t.test(trust.snwvc,trust.snwv,alternative="greater")

print("t-test: Tolerance")
print("Supernatural")
tolerance.snwv = as.numeric(only.coherent.cases.snwv.only$Prosocial.Tolerance.Of.Others)
tolerance.snwvc = as.numeric(only.coherent.cases.asn$Prosocial.Tolerance.Of.Others)
t.test(tolerance.snwvc,tolerance.snwv,alternative="greater")


print("Worldview Breakdown")
print(paste("Supernatural Worldview", (nrow(only.coherent.cases.snwv.only)+ nrow(only.coherent.cases.asn))))
print(paste("Natural Worldview", (nrow(only.coherent.cases.nwv.only))))

print("Tribal Breakdown")
print(paste("Supernatural Worldview", nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Tribal==TRUE))+nrow(subset(only.coherent.cases.asn, Prosocial.Action.Tribal==TRUE))))

print("Ideological Breakdown")
print(paste("Supernatural Worldview", nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Ideological==TRUE))+nrow(subset(only.coherent.cases.asn, Prosocial.Action.Ideological==TRUE))))
print(paste("Natural Worldview", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Ideological==TRUE))))

print("Universal Breakdown")
print(paste("Supernatural Worldview", nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Universal==TRUE))+nrow(subset(only.coherent.cases.asn, Prosocial.Action.Universal==TRUE))))
print(paste("Natural Worldview", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Universal==TRUE))))

print("Any Type Breakdown")
print(paste("Supernatural Worldview", nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Any.Type==TRUE))+nrow(subset(only.coherent.cases.asn, Prosocial.Action.Any.Type==TRUE))))
print(paste("Natural Worldview", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Any.Type==TRUE))))

print("Any Type Non Tribal Breakdown")
print(paste("Supernatural Worldview", nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Any.Type.Non.Tribal==TRUE))+nrow(subset(only.coherent.cases.asn, Prosocial.Action.Any.Type.Non.Tribal==TRUE))))
print(paste("Natural Worldview", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Any.Type.Non.Tribal==TRUE))))

only.coherent.cases.sn.only = rbind.data.frame(only.coherent.cases.snwv.only, only.coherent.cases.asn)
only.coherent.cases.n.only = only.coherent.cases.nwv.only

print("t-test: Idelogical")
ideological.sn = as.numeric(only.coherent.cases.sn.only$Prosocial.Action.Ideological)
ideological.n = as.numeric(only.coherent.cases.n.only$Prosocial.Action.Ideological)
t.test(ideological.sn,ideological.n,alternative="greater")

print("t-test: Universal")
universal.sn = as.numeric(only.coherent.cases.sn.only$Prosocial.Action.Universal)
universal.n = as.numeric(only.coherent.cases.n.only$Prosocial.Action.Universal)
t.test(universal.sn,universal.n,alternative="greater")

print("t-test: Any Type")
any.type.sn = as.numeric(only.coherent.cases.sn.only$Prosocial.Action.Any.Type)
any.type.n = as.numeric(only.coherent.cases.n.only$Prosocial.Action.Any.Type)
t.test(any.type.sn,any.type.n,alternative="greater")

print("t-test: Non-Tribal")
non.tribal.sn = as.numeric(only.coherent.cases.sn.only$Prosocial.Action.Any.Type.Non.Tribal)
non.tribal.n = as.numeric(only.coherent.cases.n.only$Prosocial.Action.Any.Type.Non.Tribal)
t.test(non.tribal.sn,non.tribal.n,alternative="greater")

print("t-test: Trust")
trust.sn = as.numeric(only.coherent.cases.sn.only$Prosocial.Trust.Others)
trust.n = as.numeric(only.coherent.cases.n.only$Prosocial.Trust.Others)
t.test(trust.sn,trust.n,alternative="less")

print("t-test: Tolerance")
tolerance.sn = as.numeric(only.coherent.cases.sn.only$Prosocial.Tolerance.Of.Others)
tolerance.n = as.numeric(only.coherent.cases.n.only$Prosocial.Tolerance.Of.Others)
t.test(tolerance.sn,tolerance.n,alternative="less")


print("Affiliation Breakdown")
print(paste("Affiliated", nrow(only.coherent.cases.asn)))
print(paste("Unaffiliated ", (nrow(only.coherent.cases.nwv.only)+nrow(only.coherent.cases.snwv.only))))

print("Tribal Breakdown")
print(paste("Affiliated", nrow(subset(only.coherent.cases.asn, Prosocial.Action.Tribal==TRUE))))
print(paste("Unaffiliated", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Tribal==TRUE))+nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Tribal==TRUE))))

print("Ideological Breakdown")
print(paste("Affiliated", nrow(subset(only.coherent.cases.asn, Prosocial.Action.Ideological==TRUE))))
print(paste("Unaffiliated", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Ideological==TRUE))+nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Ideological==TRUE))))

print("Universal Breakdown")
print(paste("Affiliated", nrow(subset(only.coherent.cases.asn, Prosocial.Action.Universal==TRUE))))
print(paste("Unaffiliated", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Universal==TRUE))+nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Universal==TRUE))))

print("Any Type Breakdown")
print(paste("Affiliated", nrow(subset(only.coherent.cases.asn, Prosocial.Action.Any.Type==TRUE))))
print(paste("Unaffiliated", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Any.Type==TRUE))+nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Any.Type==TRUE))))

print("Any Type Non-Tribal ")
print(paste("Affiliated", nrow(subset(only.coherent.cases.asn, Prosocial.Action.Any.Type.Non.Tribal==TRUE))))
print(paste("Unaffiliated", nrow(subset(only.coherent.cases.nwv.only, Prosocial.Action.Any.Type.Non.Tribal==TRUE))+nrow(subset(only.coherent.cases.snwv.only, Prosocial.Action.Any.Type.Non.Tribal==TRUE))))


only.coherent.cases.aff.only = only.coherent.cases.asn
only.coherent.cases.unaff.only = rbind.data.frame(only.coherent.cases.snwv.only, only.coherent.cases.nwv.only)

print("t-test: Idelogical")
ideological.aff = as.numeric(only.coherent.cases.aff.only$Prosocial.Action.Ideological)
ideological.unaff = as.numeric(only.coherent.cases.unaff.only$Prosocial.Action.Ideological)
t.test(ideological.aff,ideological.unaff,alternative="greater")

print("t-test: Universal")
universal.aff = as.numeric(only.coherent.cases.aff.only$Prosocial.Action.Universal)
universal.unaff = as.numeric(only.coherent.cases.unaff.only$Prosocial.Action.Universal)
t.test(universal.aff,universal.unaff,alternative="greater")

print("t-test: Any Type")
any.type.aff = as.numeric(only.coherent.cases.aff.only$Prosocial.Action.Any.Type)
any.type.unaff = as.numeric(only.coherent.cases.unaff.only$Prosocial.Action.Any.Type)
t.test(any.type.aff,any.type.unaff,alternative="greater")

print("t-test: Non-Tribal")
non.tribal.aff = as.numeric(only.coherent.cases.aff.only$Prosocial.Action.Any.Type.Non.Tribal)
non.tribal.unaff = as.numeric(only.coherent.cases.unaff.only$Prosocial.Action.Any.Type.Non.Tribal)
t.test(non.tribal.aff,non.tribal.unaff,alternative="greater")

print("t-test: Trust")
trust.aff = as.numeric(only.coherent.cases.aff.only$Prosocial.Trust.Others)
trust.unaff = as.numeric(only.coherent.cases.unaff.only$Prosocial.Trust.Others)
t.test(trust.aff,trust.unaff,alternative="less")

print("t-test: Tolerance")
tolerance.aff = as.numeric(only.coherent.cases.aff.only$Prosocial.Tolerance.Of.Others)
tolerance.unaff = as.numeric(only.coherent.cases.unaff.only$Prosocial.Tolerance.Of.Others)
t.test(tolerance.aff,tolerance.unaff,alternative="less")


print("Affiliation Supernatural Worldview vs. Unaffiliated Naturalist T-Test")

print("t-test: Idelogical")
ideological.an = as.numeric(only.coherent.cases.nwv.only$Prosocial.Action.Ideological)
ideological.asn = as.numeric(only.coherent.cases.asn$Prosocial.Action.Ideological)
t.test(ideological.an,ideological.asn,alternative="greater")

print("t-test: Universal")
universal.an = as.numeric(only.coherent.cases.nwv.only$Prosocial.Action.Universal)
universal.asn = as.numeric(only.coherent.cases.asn$Prosocial.Action.Universal)
t.test(universal.an,universal.asn,alternative="greater")

print("t-test: Any Type")
any.type.an = as.numeric(only.coherent.cases.nwv.only$Prosocial.Action.Any.Type)
any.type.asn = as.numeric(only.coherent.cases.asn$Prosocial.Action.Any.Type)
t.test(any.type.an,any.type.asn,alternative="greater")

print("t-test: Non-Tribal")
non.tribal.an = as.numeric(only.coherent.cases.nwv.only$Prosocial.Action.Any.Type.Non.Tribal)
non.tribal.asn = as.numeric(only.coherent.cases.asn$Prosocial.Action.Any.Type.Non.Tribal)
t.test(non.tribal.an,non.tribal.asn,alternative="greater")

print("t-test: Trust")
trust.an = as.numeric(only.coherent.cases.nwv.only$Prosocial.Trust.Others)
trust.asn = as.numeric(only.coherent.cases.asn$Prosocial.Trust.Others)
t.test(trust.an,trust.asn,alternative="greater")

print("t-test: Tolerance")
tolerance.an = as.numeric(only.coherent.cases.nwv.only$Prosocial.Tolerance.Of.Others)
tolerance.asn = as.numeric(only.coherent.cases.asn$Prosocial.Tolerance.Of.Others)
t.test(tolerance.an,tolerance.asn,alternative="greater")