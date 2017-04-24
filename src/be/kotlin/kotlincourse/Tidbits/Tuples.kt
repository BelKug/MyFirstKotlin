package be.kotlin.kotlincourse.Tidbits

/**
 * Created by guyheylens on 17/04/17.
 */


/*
Pair and Triple are just data classes
 */


fun capitalAndPopulation(country: String): Pair<String, Long>{
    if(country == "Spain"){
        return Pair("Madrid", 2300000)
    } else {
        return Pair("Brussels", 1500000)
    }
}

fun countryInformation(country: String): Triple<String, String, Long>{
    if(country == "Spain"){
        return Triple("Madrid","Europe",2300000)
    } else {
        return Triple("No info", "Europe",0)
    }
}

fun main(args: Array<String>) {
    val result = capitalAndPopulation("UK")

    println(result.first)
    println(result.second)

    val countryInfo = countryInformation("Spain")
    println(countryInfo.first)
    println(countryInfo.second)
    println(countryInfo.third)

    val(capital, continent, population) = countryInformation("Spain")
    println(capital)
    println(continent)
    println(population)



    val listCapitalsAndCountries = listOf(Pair("Madrid","Spain"), "Paris" to "France")
    for ((capital2, country) in listCapitalsAndCountries){
        println("$capital2 - $country")
    }
}