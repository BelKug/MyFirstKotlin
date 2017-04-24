package be.kotlin.kotlincourse.interop

import be.kotlin.kotlincourse.classes.CustomerJava

/**
 * Created by guyheylens on 17/04/17.
 */
fun main(args: Array<String>) {
    val customer = CustomerJava()
    customer.email = "board@kotlin.be"

    customer.prettyPrint()


    /*
    * Runnable is a Java interface. Through lambdas we are directly passing the println method.
    * */
    val runnable = Runnable {println("Invoking runnable")}


    val kr = KotlinRepo()
    val customerJava = kr.getById(10)
    customerJava.id


}

//inherit from Java
class PersonKotlin: PersonJava(){

}

class KotlinRepo: CustomerRepository{
    override fun getById(id: Int): CustomerJava {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}