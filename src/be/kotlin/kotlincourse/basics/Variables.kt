package be.kotlin.kotlincourse.basics

/**
 * Created by guyheylens on 10/04/17.
 */

fun main(args: Array<String>) {
    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 100
    val myLongAgain = myInt.toLong()

    val years = 10
    val messageYears = "A decade is $years years"

    val myCahar = 'A'
    val myString = "My String"

    val escapeCharacters = "A new line \n"
    val rawstring001 = "Hello"+
            "This is a second line" +
            "This is a third line"


    val multiLinestring = """
        This is a
        multiline string
        with triple
        quotes
        surrounding it
        """

    val myName = "Mary"
    val myNameLength = "The length of $myName is ${myName.length}"



}

class PersonaNonGrata(){
    var name: String = "this is a text"
        get() = field.toUpperCase()
        set(value) {
            field = "Name: $value"
        }
}

