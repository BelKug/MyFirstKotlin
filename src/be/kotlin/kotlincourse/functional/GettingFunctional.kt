package be.kotlin.kotlincourse.functional

/**
 * Created by guyheylens on 17/04/17.
 *
 *
 *  Higher order functions
 */


fun operation(x: Int, y:Int, op:(Int, Int) -> Int): Int {

    return op(x, y)

}

fun sum(x: Int, y: Int) = x + y



fun main(args: Array<String>) {

    println(operation(1, 2, ::sum))
    //Same with Lambda :
    println(operation(1,2, {x, y -> x + y}))




}