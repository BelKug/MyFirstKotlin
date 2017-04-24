package be.kotlin.kotlincourse.basics

/**
 * Created by guyheylens on 10/04/17.
 */
fun main(args: Array<String>) {
    var myString = "test"

    if(myString != " "){
        println("Not empty")
    } else if(myString.startsWith("a")){
        println("string starts with an A")
    } else {
        println("Empty")
    }

    //if as an expression
    val result = if(myString != " "){
            true
            20 // cast to Any! => in c# Object
        } else {
            false
        }



    when(result){
        is String -> println("Excellent")
        is Int -> println("Number")
        "Value" -> println("Is a value")
    }

    println(result)
}