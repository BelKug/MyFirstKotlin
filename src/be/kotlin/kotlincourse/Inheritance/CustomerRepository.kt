package be.kotlin.kotlincourse.Inheritance

/**
 * Created by guyheylens on 16/04/17.
 */


interface CustomerRepository {
    val isEmpty: Boolean
        get() = true

    fun store(obj: Customer){
        //implement code to store => this is different from C# in C# not possible
        //in Java8 it is possible
    }
    fun getById(id: Int): Customer
}


class SqlCustomerRepository: CustomerRepository{
    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {
        super.store(obj)
        //or
        // interpretation of our own store and delete super.store(obj)
    }

    override val isEmpty: Boolean
        get() = false

}




interface Interface1 {
    fun funA(){
        println("Interface 1 says Hello")
    }
}

interface Interface2 {
    fun funA(){
        println("Interface 1 says Hello")
    }
}

class Class1and2: Interface1, Interface2{
    override fun funA() {
        println("Class1and2 funA")


        //refer with the super keyword
        //super<Interface2>.funA()
        //super<Interface1>.funA()
    }

}

fun main(args: Array<String>) {
    val c =Class1and2()
    c.funA() //which interface was called?


}