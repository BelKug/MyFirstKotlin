package be.kotlin.kotlincourse.Tidbits

import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader

/**
 * Created by guyheylens on 17/04/17.
 */
class NotANumberException(message: String): Throwable(message) {

}

fun chkIsNumber(obj: Any){
    when (obj){
        !is Int, Long, Float, Double -> throw NotANumberException("It was not a number")
    }
}


fun main(args: Array<String>) {

    try {

        chkIsNumber(12)
        println("Number")

    } catch(e: NotANumberException) {
        println("It was not a number")
    }

    try {

        chkIsNumber("A")
        println("NAN")

    } catch(e: NotANumberException) {
        println("${e.message}")
    }

    val buffer = BufferedReader(FileReader("input.txt"))
    try {

        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    }catch (e: IndexOutOfBoundsException){
        println("Exception handled")
    }
    finally {
        println("Closing")
        buffer.close()
    }


}