@file:JvmName("UtilityClass")
package be.kotlin.kotlincourse.interop

/**
 * Created by guyheylens on 17/04/17.
 */
val copyrightYear = 2016

fun prefix(prefix: String, value: String): String{
    return "$prefix-$value"
}