package be.kotlin.kotlincourse.functional

/**
 * Created by guyheylens on 17/04/17.
 */


//Closure use values declared outside of the lambda "number"
fun outsideFunction(){
    //val number = 10
    //unaryOperation(20, {x -> x + number})


    for(number in 1..20){
        unaryOperation(20, { x ->
            println(number)
            x + number
        })
    }
}

fun  unaryOperation(x: Int, op: (Int) -> Int) {

}

fun main(args: Array<String>) {
    outsideFunction()
}