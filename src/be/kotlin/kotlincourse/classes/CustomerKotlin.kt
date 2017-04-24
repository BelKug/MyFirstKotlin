package be.kotlin.kotlincourse.classes

import java.io.IOException

/**
 * Created by guyheylens on 12/04/17.
 */

//add and remove "data" before class and run the code to see the difference
data class CustomerKotlin (var id: Int, var name: String, var email: String){

    @JvmField val someField = "Value"

    override fun toString():String{
        return "{\"id\": \"$name\", \"name\": \"$name\"}"
    }

    @JvmOverloads fun changeStatus(status: Status = Status.Current){

    }


    @JvmName("Preferential") fun makePrefered(){

    }


    @Throws(IOException::class) fun loadStatistics(filename: String){
        if(filename == ""){
            throw IOException("Filename can not be empty")
        }
    }
}

fun extensions(customerKotlin: CustomerKotlin, message: String) {

}

enum class Status{ Current, Past}

data class OverrideCustomerKotlin(var id: Int, var name: String, var email: String){
    override fun toString(): String {
        //language=JSON
        return "{\"id\": \"$name\", \"name\": \"$name\"}"
    }
}


fun main(args: Array<String>) {
    val customerKotlin = CustomerKotlin(1, "Hadi", "test@kotlin.be")
    println(customerKotlin)
    println(customerKotlin.hashCode())

    //when data class you get a copy, hashcode, equals for free!
    val customer2 = customerKotlin.copy()
    println(customer2)
}