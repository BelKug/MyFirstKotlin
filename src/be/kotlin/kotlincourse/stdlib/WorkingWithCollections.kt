package be.kotlin.kotlincourse.stdlib

/**
 * Created by guyheylens on 17/04/17.
 */


fun main(args: Array<String>) {

    var list: List<String> = ArrayList<String>()

    var list2 = listOf("Hello", "London","Brussels","test")

    val numbers = 1..100

    val cities = listOf("London","Brussels", "Paris")
    println(cities.javaClass)

    //mutable list
    val mutableCities = mutableListOf("London", "Madrid")
    mutableCities.add("Brussels")


    val hashMap = hashMapOf(Pair("Madrid", "Spain"))


}
