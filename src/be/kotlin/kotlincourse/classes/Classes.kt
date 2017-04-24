package be.kotlin.kotlincourse.classes

import java.util.*

/**
 * Created by guyheylens on 10/04/17.
 */

class Customer(var id: Int, var name: String) {

    //optional initialization eg. store the name as uppercase
    init {
        name.toUpperCase()
    }

    //secondairy constructor
    constructor(email:String): this(0, ""){

    }

}

//custom getters and setters
class Person(val id: Int, var name: String, val yearOfBirth: Int){
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if(!value.startsWith("SN")){
                throw IllegalArgumentException("Social security number should start with SN")
            }
            //field (reserved word) is the backing field of the property
            field = value
        }

    //function in a class
    fun personAsString(){
        println("Id: $id - Name: $name - Birthdate: $yearOfBirth ")
    }
}

fun main(args: Array<String>) {
    val customer = Customer(0, "")
    customer.id = 10
    customer.name = "Guy"

    val person = Person(1, "Guy", 1971)
    println(person.name)
    println(person.age)
    person.personAsString()
}