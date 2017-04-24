package be.kotlin.kotlincourse.Inheritance

/**
 * Created by guyheylens on 16/04/17.
 */

//Any is the super class everything inherits from
class Customer: Any(){

}

//Adding "open" will make it possible to inherit from Person
open class Person(){
    open fun validate(){
    }
}

//Type is final and you can not inherit from a class Person
class CustomerBase: Person{
    final override fun validate(){
    }

    constructor(): super(){
    }
}

/*
class SpecialCustomer: CustomerBase(){
    override fun validate(){

    }
}
*/

fun main(args: Array<String>) {
    val customer = CustomerBase()
}


//Retriction removed in 1.1, before you could not inherit from another class when creating a data class => ORM persistance
data class CustomerEntity(val name: String) :Person()