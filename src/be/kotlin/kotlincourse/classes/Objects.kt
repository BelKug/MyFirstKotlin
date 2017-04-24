package be.kotlin.kotlincourse.classes

/**
 * Created by guyheylens on 12/04/17.
 */

//actually a singleton
object Global{
    val PI = 3.14
}

fun main(args: Array<String>) {

    val localObject = object {
        val PI = 3.14159
    }

    println(Global.PI)
    println(localObject.PI)

}