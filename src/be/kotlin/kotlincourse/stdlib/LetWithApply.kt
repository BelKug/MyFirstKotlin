package be.kotlin.kotlincourse.stdlib

import java.io.File

/**
 * Created by guyheylens on 17/04/17.
 */
fun main(args: Array<String>) {
    val file = File("filename.txt")

    with(file){
        isFile
    }

    val string: String = "some value"

    string?.let {
        it.length
    }

}