package be.kotlin.kotlincourse.basics

/**
 * Created by guyheylens on 10/04/17.
 */
fun main(args: Array<String>) {
    for(a: Int in 1..100){
        println(a)
    }



    val numbers = 1..100

    for(a in numbers){
        println(a)
    }


    for(a in 100 downTo 1){
        println(a)
    }

    for(a in 100..1){
        println(a)
    }

    for(b in 100 downTo 1 step 5){
        println(b)
    }


    val capitals = listOf("London", "Rome", "Paris", "Madrid", "Brussels")
    for(capital in capitals){
        println(capital)
    }

    var  i = 100
    while(i > 0){
        i--
    }

    do{
        var x = 10
        x--
    } while (x > 10)

    loop@ for (i in 1..100){
        for(j in 1..100){
            if(j % i == 0){
                break@loop //this is not a GOTO!
                //continue => skip an iteration
            }
        }
    }


}