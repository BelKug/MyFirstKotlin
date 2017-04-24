package be.kotlin.kotlincourse.nulls

import be.kotlin.kotlincourse.classes.CustomerJava

/**
 * Created by guyheylens on 16/04/17.
 */
fun main(args: Array<String>) {

    //This works:
    //val message = null
    //
    //Does not work:
    //val message: String = null


    //Nullables
    //val message: String? = null
    // if you try this: println(message.length)
    // compiler error
    // you should write: println(message?.length)
    // inferredNull = null

    val message: String = "A message"

    val nilly:String? = null

    println("Name " + message.length )

    //Double hashbang operator is telling compiler to continue without null checks => can cause nullreference exceptions at Runtime
    println("Null : " + nilly!!.length)


    //objects from Java
    val customerJava = CustomerJava()

    //try and catch the nulls in the tilted christmas tree
    if(customerJava != null){
        if(customerJava.name != null){
            println(customerJava.name.length)
        }
    }

    println("customerJava " + customerJava?.name?.length)




}